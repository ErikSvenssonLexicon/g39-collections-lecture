package se.lexicon.examples;

import se.lexicon.model.Person;

import java.util.*;

public class ArrayListExample {

    public void example(){
        List<Person> arrayList = new ArrayList<>(Arrays.asList(
                new Person("Erik", "Svensson", false),
                new Person("Erik", "Alfredsson", false),
                new Person("Karmand", "Svensson", false),
                new Person("Karmand", "Svennesson", false),
                new Person("Tony", "Granath", false)
        ));

        arrayList.add(new Person("Basel", "Askar", false));

        Collections.sort(arrayList);
        loopExample(arrayList);

    }

    public void loopExample(List<Person> personList){
        for(Person person : personList){
            System.out.println(person);
        }
    }

}
