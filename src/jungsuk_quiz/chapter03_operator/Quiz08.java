package jungsuk_quiz.chapter03_operator;

public class Quiz08 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;

//        byte c = a + b;
        byte c = (byte) (a + b);

        char ch = 'A';

//        ch = ch + 2;
        ch = (char) (ch + 2);

//        float f = 3 / 2;
        float f = 3 / 2f;
//        System.out.println("f = " + f);


//        long l = 3000 * 3000 * 3000;
        long l = 3000 * 3000 * 3000L;
//        System.out.println("l = " + l);

        float f2 = 0.1f;

//        double d = 0.1;
        double d = 0.1f;

        boolean result = d == f2;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
    }
}
