package programmers;

public class 약수의개수와덧셈 {
    public static int solution(int left, int right) {
        int answer = 0;

            if ((left >= 1 && right >= left) && (right <= 1000)) {

                for (int i = left; i <= right; i++) {
                    int count = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    } // end inner-for

                    if (count % 2 == 0) {
                        answer += i;
                    } else if (count % 2 == 1) {
                        answer -= i;
                    }

                    System.out.println(count);

                } // end outer-for

            } // end if

        return answer;

    } // end solution

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }
}
