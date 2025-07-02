class NoteRepository(private val dao: NoteDao) {
    val allNotes = dao.getAllNotes()

    suspend fun insert(note: Note) = dao.insert(note)
    suspend fun delete(note: Note) = dao.delete(note)
}
