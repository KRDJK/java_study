package jungsuk_quiz.chapter03_operator;

public class Quiz10 {
    public static void main(String[] args) {
        char ch = 'A';

        char lowerCase = ( ch >= 'A' && ch <= 'Z' ) ? (char) (ch+32) : ch;

        System.out.println("ch:" + ch); // A가 나와야 함.
        System.out.println("ch to lowerCase:"+lowerCase); // a가 나와야 함.
    }
}
