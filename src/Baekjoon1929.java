import java.util.Scanner;

public class Baekjoon1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(), N = sc.nextInt();


        int count = 0;


        for (int i = M; i <= N; i++) {
            count = 0;
            for (int j = 1; j <= M; j++) {
                if (M % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(M);
            }
        }


    } // end main
} // end class
