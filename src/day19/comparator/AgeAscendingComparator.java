package day19.comparator;

import java.util.Comparator;

// Person의 나이 오름차 정렬을 위한 비교 객체
public class AgeAscendingComparator implements Comparator<Person> {

    /**
     * 첫번째 o1과 두번째 o2가 같다면 0을 리턴
     * o1이 o2보다 앞에가게 하려면 음수를 리턴
     * o1이 02보다 뒤에가게 하려면 양수를 리턴
     * 
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Person o1, Person o2) {
        /*if (o1.getAge() < o2.getAge()) return -1;
        else if (o1.getAge() == o2.getAge())  return 0;
        else return 1;*/

        return o2.getAge() - o1.getAge();
    }
}
