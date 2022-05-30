package programmers;

public class 음양더하기 {
    static public int solution(int[] absolutes, boolean[] signs) {
        long answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer += -absolutes[i];
            }
        }

        return (int) answer;
    }


    public static void main(String[] args) {
        int[] absolutes = {1, 2, 3};
        boolean[] sings = {false, false, true};
        System.out.println(solution(absolutes, sings));
    }
}
