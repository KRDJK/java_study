package 공휴일연습.com.kh.hw.member.view;

import 공휴일연습.com.kh.hw.member.controller.MemberController;
import 공휴일연습.com.kh.hw.member.model.vo.Member;

import java.util.Scanner;

public class MemberMenu {

    private Scanner sc = new Scanner(System.in);

    private MemberController mc = new MemberController();
    
    
    // 생성자
    public MemberMenu() {

    }


            // 메서드
    // 전체 회원을 출력하는 메서드
    // 5. 회원정보 전체보기
    public void printAll() {
        for (int i = 0; i < mc.existMemberNum(); i++) {
            System.out.println(mc.printAll()[i].inform());
        }
    }


    // 메인 메뉴 출력 메서드
    public void mainMenu() {
        while (true) {
            if (mc.existMemberNum() < mc.SIZE) {
                System.out.println("# 1. 새 회원 등록");
                System.out.println("# 2. 회원 검색");
                System.out.println("# 3. 회원 정보 수정");
                System.out.println("# 4. 회원 삭제");
                System.out.println("# 5. 모두 출력");
                System.out.println("# 9. 끝내기");
                System.out.println();

                System.out.print("# 메뉴 번호: ");
                int menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        // 회원 등록
                        insertMember();
                        break;
                    case 2:
                        // 회원 검색
                        searchMember();
                        break;
                    case 3:
                        // 회원 정보 수정
                        updateMember();
                        break;
                    case 4:
                        // 회원 삭제
                        deleteMember();
                        break;
                    case 5:
                        // 모두 출력
                        printAll();
                        break;
                    case 9:
                        // 프로그램 종료
                        System.out.println("프로그램을 종료합니다.");
                        System.exit(0); // 프로세스 종료
                        break;
                    default:
                        System.out.println("잘못된 메뉴 번호를 입력하였습니다.");
                }
            } else {
                System.out.println("# 2. 회원 검색");
                System.out.println("# 3. 회원 정보 수정");
                System.out.println("# 4. 회원 삭제");
                System.out.println("# 5. 모두 출력");
                System.out.println("# 9. 끝내기");
                System.out.println();

                System.out.print("# 메뉴 번호: ");
                int menu = sc.nextInt();

                switch (menu) {
                    case 2:
                        // 회원 검색
                        searchMember();
                        break;
                    case 3:
                        // 회원 정보 수정
                        updateMember();
                        break;
                    case 4:
                        // 회원 삭제
                        deleteMember();
                        break;
                    case 5:
                        // 모두 출력
                        printAll();
                        break;
                    case 9:
                        // 프로그램 종료
                        System.out.println("프로그램을 종료합니다.");
                        System.exit(0); // 프로세스 종료
                        break;
                    default:
                        System.out.println("잘못된 메뉴 번호를 입력하였습니다.");
                }
            }
        }
    }



    // 회원등록하기 위한 데이터를 사용자에게 입력받는 메서드
        // 실행하면 입력받고 mc.insertMember()에 매개변수로 입력받은 데이터 전달.
    public void insertMember() {
        System.out.println("새 회원을 등록합니다.");
        System.out.println("추가할 회원 정보를 차례대로 입력하세요.");

        String id = "";
        while (true) {
            id = inputStr("아이디: ");
            if (mc.checkId(id)) {
            System.out.println("이미 등록된 아이디입니다.");
            } else {
                break;
            }
        }

        String name = inputStr("이름: ");
        String password = inputStr("비밀번호: ");
        String email = inputStr("이메일: ");
        String gender = inputStr("성별(M/F): ");
        int age = inputNum("나이: ");

        mc.insertMember(id, name, password, email, gender, age);
        System.out.println("회원 등록이 완료되었습니다!");
        System.out.println();
    }


    // 검색 메뉴 출력 메서드
    public void searchMember() {
        if (mc.existMemberNum() <= 0) {
            System.out.println("저장된 회원 정보가 없습니다.");
            return;
        }
        System.out.println("1. 아이디로 검색하기");
        System.out.println("2. 이름으로 검색하기");
        System.out.println("9. 메인으로 돌아가기");
        System.out.print("메뉴 번호: ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                // 아이디로 검색하기
                searchId();
                break;
            case 2:
                // 이름으로 검색하기
                searchName();
                break;
            case 9:
                System.out.println();
                return;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");
        }
    }


    // 아이디 검색을 위한 데이터를 사용자에게 입력받는 메서드
    public void searchId() {
        String id = inputStr("검색할 아이디를 입력해주세요. : ");
        System.out.println();

        if (mc.searchId(id) != null) {
            System.out.println("=========검색된 정보==========");
            System.out.println(mc.searchId(id).inform());
        } else {
            System.out.println("그런 아이디를 가진 회원은 존재하지 않습니다.");
        }
    }


    // 이름 검색을 위한 데이터를 사용자에게 입력받는 메서드
    public void searchName() {
        String name = inputStr("검색할 이름을 입력해주세요. : ");
        System.out.println();

        Member[] temp = mc.searchName(name);

        if (temp != null) {
            System.out.println("=========검색된 정보==========");
            for (int i = 0; i < temp.length; i++) {
                System.out.println(temp[i].inform());
            }

        } else {
            System.out.println("그런 이름을 가진 회원은 존재하지 않습니다.");
        }
    }


    // 이메일 검색을 위한 데이터를 사용자에게 입력받는 메서드
//    public void searchEmail() {
//
//    }


    // 수정 메뉴 출력 메서드
    public void updateMember() {
        if (mc.existMemberNum() <= 0) {
            System.out.println("저장된 회원 정보가 없습니다.");
            return;
        }
        System.out.println("\n=========== 회원 정보 수정하기 ============");
        System.out.println("1. 비밀번호 수정하기");
        System.out.println("2. 이름 수정하기");
        System.out.println("3. 이메일 수정하기");
        System.out.println("9. 메인으로 돌아가기");
        System.out.print("메뉴 번호: ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                // 비밀번호 수정하기
                updatePassword();
                break;
            case 2:
                // 이름 수정하기
                updateName();
                break;
            case 3:
                // 이메일 수정하기
                updateEmail();
                break;
            case 9:
                System.out.println();
                return;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");
        }
    }


    // 비밀번호 수정을 위한 데이터를 사용자에게 입력받는 메서드
    public void updatePassword() {

    }


    // 이름 수정을 위한 데이터를 사용자에게 입력받는 메서드
    public void updateName() {

    }


    // 이메일 수정을 위한 데이터를 사용자에게 입력받는 메서드
    public void updateEmail() {

    }


    // 삭제 메뉴 출력 메서드
    public void deleteMember() {

    }


    // 하나의 회원 삭제 및 결과를 출력하는 메서드
    public void deleteOne() {

    }


    // 전체 회원 삭제 및 결과를 출력하는 메서드
    public void deleteAll() {

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
