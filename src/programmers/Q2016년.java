package programmers;

public class Q2016년 {

    static public String solution(int a, int b) {
        String answer = "";

        // 배열을 쓰긴 해야할거 같은데.. 안써도 될듯..?
//        String[] dates= {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String[] dates = {"THU","FRI","SAT","SUN","MON","TUE","WED"};


        /*
            7로 나누면 나머지 1
            1월 1일 -> 금
            1월 8일 -> 금
            1월 31일 -> 일
            2월 5일 -> 금     ==>> 1년 중에 36번째 날.
            2월 26일 -> 금

            나머지 2는 토 ...
        */

        int sum = b;

        for (int i = 1; i < a; i++) {
            if(i == 1) {
                sum += 31;
            } else if (i == 2) {
                sum += 29;
            } else if (i == 3) {
                sum += 31;
            } else if (i == 4) {
                sum += 30;
            } else if (i == 5) {
                sum += 31;
            } else if (i == 6) {
                sum += 30;
            } else if (i == 7) {
                sum += 31;
            } else if (i == 8) {
                sum += 31;
            } else if (i == 9) {
                sum += 30;
            } else if (i == 10) {
                sum += 31;
            } else if (i == 11) {
                sum += 30;
            }
        }

        int n = sum % 7;

        for (int i = 0; i < 7; i++) {
            if(i==n) {
                answer = dates[i];
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }
}
