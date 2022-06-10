package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.Scanner;

//
import static com.kh.practice.chap01_poly.controller.LibraryController.*;

public class LibraryMenu {

    private LibraryController lc;

    private Scanner sc;

    // 생성자
    public LibraryMenu() {
        lc = new LibraryController();
        sc = new Scanner(System.in);
        mainMenu();
    }


    // 메서드
    public void mainMenu() {
        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별(M/F) : ");
        String gen = sc.next();


        char gender = gen.charAt(0);

        Member mem = new Member(name, age, gender);
        lc.insertMember(mem);


        while (true) {
            System.out.println("===== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("9. 프로그램 종료하기");

            System.out.print("메뉴 번호 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (menu) {
                case 1:
                    // 1. 마이페이지 출력
                    System.out.println(lc.myInfo().toString());
                    break;
                case 2:
                    // 2. 도서 목록 전체 조회 메뉴
                    selectAll();
                    break;
                case 3:
                    // 3. 도서 검색 메뉴
                    searchBook();
                    break;
                case 4:
                    // 4. 도서 대여 메뉴
                    rentBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요.");
            }
        } // end while
    } // end mainMenu


    // 2. 도서 목록 전체 조회 메뉴
    public void selectAll() {
        Book[] bList = lc.selectAll();

        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 : " + bList[i].toString());
        }

    } // end selectAll
    
    
    // 3. 특정 도서 검색 메뉴
    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();

        Book[] foundBookList = lc.searchBook(keyword);

        if (foundBookList.length == 0) {
            System.out.println("해당 키워드가 포함된 도서가 없습니다.");
        } else {
            for (Book book : foundBookList) {
                System.out.println(book.toString());
            }
        }

    } // end searchBook


    /*// 4. 도서 대여 메뉴
    public void rentBook() {
        System.out.println("================ 도서 목록 =================");
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();

        int result = lc.rentBook(index);

        if (result == 2) {
            System.out.println("성공적으로 대여되었습니다.\n요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
        } else if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        }

    } // end rentBook*/
    private void rentBook() {

        System.out.println("\n================ 대여 도서 목록 ==================");
        selectAll();

        System.out.printf("# 대여할 도서 번호 입력: ");
        int bookNo = sc.nextInt();

        int result = lc.rentBook(bookNo - 1);

        switch (result) {
            case RENT_SUCCESS:
                System.out.println("# 성공적으로 대여 되었습니다.");
                break;
            case RENT_SUCCESS_WITH_COUPON:
                System.out.println("# 성공적으로 대여되었습니다. " +
                        "요리학원 쿠폰이 발급되었으니 " +
                        "마이페이지에서 확인하세요");
                break;
            case RENT_FAIL:
                System.out.println("# 나이 제한으로 대여할 수 없습니다.");
                break;

        }
    }


} // end class
