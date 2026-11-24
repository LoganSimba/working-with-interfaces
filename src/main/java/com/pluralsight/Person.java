package com.pluralsight;

public class Person implements Comparable<Person> {
    //attributes
    private String firstName;
    private String lastName;
    private int age;

    //constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //compareTo method that implements the comparable<Person>
    @Override
    public int compareTo(Person other) {
        int result = this.lastName.compareTo(other.getLastName());
        //if the last names compared are not equal
        if (result != 0) {//result == 0 means they are equal
            return result;
        }
        //compare by first name
        result = this.firstName.compareTo(other.getFirstName());
        //if the names are not equal
        if (result != 0) { //result == 0 means they are equal
            return result;
        }
        result = Integer.compare(this.age, other.age);//compare by age
        return result;

    }

    @Override
    public String toString() {
        return firstName + ", " +
                lastName + ", " + age;
    }
}
