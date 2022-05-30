package programmers;

public class 숫자_문자열과_영단어_new {
    public static int solution(String s) {
        String[] numberStr = {"zero", "one", "two", "three",
                "four", "five", "six",
                "seven", "eight", "nine"};

        for (int i = 0; i < numberStr.length; i++) {
            s = s.replace(numberStr[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }



}
