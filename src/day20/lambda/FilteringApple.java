package day20.lambda;

import java.util.ArrayList;
import java.util.List;

import static day20.lambda.Apple.*;
import static day20.lambda.Apple.Color.*;

public class FilteringApple {

    /**
     * @solution try1 -  사과리스트에서 녹색 사과들만 필터링 해주세요.
     * problem
     * - 만약 빨간색 사과를 필터링하고 싶다면??
     * - filterRedApples를 또 만들거냐??
     * - 색깔이 더 다양하다면????
     */

    public static List<Apple> filterGreenApples(List<Apple> inventory) {

        List<Apple> resultList = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getColor() == GREEN) { // enum은 ==비교 하면 된다. String이 아니라서!!
                resultList.add(apple);
            }
        }

        return resultList;
    }


    /**
     * solution - try2 : 색을 파라미터화 한다.
     * @problem
     *  - 만약 필터기준이 색상이 아니라 무게라면??
     *  - 무게 파라미터를 가진 메서드 filterApplesByWeight를 만들건가??
     *  - 만약 필터기준이 색상 + 무게
     *  - 어차피 조건문 빼고 코드가 똑같을거 같은데?? 매번 조금씩 달라지는 필터조건에 따라 만들건가..?
     */

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {


        List<Apple> resultList = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getColor() == color) {
                resultList.add(apple);
            }
        }

        return resultList;
    }


    /**
     * @solution - try 3 : 동작 파라미터화 - 추상적 조건으로 필터링
     * a. 사과의 필터 조건에 따라 참 거짓을 반환하게 하는 추상메서드를 가진
     *    ApplePredicate 인터페이스를 정의한다.
     * b. 특정 조건을 설정할 구현 클래스를 정의하고 기능을 오버라이딩한다.
     * c. 위 내용을 기반으로 필드 메서드들을 사용.
     *
     * @problem
     * - 필터 조건별 클래스가 많아진다. -> 익명클래스로 해결하면 된다.
     * - 필터 대상이 Apple이 아니라면??
     */

    // solution a
        @FunctionalInterface
    interface ApplePredicate {
        boolean test(Apple apple);
    }

    // solution b - 사과 무게가 100보다 큰지 확인
    static class AppleWeightPredicate implements ApplePredicate {

        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 100;
        }
    }

    // solution c
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) { // 여기에
                resultList.add(apple);
            }
        }
        return resultList;
    }






    /**
     * @solution - try 4 : 타입을  제네릭타입으로 처리
     */

    // Predicate<제네릭 타입> 생성
    interface Predicate<T> {
        boolean test(T t);
    }

    // 제네릭 필터 메서드 생성
                  // 제네릭 메서드를 만들 때는 리턴 타입 앞에 다시 한번 제네릭을 표시해줘야 한다.
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();

        for (T t : list) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }


} // end class
