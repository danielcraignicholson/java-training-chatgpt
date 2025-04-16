package com.github.danielcraignicholson.oop.library;

public class AudioBook extends LibraryItem implements Downloadable {

  private int durationMinutes;
  private String narrator;

  public AudioBook(
      String title, String author, int yearPublished, int durationMinutes, String narrator) {
    super(title, author, yearPublished);
    this.durationMinutes = durationMinutes;
    this.narrator = narrator;
  }

  @Override
  public void checkout() {
    System.out.println("Audiobook checked out: " + getTitle() + " narrated by " + narrator);
  }

  @Override
  public void download() {
    System.out.println(
        "Downloading audiobook: " + getTitle() + " – Duration: " + durationMinutes + " minutes");
  }
}
