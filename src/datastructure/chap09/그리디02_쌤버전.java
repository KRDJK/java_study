package datastructure.chap09;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 그리디02_쌤버전 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(str, "-");

        int result = 0;
        for (int i = 0; st.hasMoreTokens(); i++) {
            String token = st.nextToken();
            int addSum = calcTotal(token);
            if (i == 0) {
                result += addSum;
            } else  {
                result -= addSum;
            }
        }
        System.out.println(result);
    }
    // 토큰문자열을 받아서 총합을 구해서 리턴
    private static int calcTotal(String token) {
        int total = 0;
        StringTokenizer st = new StringTokenizer(token, "+");
        while (st.hasMoreTokens()) {
            total += Integer.parseInt(st.nextToken());
        }
        return total;
    }
}
