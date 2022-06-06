package jungsuk_quiz.chapter04_if_switch_for_while;

public class Quiz09 {
    public static void main(String[] args) {
        String str = "12345";

        int sum = 0;

//        int s = Integer.parseInt(str);

        for(int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

//        while (s > 0) {
//            sum += s % 10;
//            s /= 10;
//        }

        System.out.println("sum="+sum);

    }
}
