package programmers;

public class 콜라츠추측 {
    static public int solution(int num) {
        int answer = 0;
        long num2 = num;
        // 그냥 int로 하다보면 int의 저장 범위(약 21억~~)을 넘는 구간이 발생
        // 그럼 거기서 자동으로 연산을 멈추고 나와버리기 때문에 626331의 연산이 끝까지 이루어지지 못함.
        // 104번까지만 수행되어서 원하는 결과인 -1이 나오지 않음.
        // 그럼 애초에 long으로 변환해서 연산을 시작하자.

        while (num2 > 1) {
            if (answer == 500) {
                return answer = -1;
            }

            if (num2 % 2 == 0) {
                num2 /= 2;
            } else if (num2 % 2 == 1) {
                num2 = (num2 * 3) + 1;
            }


            answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}
