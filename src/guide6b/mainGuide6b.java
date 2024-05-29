package guide6b;

import guide6b.Models.Person;
import guide6b.Models.PersonCrud;

import javax.imageio.stream.IIOByteBuffer;
import java.util.*;

public class mainGuide6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("--------------------EXERCISE 1--------------------------------");
//        String text;
//        System.out.print("Introduce a text : ");
//        text = sc.nextLine();
//        Map<Character, Integer> letterCountMap;
//        letterCountMap = letterCount(text);
//        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
//            System.out.println(entry);
//        }
//        System.out.println("--------------------EXERCISE 2--------------------------------");
//        List<Integer> randomNumList = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            randomNumList.add(4);
//            randomNumList.add((int)(Math.random() * 100));
//        }
//        System.out.println(randomNumList);
//        Set<Integer> uniqueNumSet = new HashSet<>(randomNumList);
//        System.out.println(uniqueNumSet);
//        System.out.println("--------------------EXERCISE 3--------------------------------");
//        Map<Integer,List<String>> ageNameMap = new TreeMap<>();
//        for(int i = 0 ; i < 5 ; i++) {
//            System.out.print("Name: ");
//            String name = sc.nextLine();
//            System.out.print("Age: ");
//            Integer age = sc.nextInt();
//            sc.nextLine();
//            if(!(ageNameMap.containsKey(age))) {
//                ageNameMap.put(age,new ArrayList<>());
//                ageNameMap.get(age).add(name);
//            }
//            else
//                ageNameMap.get(age).add(name);
//        }
//        System.out.println(ageNameMap);
//        System.out.println("--------------------EXERCISE 4--------------------------------");
//        List<Integer> numList = Arrays.asList(2,3,41,12,34,5,3,1,2,6,3,3,5,22,23,34,62,10);
//        Map<Integer,Integer> numFrequencyMap = new HashMap<>();
//        for(Integer i : numList) {
//            numFrequencyMap.put(i,numFrequencyMap.getOrDefault(i,0) + 1);
//        }
//
//        numList = numList.stream()
//                         .distinct()
//                         .map(num -> num * numFrequencyMap.get(num))
//                         .toList();
//
//        Double average = numList.stream()
//                        .mapToDouble(Integer::intValue)
//                        .sum() / 18;
//
//        System.out.println(average);
//        System.out.println("--------------------EXERCISE 5--------------------------------");
//        List<Integer> numberList = Arrays.asList(1, 5, 2, 6, 23, 64, 3, 2, 3, 5, 6, 19);
//        Set<Integer> numberSet = new TreeSet<>(numberList);
//        System.out.println(numberSet.stream().toList().reversed());// ********
        System.out.println("--------------------EXERCISE 6--------------------------------");

        Person p = new Person("Tadeo", "46112406", 19);
        Person p1 = new Person("Miguel", "3028883", 20);
        Person p2 = new Person("Juan", "20300720", 56);
        Person p3 = new Person("Francisco", "3936663", 23);


        List<Person> personList = Arrays.asList(p, p1, p3);

        PersonCrud.create();
        PersonCrud.add(p2);
        PersonCrud.addList(personList);
        System.out.println(PersonCrud.read());

        p1.setAge(98);
        PersonCrud.update(p1);
        System.out.println(PersonCrud.read());

        System.out.println(PersonCrud.orderedByAge());

    }

//    public static Map<Character, Integer> letterCount(String str) {
//        Map<Character, Integer> letterCountMap = new HashMap<>();
//
//        for (Character c : str.toCharArray()) {
//            letterCountMap.put(c, letterCountMap.getOrDefault(c, 0) + 1);
//        }
//        return letterCountMap;
//    }
}
