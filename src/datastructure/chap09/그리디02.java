package datastructure.chap09;

import java.util.Scanner;
import java.util.StringTokenizer;

// 백준 1541번
public class 그리디02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int result = 0;

        if (s.contains("-") && s.contains("+")) {
            StringTokenizer st = new StringTokenizer(s, "-");

            result = Integer.parseInt(st.nextToken());

            while (st.countTokens() > 0) {
                String s1 = st.nextToken();

                StringTokenizer st2 = new StringTokenizer(s1, "+");

                int sum = 0;

                while (st2.countTokens() > 0) {
                    sum += Integer.parseInt(st2.nextToken());
                }

                result -= sum;
            }
        } else if (s.contains("-") && !s.contains("+")) {
            StringTokenizer st = new StringTokenizer(s, "-");

            result = Integer.parseInt(st.nextToken());

            while (st.countTokens() > 0) {
                result -= Integer.parseInt(st.nextToken());
            }
        } else if (!s.contains("-") && s.contains("+")) {
            StringTokenizer st = new StringTokenizer(s, "+");

            result = Integer.parseInt(st.nextToken());

            while (st.countTokens() > 0) {
                result += Integer.parseInt(st.nextToken());
            }
        } else {
            result = Integer.parseInt(s);
        }

        System.out.println(result);

    } // end main
} // end class
