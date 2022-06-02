package miniproject.com.kh.hw.member.view;

import miniproject.com.kh.hw.member.controller.MemberController;

import java.util.Scanner;

public class MemberMenu {

    Scanner sc = new Scanner(System.in);

    private MemberController mc = new MemberController();


    // 메서드
    public void mainMenu() {
        while (true) {
            System.out.println("======================== 기업 관리 프로그램(사업자용) ========================");
            System.out.println("# 1. 직원 등록");
            System.out.println("# 2. 직원 정보 조회");
            System.out.println("# 3. 직원 정보 수정");
            System.out.println("# 4. 직원 삭제");
            System.out.println("# 9. 끝내기");
            System.out.print("메뉴 번호: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // 1. 신규 직원 등록
                    insertMember();
                    break;
                case 2:
                    // 2. 직원 정보 조회
                    searchMember();
                    break;
                case 3:
                    // 3. 직원 정보 수정
                    updateMember();
                    break;
                case 4:
                    // 4. 직원 삭제
                    deleteMember();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 프로세스 종료
                    break;
                default:
                    System.out.println("잘못된 메뉴를 입력하였습니다.");
            }
        } // end while

    } // end mainMenu


    public void insertMember() {
        System.out.println("\n=====신규 직원을 등록합니다=====");
        System.out.println("신규 등록할 직원의 정보를 차례대로 입력하세요!");

        String id = "";
        while (true) {
            id = inputStr("사원 id: ");
            if (mc.checkId(id)) {
                System.out.println("이미 등록된 아이디입니다.");
            } else {
                break;
            }
        }

        String name = inputStr("이름: ");
        String rank = inputStr("직급: ");
        String email = inputStr("이메일: ");
        String phone = inputStr("연락처: ");
        int family = inputNum("부양 가족 수: ");

        mc.insertMember(id, name, rank, email, phone, family);
        System.out.println("신규 직원 등록이 완료되었습니다!");
        System.out.println();
    }

    public void searchMember() {
        while (true) {
            System.out.println("# 1. 직원 개인정보 조회");
            System.out.println("# 2. 직원 급여 조회");
            System.out.println("# 3. 모든 정보 조회");
            System.out.println("# 9. 정보 조회 메뉴 나가기");
            System.out.print("메뉴 번호: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // 사원 아이디로 직원 개인정보 조회
                    String id = inputStr("검색할 사원의 사원 아이디를 입력하세요.");
                    if (mc.findIndexById(id) != -1) {

                    } else {
                        System.out.println("그런 아이디를 가진 직원이 없습니다.");
                    }
                    continue;
                case 2:
                    // 사원 아이디로 해당 사원 급여 상세 조회

                    break;
                case 3:
                    // 사원 아이디로 개인정보 + 급여 통합 조회

                    break;
                case 9:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴 번호를 입력하였습니다.");
            }
        }

    }

    public void updateMember() {

    }

    public void deleteMember() {

    }



    // 입력 처리를 간단하게 만드는 메서드
    private String inputStr (String msg) {
        System.out.print(msg);
        return sc.next();
    }

    private int inputNum (String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

} // end class
