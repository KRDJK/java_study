package programmers;

public class 문자열내p와y개수 {
    static boolean solution(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                pCount++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                yCount++;
            }
        }

        
        if (pCount ==  yCount ) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Pyy"));
    }

}
