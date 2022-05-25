package day06;

// 자바의 메서드는 클래스 내부,(&&) 메서드 외부에서 선언 가능
// 메서드 호출은 (메서드 or 생성자) 내부에서만 가능
public class MethodBasic {

    // 1 ~ x 까지의 누적합을 구해서 리턴하는 함수
    static int calcTotal(int x) {
        System.out.println("메서드 호출!");
        int total = 0;
//        calcTotal(); // 재귀함수 : 자기가 자기를 부르는 함수!!
        for (int i = 1; i <= x; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) { // main 조차도 함수!

        // 호출
        int result = calcTotal(10); // 매개변수 10을 넣은 결과가 호출부에 return됨. 왜?? 내가 return하라고 했으니까
        System.out.println("result = " + result);

        System.out.println(calcTotal(100)); // 5050 출력.



    } // end main method

} // end class