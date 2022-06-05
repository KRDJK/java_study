package programmers;

public class 서울에서김서방찾기 {
    public static String solution(String[] seoul) {
        String answer = "";

        int kimIdx = -1;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                kimIdx = i;
            }
        }

        answer = String.format("김서방은 %d에 있다", kimIdx);

        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }
}
