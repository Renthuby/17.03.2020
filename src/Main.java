import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.DoubleToIntFunction;

public class Main {
    static TreeSet<String> treeSet = new TreeSet<>();
    static SortedSet<String> sortedSet = treeSet.subSet("А", "я");
    static Comparator<People> pcomp =
            new PersonComparator()
            .thenComparing(new PeopleAgeComparator())
            .thenComparing(new PeopleHeightComparator());
    static TreeSet<People> people = new TreeSet<>(pcomp);

    public static void main(String[] args) {

        treeSet.add("Павлодар");
        treeSet.add("Кемерово");
        treeSet.add("Москва");
        treeSet.add("Ухань");
        treeSet.add("Ачинск");
        treeSet.add("Тюмень");
        treeSet.add("Якутия");


//        System.out.println(treeSet);

        System.out.println("Коронавирус обнаружен:");

        for (String s :
                treeSet) {
            if (s.charAt(0) <= 'М');
            //System.out.println(s.charAt(0) + "-" + s.charAt(s.length() - 1));
        }

        System.out.println(sortedSet);

        people.add(new People("Иван", 25, 180));
        people.add(new People("Степан", 16, 18));
        people.add(new People("Степан", 20, 200));
        people.add(new People("Степан", 20, 150));
        people.add(new People("Алексей", 23, 100));

        for (People p:
             people) {
            System.out.println(p);
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Россия");
        map.put(2, "сША");
        map.put(3, "Германия");
        map.put(4, "Италия");
        map.put(5, "Испания");
        map.put(10, "Европа");
        map.put(6, "Китай");

        System.out.println(map);
        System.out.println(map.containsKey(10));
        System.out.println(map.get(3));

        System.out.println("-----------------------------------------");
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

        Set<Integer> key = map.keySet();
        System.out.println(key);
        Collection<String> val = map.values();
        System.out.println(val);

        Map<String, String> country = new HashMap<>();
        country.put("Москва", "Россия");
        country.put("НУР-СУЛТАН", "Казахстан");
        country.put("Вашингтон", "США");
        System.out.println(country);

        for (Map.Entry<String, String> item : country.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

        //  test
        Map<String, People> mapPeople = new HashMap<>();
        mapPeople.put("\"+7-913-123-45-67\" ", new People("Паша", 30, 178));
        mapPeople.put("\"+7-913-123-45-65\" ", new People("Толя", 20, 178));
        mapPeople.put("\"+7-913-123-45-63\" ", new People("Саня", 40, 178));

        for (Map.Entry<String, People> item : mapPeople.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

    }
}
