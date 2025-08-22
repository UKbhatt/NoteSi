# 📸 SocialProject – Django Photo Sharing App  

![Django](https://img.shields.io/badge/Django-3.x-green?logo=django) ![SQLite](https://img.shields.io/badge/Database-SQLite-blue?logo=sqlite) ![TailwindCSS](https://img.shields.io/badge/Style-TailwindCSS-38B2AC?logo=tailwind-css) ![Auth](https://img.shields.io/badge/Auth-Django%20Auth-yellow?logo=lock)


## 🌟 Overview
**SocialProject** is a mini **photo-sharing social media app** built with **Django** and **TailwindCSS**.  
Users can register, log in, upload profile photos, view posts, and manage passwords with a clean UI.

---

## ✨ Features
✅ User Registration & Login  
✅ Profile with Photo Upload  
✅ View Posts on Dashboard  
✅ Edit Profile Details  
✅ Password Change & Reset (Email Link)  
✅ Logout & Session Handling  
✅ TailwindCSS UI  

---

## 📂 Project Structure

```bash
socialproject/
│── manage.py
│── db.sqlite3
│── package.json
│── package-lock.json
│
├── users/ # User app
│ ├── views.py # Login, register, edit, dashboard
│ ├── models.py # Profile model
│ ├── forms.py # Login, registration, edit forms
│ ├── urls.py # Auth routes
│ ├── templates/users/ # HTML templates
│ └── static/users/ # CSS, images
│
├── posts/ # (Posts app - not fully shown here)
│
└── socialproject/ # Main Django project settings
```


---

## ⚡️ Tech Stack
- **Backend**: 🐍 Django 3.x (Python)  
- **Frontend**: 🎨 TailwindCSS 2.x  
- **Database**: 🗄 SQLite  
- **Auth**: 🔐 Django Authentication System  

---

## 🚀 Getting Started

1️⃣ Clone the repo
```bash
git clone https://github.com/your-username/socialproject.git
cd socialproject
```
2️⃣ Setup Virtual Environment
```bash
python -m venv venv
venv\Scripts\activate   # On Windows
source venv/bin/activate # On Linux/Mac
```

3️⃣ Install Dependencies
```bash
pip install -r requirements.txt
```

4️⃣ Setup TailwindCSS
```bash
npm install
npm run build
```

5️⃣ Run Migrations
```bash
python manage.py migrate
```

6️⃣Start Development Server
```bash
python manage.py runserver
```
👉 Visit: http://127.0.0.1:8000/

---

## 🔑 User Flow

1.📝 Register → Create account + profile <br>
2.🔑 Login → Start session<br>
3.🏠 Dashboard → View posts + profile photo<br>
4.✏️ Edit Profile → Update details & photo<br>
5.🔒 Password Change / Reset → Secure auth handling<br>
6.🚪 Logout → End session

---

## 🛠 Future Enhancements
🌍 Public feed for all users<br>
❤️ Like & Comment system<br>
📩 Email notifications<br>

---

## 🤝 Contributing

Pull requests are welcome! For major changes, open an issue first to discuss what you’d like to change.
