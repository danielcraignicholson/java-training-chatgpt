package com.github.danielcraignicholson.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GuestListManager {

    public static void main(String[] args){

        List<String> guestList = new ArrayList<>();
        guestList.add("Amy");
        guestList.add("John");
        guestList.add("Li");
        guestList.add("Zoe");
        guestList.add("Chris");

        int removedCount = 0;
        Iterator<String> iterator = guestList.iterator();
        while(iterator.hasNext()) {
            String guest = iterator.next();
            if(guest.length() < 4) {
                iterator.remove();
                removedCount++;
            }
        }

        System.out.println("Cleaned guest list: " + guestList);
        System.out.println("Removed " + removedCount + " short names.");

    }

}
