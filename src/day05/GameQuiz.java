package day05;

import java.util.Arrays;
import java.util.Scanner;

public class GameQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 인원 수 입력 받기.
        System.out.print("게임 인원 (2 ~ 4명) ==> ");
        int player = sc.nextInt();
        sc.nextLine();


        // 인원 수 만큼 플레이어 이름도 받아야 함.
        System.out.println("플레이어 이름을 등록합니다.");
        // 플레이어 이름을 입력 받고 각 인덱스에 저장할 배열 생성.
        String[] playerList = new String[player];


        // 배열에 플레이어 이름들 초기화.
        for (int i = 0; i < player; i++) {
            System.out.printf("%d번 플레이어 이름 : ", i+1);
            playerList[i] = sc.next();
        }

        System.out.println(Arrays.toString(playerList) + " 참가!");
        System.out.println();



        // 실탄 갯수 입력 받기.
        System.out.print("실탄 개수 (1 ~ 5개) ==> ");
        int bullet = sc.nextInt();
        sc.nextLine();
        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");
        System.out.println();


        // 무작위로 플레이어 순서가 정해지도록 하기.
        int startPlayer = (int) (Math.random() * player - 1);
            // 랜덤 정수가 잘 나오는지 중간 확인용
//        System.out.println("startPlayer = " + startPlayer);


        // 총알이 모두 소진되거나, player가 한명만 남을 때까지 무한 반복
        while (true) {
            // 플레이어가 한명만 남은 경우 종료.
            if (playerList.length <= 1) {
                System.out.println("# 단 한명만 살아남았습니다. 게임을 종료합니다.");
                break;
            }

            // 총알 다 떨어진 경우 종료.
            if (bullet <= 0) {
                System.out.println("# 총알이 모두 소진되었습니다. 게임을 종료합니다.");
                break;
            }


            // 마지막 순서가 지나면 다시 0번 인덱스의 플레이어부터 시작.
            if(startPlayer > playerList.length-1) {
                startPlayer = 0;
            }
            System.out.printf("총을 돌렸습니다. %s부터 시작합니다.\n", playerList[startPlayer]);
            System.out.println();
            System.out.printf("[%s님의 턴!] 탄창 실린더를 무작위로 돌립니다.\n", playerList[startPlayer]);


            // 발사되는 경우 랜덤 설정. 최대 탄창 수 5개, 최소 1개.
            // rnBullet이 Bullet보다 크면 생존, 같거나 작으면 당첨..!
            int rnBullet = (int) (Math.random() * 5-1)+1;

            System.out.println("# 엔터를 누르면 격발합니다.");
            sc.nextLine();

            if (rnBullet > bullet) {
                System.out.println("휴.. 살았습니다.");
                System.out.println();
                startPlayer++;
//                continue;
            } else { // 죽는 경우
                bullet--;
                System.out.printf("# 빵!! [%s]님 사망...\n", playerList[startPlayer]);
                // 죽은 플레이어, 플레이어 목록에서 제거.
                String[] temp = new String[playerList.length-1];
                    // 일단 원본에서 지울 놈 기준으로 뒷번호를 앞으로 땡기기
                for (int i = startPlayer; i < playerList.length-1; i++) {
                    playerList[i] = playerList[i+1];
                }

                for (int i = 0; i < playerList.length-1; i++) {
                    temp[i] = playerList[i];
                }

                playerList = temp;
                temp = null;
            }

        } // end while

        sc.close();
        System.out.println("# 최후 생존자: " + Arrays.toString(playerList));
        System.out.println("# 게임을 종료합니다.");

    } // end main
} // end class
