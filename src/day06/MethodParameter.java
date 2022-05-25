package day06;

import java.util.Arrays;

// parameter(매개 변수) : 함수가 외부에서 받아와야 하는 값을 저장하는 공간.
public class MethodParameter {
    // 함수 정의 가능 부분.

    // 2개의 정수를 전달받아 그 합을 돌려주는 함수
    static int add (int n1, int n2) {
        System.out.println("함수 호출!");
        int sum = n1 + n2;
        return sum;
    }
    
    // n개의 정수를 전달받아 그 총합을 리턴하는 함수
    static int addAll(int... numbers) { // [] 대신에 ...을 쓸 수 있다. 다만!! 함수에서만!!!
                                        // 이러면 배열로 넣어도 되고, 그냥 나열해도 된다.
                                        // 배열로 주면 땡큐고 풀어서 주면 얘가 알아서 묶는다.
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 2개의 배열을 전달받아 길이가 더 긴 배열을 리턴하는 함수
    static int[] compareLength(int[] nums1, int[] nums2) {
        return (nums1.length > nums2.length) ? nums1 : nums2;
    }

    static void hello() { // return 값이 없으면 타입 부분에 void를 넣음.
        System.out.println("안녕하십니까~?");
    }


    public static void main(String[] args) {
        System.out.println("함수 호출 전!");
        add(10, 20); // main의 제어권이 잠시 add 함수 부분으로 넘어감.
        System.out.println("함수 호출 후!");

        System.out.println("================================");

        add(5, 8); // 5, 8은 인수라고 표현함. argument?? arcu??
//        add(5, 8, 100); 이라고 하면 에러남. JS에서는 100을 따로 저장하되, 무시하듯 넘어가고 실행은 해주는데..
//        add(5) 이렇게만 해도 JS에서는 5+undefined로 됐지만, 에러남.
//        add(8, "5") 이러면 int로 받겠대놓고 왜 다르냐고 에러남. JS에서는 붙여줬나? 확인해보자.

        short x = 12; // 자동 업캐스팅
        add(8, x);
        long y = 12L;
        add(8, (int)y);

        System.out.println("===============================");

        int[] arr = {10, 20, 30};
        int sum = addAll(arr);
        System.out.println("sum = " + sum);

        int sum2 = addAll(new int[]{3, 6, 9, 12}); // 선언이 아니기 때문에 new int[] 생략 불가!!
        System.out.println("sum2 = " + sum2);

        int sum3 = addAll(5, 10, 15, 20, 25, 30);  // 이렇게 하고 싶을 땐????
                                                            // 선언부에서 매개변수를 int[]이 아닌, int...으로 쓰면 된다.
        System.out.println("sum3 = " + sum3);


        System.out.println("================================");

//        compareLength(1,2,3,4,5,6,7,8) // 만약 ...으로 두 매개변수에 썼으면 인수를 판단할 때
                                        // 얘가 어디까지가 nums1이고, 어디부터 어디까지가 nums2인지 판단이 안됨.

        int[] loger = compareLength(new int[] {1,3,5,7}, new int[] {2,4,6,8});
        System.out.println("loger = " + loger); // 이러면 주소가 나오네 아하!
        System.out.println("loger = " + Arrays.toString(loger));

    } // end main
    // 함수 정의는 여기서도 가능함.

} // end class
