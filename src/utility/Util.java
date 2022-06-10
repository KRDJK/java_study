package utility;

import java.util.Scanner;

public class Util {

    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }


    public static int inputN(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    public static String inputS(String msg) {
        System.out.print(msg);
        return sc.next();
    }

    public static double inputD(String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }



    public static void line() { // 객체 생성없이 써야 하니까 static
        System.out.println("===============================================");
    }

}
