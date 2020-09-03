package ru.mirea.ikbo_01_19;

public class Book {
    private String publishDate;
    private String bookTitle;
    private int bookCost; //rubls

    public String to_String() {
        return publishDate + " " + bookTitle + " " + bookCost;
    }

    public Book () {
        this.publishDate = "";
        this.bookTitle = "";
        this.bookCost = 0;
    }
    public Book (int bookCost, String bookTitle, String publishDate) {
        this.bookCost = bookCost;
        this.bookTitle = bookTitle;
        this.publishDate = publishDate;
    }

    public int getBookCost() {
        return bookCost;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate= publishDate;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookCost(int bookCost) {
        this.bookCost= bookCost;
    }
}
