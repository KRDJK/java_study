package coding04_array;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[9];

        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
        }

        int idx = 0;
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(max == numbers[i]) {
                idx = i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);
    }
}
