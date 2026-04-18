package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;

    private boolean isCheckedOut;
    private String checkedOutTo;

    public static Book[] booksList = new Book[20];


    public Book(){

    }

    public Book(String title, String isbn, int id, boolean isCheckedOut){
        this.title = title;
        this.isbn = isbn;
        this.id = id;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = "";
    }

    public Book(String title, String isbn, int id, boolean isCheckedOut, String checkedOutTo){
        this.title = title;
        this.isbn = isbn;
        this.id = id;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
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


    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkOutTo) {
        this.checkedOutTo = checkOutTo;
    }

    public void checkIn(String name){

    }


}
