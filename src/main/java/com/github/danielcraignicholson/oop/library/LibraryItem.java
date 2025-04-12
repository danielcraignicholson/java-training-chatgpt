package com.github.danielcraignicholson.oop.library;

public abstract class LibraryItem {

    private String title;
    private String author;
    private int yearPublished;

    public LibraryItem(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public abstract void checkout();

    @Override
    public String toString() {
        return title + " by " + author + " published in " + yearPublished;
    }

}
