package coding02_if;

import java.util.Scanner;

public class Quiz05Retry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(), M = sc.nextInt();

        if ((M - 45)>= 0 ) {
            M = M - 45;
            System.out.println(H + " " + M);
        } else if (M - 45 < 0) {
            M = 60 + (M-45);
            if (H <= 0) {
                H = 23;
            } else {
                H -= 1;
            }
            System.out.println(H + " " + M);

        }
    }
}
