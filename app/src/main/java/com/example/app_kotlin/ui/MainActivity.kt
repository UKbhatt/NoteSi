class MainActivity : AppCompatActivity() {

    private lateinit var noteViewModel: NoteViewModel
    private lateinit var adapter: NotesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        noteViewModel = ViewModelProvider(this)[NoteViewModel::class.java]
        adapter = NotesAdapter { note -> noteViewModel.delete(note) }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        noteViewModel.allNotes.observe(this) {
            adapter.submitList(it)
        }

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { showAddNoteDialog() }
    }

    private fun showAddNoteDialog() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_add_note, null)
        val dialog = AlertDialog.Builder(this)
            .setView(dialogView)
            .setPositiveButton("Save", null)
            .setNegativeButton("Cancel", null)
            .create()

        dialog.setOnShowListener {
            val saveBtn = dialog.getButton(AlertDialog.BUTTON_POSITIVE)
            saveBtn.setOnClickListener {
                val title = dialogView.findViewById<EditText>(R.id.etTitle).text.toString()
                val content = dialogView.findViewById<EditText>(R.id.etContent).text.toString()

                if (title.isNotEmpty()) {
                    val note = Note(title = title, content = content)
                    noteViewModel.insert(note)
                    dialog.dismiss()
                } else {
                    Toast.makeText(this, "Title required", Toast.LENGTH_SHORT).show()
                }
            }
        }

        dialog.show()
    }
}
