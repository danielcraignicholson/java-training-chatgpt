package com.github.danielcraignicholson.oop.library;

public class Main {

  public static void main(String[] args) {

    LibraryItem[] libraryItems = new LibraryItem[3];
    libraryItems[0] = new Book("Shantaram", "Gregory David Roberts", 2003, 936);
    libraryItems[1] = new EBook("The Life-Changing Magic of Tidying Up", "Marie Kondo", 2001, 0.75);
    libraryItems[2] =
        new AudioBook(
            "Harry Potter and the Philosopher's Stone", "J.K. Rowling", 2015, 505, "Stephen Fry");

    for (LibraryItem item : libraryItems) {
      System.out.println(item);
      item.checkout();

      if (item instanceof Downloadable) {
        ((Downloadable) item).download();
      }
    }

    libraryItems[0].checkout();
    libraryItems[0].returnItem();
  }
}
