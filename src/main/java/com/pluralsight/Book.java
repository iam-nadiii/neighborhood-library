package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;

    public static Book[] booksList = new Book[6];

    public Book(){

    }

    public Book(String title, String isbn, int id, boolean isCheckedOut){
        this.title = title;
        this.isbn = isbn;
        this.id = id;
        this.isCheckedOut = isCheckedOut;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public void setIsCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public void checkIn(String name){

    }




}


//Neighborhood Library
//Student Workshop 2w
//Version 7.1 Y
//2
//Project Description
//You will build an application for your Neighborhood Library. The library is
//a free service to anyone in your neighborhood and is based on the honor
//system. Anyone can check out a book, they just enter their name and the
//application will track who checked it out.
//Create a new Github repository named neighborhood-library.
//        Remember: When creating a new Java project, create a new git repository
//and commit your changes often! Don’t forget to push to github.com.
//Always share your IntelliJ project to GitHub!
//Read all project requirements before you begin to code. Use your
//notebook to design and plan your project.
//Remember to commit and push your code frequently
//3
//Requirements


//• Create a Book class with appropriate getters, setters, constructors and methods.
//The class should have the following properties:
//o Properties
//- id: int
//- isbn: String
//- title: String

//- isCheckedOut: boolean
//- checkedOutTo: String
//o Methods
//- checkOut(name)
//- checkIn()

//• Use an array to hold an inventory of at least 20 books of your choice

//• When a book is checked out
//o the books checkedOutTo variable should be set to the name provided
//o the isCheckedOut variable should be set to true


//        • When a book is checked in
//o the books checkedOutTo variable should be set to ""
//o the isCheckedOut variable should be set to false

//Screens
//• The Store Home Screen - The home screen should display a list of options that a
//user can choose from.
//o Show Available Books
//o Show Checked Out Books
//o Exit - closes out of the application

//• Show Available Books - Displays a list of all books that are not currently checked
//out. Display the Id, ISBN and Title of the book.
//o Prompt the user to either select a book to check out, or exit to go back to
//the home screen
//o If the user wants to check out a book, prompt them for their name
//o Then check out the book

//• Show Checked Out books - This displays a list of all the books that are currently
//checked out. Display the Id, ISBN, Title and Name of the person who has the book
//checked out. Prompt the user to
//o C - to Check In a book
//o X - to go back to the home screen


//• Check In a book - Prompt the user for the ID of the book they want to check in.
//o Check in the book with the specified id
//o Go back to the home screen


//4
//What Makes a Good Workshop Project?
//        • You should:
//        − Have a clean and intuitive user interface (give the user clear
//instructions on each screen)
//        • You should adhere to best practices such as:
//        − Create a Java Project that follows the Maven folder structure
//− Create appropriate Java packages and classes
//− Class names should be meaningful and follow proper naming
//conventions (PascalCase)
//− Use good variable naming conventions (camelCasing, meaningful
//        variable names)
//− Your code should be properly formatted easy to understand
//− use Java comments effectively
//• Make sure that:
//        − Your code is free of errors and that it compiles and runs
//Your GitHub Repo must be set to public visibility
//− Include a README.md file that describes your project