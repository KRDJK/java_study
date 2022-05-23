package day04;

public class ArrayBasicQuiz {
    public static void main(String[] args) {
        int[] scores = {98, 71, 85, 67, 100, 95};

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        double avg = (double)sum / (double)scores.length;

        System.out.printf("총점: %d점, 평균: %.2f점", sum, avg);
    }
}
