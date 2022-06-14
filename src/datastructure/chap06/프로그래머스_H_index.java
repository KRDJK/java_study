package datastructure.chap06;

public class 프로그래머스_H_index {
    public static int solution(int[] citations) {
        int answer = 0;

        int sum = 0; // 평균 구하기 위해 필요한 총합 저장 변수


        for (int i = 0; i < citations.length; i++) {
            sum += citations[i];
        }

        int avg = sum / citations.length; // 논문 인용 횟수 평균

        for (int citation : citations) {
            if (citation >= avg) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};

        System.out.println(solution(citations));

    } // end main
} // end class
