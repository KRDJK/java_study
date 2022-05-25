import java.util.Scanner;

public class Baekjoon1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        char c = " ";

        String s = sc.nextLine();

//        System.out.println("s = " + s);
//        System.out.println("s.length() = " + s.length());
//        System.out.println("s.charAt(1) = " + s.charAt(1));
//        System.out.println("s.charAt(1)+1 = " + (s.charAt(1)+1)); // 33 아하! 공백은 32네

        int count = 0; // 공백이 있을 때마다 카운트

        for (int i = 0; i < s.length(); i++) {
            if ((int)(s.charAt(i)) == 32 || i == 0) {
                count++;
            }
        }

        System.out.println(count);

    } //end main
} // end class

