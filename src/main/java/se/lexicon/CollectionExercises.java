package se.lexicon;

import java.util.*;

public class CollectionExercises {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
//        ex7();
//        ex8();
//        ex9();
//        ex10();
//        ex11();
//        ex12();
//        challenge1();
//        challenge2();
//        challenge3();
        challenge4();
    }
    public static void ex1() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        System.out.println("Ex 1: " + daysOfWeek);
    }

    public static void ex2() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        for (String day : daysOfWeek) {
            System.out.println("Ex 2: " + day);
        }
    }

    public static void ex3() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        daysOfWeek.add(3, "Thursday");
        System.out.println("Ex 3: " + daysOfWeek);
    }

    public static void ex4() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        List<String> subList = daysOfWeek.subList(0, 3);
        System.out.println("Ex 4: " + subList);
    }

    public static void ex5() {
        Set<String> daysOfWeek = new LinkedHashSet<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        System.out.println("Ex 5: " + daysOfWeek);
    }

    public static void ex6() {
        Set<String> daysOfWeek = new HashSet<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        List<String> daysList = new ArrayList<>(daysOfWeek);
        System.out.println("Ex 6: " + daysList);
    }

    public static void ex7() {
        Set<String> names = new HashSet<>();
        names.add("Cissi");
        names.add("Alice");
        names.add("David");
        names.add("Bob");

        List<String> namesList = new ArrayList<>(names);
//        Collections.sort(namesList);
        System.out.println("Ex 7: " + namesList);
    }

    public static void ex8() {
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Cissi");
        names.add("Bob");
        names.add("David");

        Set<String> sortedNames = new TreeSet<>(names);
        System.out.println("Ex 8: " + sortedNames);
    }

    public static void ex9() {
        Map<Integer, String> carMap = new HashMap<>();
        carMap.put(1, "Toyota");
        carMap.put(2, "Polestar");
        carMap.put(3, "Ford");
        carMap.put(4, "Volvo");
        System.out.println(carMap);
    }

    public static void ex10() {
        Map<Integer, String> carMap = new HashMap<>();
        carMap.put(1, "Toyota");
        carMap.put(2, "Polestar");
        carMap.put(3, "Ford");
        carMap.put(4, "Volvo");

        Set<Integer> keys = carMap.keySet();
        System.out.println(keys);
    }

    public static void ex11() {
        Map<Integer, String> carMap = new HashMap<>();
        carMap.put(1, "Toyota");
        carMap.put(2, "Polestar");
        carMap.put(3, "Ford");
        carMap.put(4, "Volvo");

        Collection<String> values = carMap.values();
        System.out.println(values);
    }

    public static void ex12() {
        Map<Integer, Car> carMap = new HashMap<>();
        carMap.put(1, new Car(1, "Toyota", "MR2"));
        carMap.put(2, new Car(2, "Polestar", "2"));
        carMap.put(3, new Car(3, "Ford", "Focus"));
        carMap.put(4, new Car(4, "Volvo", "XC60"));

        for (Car car : carMap.values()) {
            System.out.println(car.getBrand());
        }
    }
    public static void challenge1() {
        Set<String> allDaysOfWeek = new HashSet<>(Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        Set<String> weekendDays = new HashSet<>(Arrays.asList("Saturday", "Sunday"));

        allDaysOfWeek.retainAll(weekendDays);
        System.out.println(allDaysOfWeek);
    }

    public static void challenge2() {
        Map<String, String> emailToName = new HashMap<>();
        emailToName.put("alice@example.se", "Alice");
        emailToName.put("bob@example.se", "Bob");
        emailToName.put("cissi@example.se", "Cissi");

        Set<String> emails = emailToName.keySet();
        System.out.println(emails);
    }

    public static void challenge3() {
        List<SuperHero> heroes = new ArrayList<>();
        heroes.add(new SuperHero(1, "Superman", 30));
        heroes.add(new SuperHero(2, "Batman", 35));
        heroes.add(new SuperHero(3, "Spider-Man", 25));

        Collections.sort(heroes);
        System.out.println(heroes);
    }

    public static void challenge4() {
        int[] intArray = {1, 4, 4, 2, 6, 7};
        Collection<Integer> intCollection = new HashSet<>(Arrays.asList(1, 4, 4, 2, 6, 7));
        System.out.println(intCollection);
    }
}