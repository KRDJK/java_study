package day19.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> pList = new ArrayList<>();
        pList.add(new Person("송철수", 33));
        pList.add(new Person("박영희", 41));
        pList.add(new Person("차범근", 11));
        pList.add(new Person("김송희", 21));


        // 나이 순으로 오름차 정렬 (나이 적은 순)
//        pList.sort(new AgeAscendingComparator());

        /*pList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        
        // 나이 오름차
        pList.sort((o1, o2) -> o1.getAge() - o2.getAge());


        // 나이 내림차
        pList.sort((o1, o2) -> o1.getAge() - o2.getAge());


        // 이름 오름차
//        pList.sort(new NameAscendingComparator());
        /*pList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        pList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        for (Person person : pList) {
            System.out.println(person);
        }

    } // end main
} // end class
