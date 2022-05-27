package programmers;

public class 하샤드수 {
    static public boolean solution(int x) {
        boolean answer = true;

        int n = x;

        int sum = 0;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
//        System.out.println(n % sum);

        if (n % sum != 0) {
            answer = false;
        }

        return answer;
    }




    public static void main(String[] args) {
        System.out.println(solution(11));

    } // end main
} // end class
