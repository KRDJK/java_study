import java.util.Scanner;

public class Baekjoon11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if (s.length() == 1) {
            char c = s.charAt(0);
            System.out.println((int)c);
        }
    }
}
