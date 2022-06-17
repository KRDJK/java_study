package day18.collection.practice.view;

import day18.collection.practice.controller.MusicManagementController;

import java.util.Scanner;

public class MusicManagementMenu {

    private Scanner sc;
    private MusicManagementController mmc;

    // 생성자
    public MusicManagementMenu() {
        sc = new Scanner(System.in);
        mmc = new MusicManagementController();
        mainMenu();
    }

    // 메서드
    public void mainMenu() {

        mmc.makeDirectory();
        mmc.load();

        while (true) {
            System.out.println("**** 음악 관리 프로그램 ****");
            System.out.printf("# 현재 등록된 가수: %d명\n", mmc.existArtistNum());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            System.out.println("===============================================");
            System.out.print("메뉴 번호: ");
            int menu = sc.nextInt();
            sc.nextLine();


            switch (menu) {
                case 1:
                    // 1. 노래 등록 기능
                    insertSong();
                    break;
                case 2:
                    // 2. 노래 정보 검색 기능
                    searchSong();
                    break;
                case 3:
                    System.out.println("음악 관리 프로그램을 종료합니다.");
                    System.exit(0);
                    break;
            } // end switch

        } // end while
    } // end mainMenu

    // 1. 노래 등록 화면
    public void insertSong() {
        System.out.println();
        System.out.println("# 노래 등록을 시작합니다.");
        System.out.print("- 가수명: ");
        String name = sc.nextLine();
        System.out.print("- 곡명: ");
        String song = sc.nextLine();
        System.out.println();

        int result = mmc.insertSong(name, song);

        switch (result) {
            case 1 :
                System.out.printf("# %s님의 노래목록에 '%s'곡이 추가되었습니다.\n", name, song);
                break;
            case 2 :
                System.out.println("이미 등록된 노래입니다.");
                break;
            case 3 :
                System.out.printf("# 아티스트 %s님이 신규 등록되었습니다.\n", name);
                break;
        }

        mmc.save();

    } // end insertSong


    // 2. 노래 검색 화면
    public void searchSong() {
        System.out.println();
        System.out.println("# 검색할 가수명을 입력하세요.");
        System.out.print("- 가수명: ");
        String name = sc.nextLine();
        System.out.println();

        if (mmc.searchSong(name) == null) {
            System.out.println("# 해당 가수는 등록되지 않았습니다.");
        } else {
            System.out.printf("# %s님의 노래목록\n", name);
            System.out.println("===============================================");
//            System.out.println(mmc.searchSong(name).toString());
            int i = 1;
            for (String song : mmc.searchSong(name)) {
                System.out.println("* " + i + ". " + song);
                i++;
            }
            System.out.println();
        }

    } // end searchSong


} // end class
