package day19.comparator;

import java.util.Comparator;

public class NameAscendingComparator implements Comparator<Person> { // 사람으로 비교할거잖아 그러니까 <Person>

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
        // 아스키 코드 값을 비교해서 o1이 더 작으면 음수를 리턴
    }

}
