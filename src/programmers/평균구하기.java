package programmers;

public class 평균구하기 {
    static public double solution(int[] arr) {
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        answer /= arr.length;

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5,5};
        System.out.println(solution(arr));
    }
}
