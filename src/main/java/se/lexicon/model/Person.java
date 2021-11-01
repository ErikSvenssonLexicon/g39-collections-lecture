package se.lexicon.model;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private int id;
    private String firstName;
    private String lastName;
    private boolean female;

    public Person(int id, String firstName, String lastName, boolean female) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.female = female;
    }

    public Person(String firstName, String lastName, boolean female) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.female = female;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return female == person.female && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, female);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", female=" + female +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int i = this.lastName.toLowerCase().compareTo(o.getLastName().toLowerCase());
        if(i == 0){
            i = this.firstName.toLowerCase().compareTo(o.getFirstName().toLowerCase());
        }
        return i;
    }
}
