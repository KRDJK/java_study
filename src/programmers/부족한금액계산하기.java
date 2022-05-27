package programmers;

public class 부족한금액계산하기 {
    static public long solution(int price, int money, int count) {
        long answer = -1;

        long total = 0;

        for (int i = 1; i <= count; i++) {
            total += (price * i);
        }

        if (money - total > 0) {
            answer = 0;
        } else {
            answer = answer * (money - total);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}
