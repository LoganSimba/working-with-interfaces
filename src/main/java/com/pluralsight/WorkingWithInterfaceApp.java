package com.pluralsight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class WorkingWithInterfaceApp {
    public static void main(String[] args) {
        //create arraylist holding person
        List<Person> myFamily = new ArrayList<>();
        //add Person objects to the arraylist
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Zachary", "Westly", 31));
        myFamily.add(new Person("Elisha", "Aslan", 14));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Ezra", "Aiden", 17));

        //iterate throught the unsorted arraylist and print
        for (Person person : myFamily) {
            System.out.println(person.toString());
        }
        System.out.println("===========");
        //use Collections to sort the arrayList
        Collections.sort(myFamily);
        //iterate throught the sorted arraylist and print
        for (Person person : myFamily) {
            System.out.println(person.toString());
        }

    }


}
