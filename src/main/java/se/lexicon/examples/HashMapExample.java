package se.lexicon.examples;

import se.lexicon.model.Person;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    private Map<Integer, Person> personMap = new HashMap<>();

    public void example(){

        Person person1 = new Person(1, "Erik", "Svensson", false);
        Person person2 = new Person(2, "Anna", "Andersson", true);
        Person person3 = new Person(3, "Tony", "Granath", false);

        personMap.put(person1.getId(), person1);
        personMap.put(person2.getId(), person2);
        personMap.put(person3.getId(), person3);

        loopExample2();
        System.out.println(findById(3));
    }

    public void loopExample(){
        for(Map.Entry<Integer, Person> entry : personMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void loopExample2(){
        for(int key : personMap.keySet()){
            System.out.println(key + " : " + personMap.get(key));
        }
    }

    public Person findById(int id){
        return personMap.get(id);
    }



}
