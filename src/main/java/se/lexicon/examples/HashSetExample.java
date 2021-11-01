package se.lexicon.examples;

import se.lexicon.model.Person;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public void example(){
         Set<Person> personSet = new HashSet<>(
                 Arrays.asList(new Person("Karmand", "Aziz", false))
         );

         System.out.println(personSet);
    }

}
