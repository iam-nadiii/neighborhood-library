# 📚 Neighborhood Library Application

## 📌 Overview
This is a Java console-based application that simulates a **Neighborhood Library system**.  
Users can view available books, check out books, and check in books using a simple menu interface.

The system is based on an **honor system**, where users enter their name when checking out a book.

---

## 🚀 Features
- View all available books
- View all checked-out books
- Check out a book using title
- Check in a book using ID
- Tracks who has each book

---

## 🏗️ Technologies Used
- Java
- Object-Oriented Programming (OOP)
- Arrays
- Scanner (user input)

---

## 📖 Book Class

### Properties
- `id` – unique identifier
- `isbn` – ISBN number
- `title` – book title
- `isCheckedOut` – boolean status
- `checkedOutTo` – name of borrower

### Constructors
- Default constructor
- Constructor without `checkedOutTo`
- Constructor with all fields

---

## 🖥️ Application Flow

### Main Menu

---

### 📚 Show Available Books
- Displays books that are **not checked out**
- User can:
  - Check out a book
  - Return to main menu

#### ✔ Checkout Process
- Enter book title
- Enter your name
- System updates:
  - `isCheckedOut = true`
  - `checkedOutTo = your name`

---

### 📕 Show Checked Out Books
- Displays all checked-out books
- Shows:
  - Title
  - ISBN
  - ID
  - Checked out to

#### ✔ Check-In Process
- Enter book ID
- System updates:
  - `isCheckedOut = false`
  - `checkedOutTo = ""`

---

## 📦 Sample Data
The application initializes with **20 books** in an array.

---

## ⚠️ Known Limitations
- Title search is case-sensitive
- No validation for incorrect input
- Users can check out already checked-out books
- Uses fixed-size array (not dynamic)

---

## 🔧 Future Improvements
- Replace array with `ArrayList`
- Add input validation
- Improve search (case-insensitive / by ID)
- Prevent duplicate checkouts
- Add file storage (save/load library data)
- Improve UI formatting

---

## 🧑‍💻 Author
Created as part of a **Java Workshop Project (Neighborhood Library)**

---
