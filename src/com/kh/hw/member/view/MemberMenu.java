package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

import java.util.Scanner;

public class MemberMenu {
    private Scanner sc = new Scanner(System.in);

    private MemberController mc = new MemberController();


    // 생성자
    public MemberMenu() {

    }


    // 메서드
    public void mainMenu() {
        while (true) {
            System.out.printf("최대 등록 가능한 회원 수는 %d명입니다.\n", mc.SIZE);

            System.out.printf("현재 등록된 회원 수는 %d명입니다.\n", mc.existMemberNum());

            System.out.println("==============================================");

            // 1. 새 회원 등록. (현재 등록된 회원 수가 10명보다 작으면)
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
                        System.out.println();
                }


            } else { // 현재 등록된 회원 수가 최대치인 경우
                System.out.println("# 2. 회원 검색");
                System.out.println("# 3. 회원 정보 수정");
                System.out.println("# 4. 회원 삭제");
                System.out.println("# 5. 모두 출력");
                System.out.println("# 9. 끝내기");
                System.out.println();

                System.out.print("# 메뉴 번호: ");
                int answer = sc.nextInt();

                // 여기도 switch

            }
        }
    } // end mainMenu


    private void insertMember() {
        System.out.println("\n# 새 회원을 등록합니다.");

        String id = "";
        while (true) {
            id = inputStr("- 아이디: ");
            if (!mc.checkId(id)) break;
            System.out.println("- 중복된 아이디입니다!");
        }

        String name = inputStr("- 이름: ");
        String password = inputStr("- 비밀번호: ");
        String email = inputStr("- 이메일: ");
        // 입력 받은걸 대문자로 변환하고, 거기에 0번 인덱스를 char로 받았다.
        char gender = ' ';
        while (true) {
            gender = inputStr("- 성별(M/F): ").toUpperCase().charAt(0);
            if (gender == 'F' || gender == 'M') break;
            System.out.println("- 잘못된 성별입니다!");
        }
        int age = inputNum("- 나이: ");

        /*System.out.print("- 아이디: ");
        String id = sc.next();

        System.out.print("\n- 이름: ");
        String name = sc.next();

        System.out.print("\n- 비밀번호: ");
        String password = sc.next();

        System.out.print("\n- 이메일: ");
        String email = sc.next();

        System.out.print("\n- 성별(M/F): ");
        String gender =  sc.next();

        System.out.print("\n- 나이: ");
        int age = sc.nextInt();*/
        mc.insertMember(id, name, password, email, gender, age);

    } // end insertMember



    // 입력 처리를 간단하게 만드는 메서드
    private String inputStr (String msg) {
        System.out.print(msg);
        return sc.next();
    }

    private int inputNum (String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }



    // 5번 메뉴 처리 메서드
    private void printAll() {
        if (mc.existMemberNum() <= 0) {
            System.out.println("저장된 회원 정보가 없습니다.");
            return;
        }
        Member[] members = mc.printAll();

        System.out.println("\n=============== 전체 회원 정보 ===================");
        for (int i = 0; i < mc.existMemberNum(); i++) {
            System.out.println(members[i].inform());
        }
    }



    // 2번 메뉴 처리 메서드
    private void searchMember() {
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
                return;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");
        }
    }



    // 메뉴 2-1번 처리
    private void searchId() {

        String targetId = inputStr("- 조회할 아이디: ");
        Member member = mc.searchId(targetId);
        if (member != null) {
            System.out.println("\n================ 검색된 최종 정보 ==================");
            System.out.println(member.inform());
        } else {
            System.out.println("\n- 존재하는 회원이 아닙니다.");
        }
    }



    // 메뉴 2-2번 처리
    private void searchName() {

        String targetName = inputStr("- 조회할 이름: ");
        Member[] members = mc.searchName(targetName);
        if (members.length > 0) {
            System.out.println("\n=========== 검색된 회원 정보 ============");
            for (Member m : members) {
                System.out.println(m.inform());
            }
        } else {
            System.out.println("\n- 존재하는 회원이 아닙니다.");
        }
    }



    // 메뉴 3번 처리
    private void updateMember() {
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
                return;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");
        }
    }



    // 메뉴 3-1번 처리
    private void updatePassword() {
        String targetId = inputStr("- 수정할 아이디: ");
        String newPassword = inputStr("- 수정할 비밀번호: ");

        if(mc.updatePassword(targetId, newPassword)) {
            System.out.println("수정이 성공적으로 되었습니다.");
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
        }
    }


    
    // 메뉴 3-2번 처리
    private void updateName() {
        String targetId = inputStr("- 수정할 아이디: ");
        String newName = inputStr("- 수정할 이름: ");
        
        if (mc.updateName(targetId, newName)) {
            System.out.println("수정이 성공적으로 되었습니다.");
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
        }
    }



    // 메뉴 3-3번 처리
    private void updateEmail() {
        String targetId = inputStr("- 수정할 아이디: ");
        String newEmail = inputStr("- 수정할 이메일: ");

        if (mc.updateEmail(targetId, newEmail)) {
            System.out.println("수정이 성공적으로 되었습니다.");
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
        }
    }


    // 메뉴 4번 처리
    private void deleteMember() {
        if (mc.existMemberNum() <= 0) {
            System.out.println("저장된 회원 정보가 없습니다.");
            return;
        }
        System.out.println("\n=========== 회원 정보 삭제하기 ============");
        System.out.println("1. 특정 회원 삭제하기");
        System.out.println("2. 모든 회원 삭제하기");
        System.out.println("9. 메인으로 돌아가기");
        System.out.print("메뉴 번호: ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                // 특정 회원 삭제
                deleteOne();
                break;
            case 2:
                // 모든 회원 삭제
                deleteAll();
                break;
            case 9:
                return;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");
        }
    }

    // 메뉴 4-1번 처리 (회원 하나 삭제)
    private void deleteOne() {
        String targetId = inputStr("- 삭제할 회원의 아이디: ");

        String isDelete = inputStr("- 정말 삭제하시겠습니까? (y/n): ");
        /*if (isDelete.equals("y")) {
            if (mc.delete(targetId)) {
                System.out.println("성공적으로 삭제하였습니다.");
            } else {
                System.out.println("존재하지 않는 아이디입니다.");
            }*/
        if (mc.checkId(targetId)) {
            switch (isDelete.toUpperCase().charAt(0)) {
                case 'Y': case 'ㅛ':
                    mc.delete(targetId);
                    System.out.printf("해당 데이터가 삭제되었습니다.\n 삭제된 아이디: %s\n", targetId);
                case 'N': case 'ㅜ':
                    System.out.println("삭제를 취소합니다.");

            }
        }

    }

    // 메뉴 4-2번 처리 (회원 전체 삭제)
    private void deleteAll() {
        String isDelete = inputStr("- 정말 삭제하시겠습니까? (y/n): ");
        /*if (isDelete.equals("y")) {
            mc.delete();
            System.out.println("성공적으로 삭제하였습니다.");
        }*/
        switch (isDelete.toUpperCase().charAt(0)) {
            case 'Y':
            case 'ㅛ':
                mc.delete();
                System.out.println("모든 데이터가 삭제되었습니다.");
            case 'N':
            case 'ㅜ':
                System.out.println("삭제를 취소합니다.");
        }
    }
} // end class
