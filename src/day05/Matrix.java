package day05;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int[][] scores = { // [][] = int 배열을 묶을거다.
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {33, 4, 55}
        };
        System.out.println(Arrays.toString(scores)); // 이랬더니 주소 4개가 나오네.
        System.out.println("scores[1] = " + scores[1]);
        System.out.println(Arrays.deepToString(scores));

        System.out.println("======================================");

        System.out.println("scores.length = " + scores.length);
        System.out.println("scores[1].length = " + scores[1].length);
                                        // 1차원 int[]이 나오기 때문에 .length를 쓸 수 있다.
        System.out.println("scores[2][1] = " + scores[2][1]);

        System.out.println(Arrays.toString(scores[0])); // 이건 배열이라 되지만 scores[0][1] 이건 안됨. why? int니까

        // 데이터 수정
        scores[2][1] = 777;
        scores[0] = new int[] {100, 200, 300};

        // 반복문 처리
        System.out.println("==========================================");

        /*for (int[] arr : scores) {
            for (int n : arr) {
                System.out.printf("%3d ", n); // 3자리를 점유한 후, 우측 정렬해라.
                                                // %-3d는 3자리 점유 후, 왼쪽 정렬.
            }
            System.out.println();
        }*/
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("%-4d ", scores[i][j]); // 4자리 점유 후 왼쪽 정렬.
            }
            System.out.println();
        }

        System.out.println("===================================");

        // 배열 생성문으로 2차원 배열 만들고 (3 x 5)
        int[][] arr2d = new int[3][5]; // 1차원 배열 몇개 만들건지 : 3
                                        // 1차원 배열의 길이를 몇으로 만들건지 : 5

        arr2d[1][3] = 50;

        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                System.out.printf("%-4d", anInt);
            }
            System.out.println();
        }

        // 3차원
        int[][][] arr3d = {
                {
                        {1, 2},
                        {3, 4},
                        {5, 6}
                },
                {
                        {7, 8},
                        {9, 10},
                        {11, 12}
        }
        };
        System.out.println(arr3d.length);

        // 4 X 5 X 6 - 3차원배열
        int[][][] arr3d_2 = new int[4][5][6];

    } // end main
} // end class
