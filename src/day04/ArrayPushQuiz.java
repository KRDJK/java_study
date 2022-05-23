package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] foodList = {};
//            String[] foodList = new String[0];

        System.out.println("먹고 싶은 음식을 입력하세요!!");
        System.out.println("입력을 중지하려면 <그만>이라고 입력하세요.");

        while (true) {
            System.out.print(">> ");
            String food = sc.nextLine();

            if (food.equals("그만")) break;

            // 1. 원본 배열보다 길이가 1만큼 더 큰 새로운 배열 생성.
            String[] clone = new String[foodList.length +1];

            // 2. 원본 배열에 입력된 만큼을 복사.
            for (int i = 0; i < foodList.length; i++) {
                clone[i] = foodList[i];
            }

            // 3. 음식이 새로 추가될 때마다 마지막 인덱스에 추가.
            clone[clone.length - 1] = food;

            // 4. 주소값 이전해주기.
            foodList = clone;
            clone = null;
        }
        System.out.println("먹고 싶은 음식리스트: " + Arrays.toString(foodList));
        System.out.println("리스트에서 삭제할 목록이 있나요??\n있다면 <1>을 입력하세요. 가장 마지막에 입력한 음식부터 삭제됩니다.");
        System.out.println("삭제를 마치려면 <그만>이라고 입력하세요.");

        while (true) {
            System.out.print(">> ");
            String removeFood = sc.nextLine();

            if (removeFood.equals("그만")) {
                System.out.println("(제거 후)먹고 싶은 음식리스트: " + Arrays.toString(foodList));
                break;
            }

            if (removeFood.equals("1")) {
                if (foodList.length == 0) {
                    System.out.println("더이상 제거할 음식이 없습니다. 자동 종료합니다.");
                    break;
                }

                // 1. 하나 삭제된 배열 생성
                String[] removeClone = new String[foodList.length - 1];

                // 2. 원본 배열을 반복문 돌려서 복사하되, 지우려는거랑 같으면 건너뛰자.
                // 2-1. 마지막거만 제거한다고 해보자.
                for (int i = 0; i < foodList.length-1; i++) {
                    /*if (foodList[i].equals(removeFood)) {
                        continue;
                    }*/
                    removeClone[i] = foodList[i];
                }

                // 3. 주소값 이전해주기.
                foodList = removeClone;
                removeClone = null;

                System.out.println("(제거 후)먹고 싶은 음식리스트: " + Arrays.toString(foodList));
            } // end if
        } // end while
        sc.close();
    } // end main
} // end class
