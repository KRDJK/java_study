package day18.collection.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String[] foodList = {};
        LinkedList<String> foodList = new LinkedList<>();
//            String[] foodList = new String[0];

        System.out.println("먹고 싶은 음식을 입력하세요!!");
        System.out.println("입력을 중지하려면 <그만>이라고 입력하세요.");

        while (true) {
            System.out.print(">> ");
            String food = sc.nextLine().trim();

            if (food.equals("그만")) {
                break;
            }

            foodList.add(food);
        }
        System.out.println("먹고 싶은 음식리스트: " + foodList);
        System.out.println("리스트에서 삭제할 목록이 있나요??\n있다면 <1>을 입력하세요. 가장 마지막에 입력한 음식부터 삭제됩니다.");
        System.out.println("삭제를 마치려면 <그만>이라고 입력하세요.");

        while (true) {
            System.out.print(">> ");
            String removeFood = sc.nextLine().trim();

            if (removeFood.equals("그만")) {
                System.out.println("(제거 후)먹고 싶은 음식리스트: " + foodList);
                break;
            }

            if (removeFood.equals("1")) {
                if (foodList.size() == 0) {
                    System.out.println("더이상 제거할 음식이 없습니다. 자동 종료합니다.");
                    break;
                }

                foodList.remove(foodList.size()-1);

                System.out.println("(제거 후)먹고 싶은 음식리스트: " + foodList);
            } // end if
        } // end while
        sc.close();
    } // end main
} // end class
