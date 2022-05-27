package baekjoon.coding06_String;

import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        char c = " ";

        String s = sc.nextLine();

//        System.out.println("s = " + s);
//        System.out.println("s.length() = " + s.length());
//        System.out.println("s.charAt(1) = " + s.charAt(1));
//        System.out.println("s.charAt(1)+1 = " + (s.charAt(1)+1)); // 33 아하! 공백은 32네

        int count = 0; // 공백이 있을 때마다 카운트

        // 공백이 연속으로 나왔을 경우를 빼주지 않아서 틀렸나...?? 그런듯..
        for (int i = 0; i < s.length(); i++) {
            if ((int)(s.charAt(i)) == 32 || i == 0) {
                if(i == s.length()-1) {
                    // s.charAt(i)가 공백이기도 해서 여기까지 온 것!! 공백으로 끝나면 뒤에 단어가 나오지 않으므로.
                    continue;
                }
                if((int)s.charAt(i) == 32 && (int) s.charAt(i+1) == 32) {
                    // 공백이 연달아 나왔으면 count--
                    count--;
                }
                count++;
            }
        }

        System.out.println(count);

    } //end main
} // end class

