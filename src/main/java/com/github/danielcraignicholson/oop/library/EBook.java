package com.github.danielcraignicholson.oop.library;

public class EBook extends LibraryItem implements Downloadable {

    private final double fileSizeMB;

    public EBook(String title, String author, int yearPublished, double fileSizeMB) {
        super(title, author, yearPublished);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public void checkout() {
        System.out.println("E-Book checked out: " + getTitle());
    }

    @Override
    public void download() {
        System.out.println("Downloading " + getTitle() + "... File size: " + fileSizeMB + " MB");
    }
}
