package guide6b.Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonCrud {
    public static Map<String, Person> personMap = new HashMap<>();

    public static Map<String, Person> create () {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String dni = sc.nextLine();
        Integer age = sc.nextInt();

        add(new Person(name,dni,age));
        return personMap;
    }

    public static Map<String, Person> read () {
        return personMap;
    }
    public static Map<String, Person> update () {
        return null;
    }

    public static Map<String, Person> delete () {
        return null;
    }
    public static Map<String, Person> add(Person person) {
        personMap.put(person.getDni(), person);
        return personMap;
    }

    public static Map<String, Person> addList(List<Person> list) {

        list.forEach(person -> personMap.put(person.getDni(),person));
        return personMap;
    }

}
