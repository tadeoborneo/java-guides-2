package guide6b.Models;

import java.util.*;

public class PersonCrud {
    public static Map<String, Person> personMap = new HashMap<>();

    public static Person create() {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Name: ");
            String name = sc.nextLine();
            if(name.chars().anyMatch(Character::isDigit))
                throw new IllegalArgumentException("The name mustn't contain numbers");
            System.out.print("Dni: ");
            String dni = sc.nextLine();
            System.out.print("Age: ");
            Integer age = sc.nextInt();
            Person p = new Person(name, dni, age);
            add(p);
            return p;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Map<String, Person> read() {
        return personMap;
    }


    public static Map<String, Person> update(Person newPerson) {
        personMap.replace(newPerson.getDni(), newPerson);
        return personMap;
    }

    public static Map<String, Person> delete(Person person) {
        if (personMap.containsValue(person))
            personMap.remove(person.getDni(), person);
        return personMap;
    }

    public static Map<String, Person> add(Person person) {
        personMap.put(person.getDni(), person);
        return personMap;
    }

    public static Map<String, Person> addList(List<Person> list) {

        list.forEach(person -> personMap.put(person.getDni(), person));
        return personMap;
    }

    public static Map<Integer, List<Person>> orderedByAge() {
        Map<Integer, List<Person>> orderedByAgeMap = new TreeMap<>();
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {

            Integer age = entry.getValue().getAge();
            Person person = entry.getValue();

            if (!orderedByAgeMap.containsKey(age)) {
                orderedByAgeMap.put(age, new ArrayList<>());
                orderedByAgeMap.get(age).add(person);
            } else {
                orderedByAgeMap.get(age).add(person);
            }
        }
        return orderedByAgeMap;
    }

}
