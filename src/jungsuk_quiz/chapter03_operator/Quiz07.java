package jungsuk_quiz.chapter03_operator;

public class Quiz07 {
    public static void main(String[] args) {
        int fahrenheit = 100;

        float celcius = (float) 5 / 9 * (fahrenheit - 32);

        System.out.println("Fahrenheit:" + fahrenheit);
//        System.out.println("Celcius:"+celcius);
        System.out.printf("Celcius: %.2f", celcius); // 내 버전 정답!

    }
}
