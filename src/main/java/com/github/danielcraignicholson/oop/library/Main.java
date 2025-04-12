package com.github.danielcraignicholson.oop.library;

public class Main {

    public static void main(String[] args) {

        LibraryItem[] libraryItems = new LibraryItem[2];
        libraryItems[0] = new Book("Shantaram", "Gregory David Roberts", 2003, 936);
        libraryItems[1] = new EBook("The Life-Changing Magic of Tidying Up", "Marie Kondo", 2001, 0.75);

        for(LibraryItem item : libraryItems) {
            System.out.println(item);
            item.checkout();

            if(item.getClass() == EBook.class) {
                ((EBook) item).download();
            }
        }

    }

}
