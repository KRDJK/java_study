package programmers;

public class 완주하지못한선수_동명이인 {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < completion.length; j++) {
                if (participant[i].equals(completion[j])) {
                    participant[i] = "x";
                    break;
                }
            }
        }

        for (String s : participant) {
            if (!s.equals("x")) {
                answer += s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));
    }


}
