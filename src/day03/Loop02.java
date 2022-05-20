package day03;

public class Loop02 {

    public static void main(String[] args) {

        apple: for (char upper = 'A'; upper <= 'Z'; upper++){
            for (char lower = 'a'; lower <= 'z'; lower++) {
                if (lower == 'f') break apple; // 제일 가까운 반복문을 탈출한다.
                System.out.printf("%c - %c\n", upper, lower);
//                System.out.printf("%d - %d\n", (int)upper, (int)lower); // 이렇게도 가능.
            } // inner for
//            if (upper == 'D') break;
        } // outer for
    }

}
