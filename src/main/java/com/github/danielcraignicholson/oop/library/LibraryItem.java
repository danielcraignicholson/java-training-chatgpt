package com.github.danielcraignicholson.oop.library;

public abstract class LibraryItem {

  private String title;
  private String author;
  private int yearPublished;
  private Status status;

  public LibraryItem(String title, String author, int yearPublished) {
    this.title = title;
    this.author = author;
    this.yearPublished = yearPublished;
    status = Status.AVAILABLE;
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

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public abstract void checkout();

  public void returnItem() {
    setStatus(Status.AVAILABLE);
    System.out.println("Book returned: " + getTitle() + " by " + getAuthor());
  }

    @Override
  public String toString() {
    return title + " by " + author + " published in " + yearPublished;
  }
}
