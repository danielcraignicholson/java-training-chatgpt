package com.github.danielcraignicholson.oop.library;

public class Book extends LibraryItem {

    private final int pages;

    public Book(String title, String author, int yearPublished, int pages) {
        super(title, author, yearPublished);
        this.pages = pages;
    }

    @Override
    public void checkout() {

        if (getStatus() == Status.CHECKED_OUT) {
            System.out.println("Item already checked out");
        } else {
            setStatus(Status.CHECKED_OUT);
            System.out.println("Book checked out: " + getTitle() + " by " + getAuthor() + " with " + pages + " pages");
        }
    }

}
