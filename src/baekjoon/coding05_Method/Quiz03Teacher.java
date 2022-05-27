package baekjoon.coding05_Method;

public class Quiz03Teacher {

    // 정수의 자리수를 구해서 리턴하는 함수
    static int countDigit(int n) {
        int count = 0;
        while (n>0) {
            n /= 10;
            count++;
        }
        return count;
    }

    // 정수 n을 전달하면 각 자리수별로 쪼개서 배열로 리턴하는 함수
    static int[] splitNumber (int n) {
        int[] numbers = new int[countDigit(n)];

        for (int i = numbers.length - 1; i >= 0 ; i--) {
            numbers[i] = n % 10;
            n /= 10;
        }
        return numbers;
    }
    
    // 정수 n을 전달하면 각 자리수의 공차를 배열에 담아 리턴하는 함수

    
    public static void main(String[] args) {
        System.out.println(countDigit(5632));
    }
}
