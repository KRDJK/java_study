package miniproject.com.kh.hw.member.view;

import miniproject.com.kh.hw.member.controller.MemberController;
import miniproject.com.kh.hw.member.controller.ScheduleController;
import miniproject.com.kh.hw.member.model.vo.Member;
import miniproject.com.kh.hw.member.model.vo.Schedule;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MemberMenu {

    Scanner sc = new Scanner(System.in);

    private MemberController mc = new MemberController();
    private ScheduleController sm = new ScheduleController();


    // 메서드
    public void mainMenu() {
        while (true) {
            System.out.println("\n======================== 회사 관리 프로그램 ========================");
            System.out.println("# 1. 직원 등록");
            System.out.println("# 2. 직원 정보 조회");
            System.out.println("# 3. 직원 정보 수정");
            System.out.println("# 4. 직원 삭제");
            System.out.println("# 5. 일정 관리");
            System.out.println("# 9. 끝내기");
//            System.out.print("메뉴 번호: ");
            int menu = inputNumber("- 메뉴 입력: ");

            switch (menu) {
                case 1:
                    // 1. 신규 직원 등록
                    insertMember();
                    break;
                case 2:
                    // 2. 직원 정보 조회
                    searchMemberInform();
                    break;
                case 3:
                    // 3. 직원 정보 수정
                    updateMember();
                    break;
                case 4:
                    // 4. 직원 삭제
                    deleteMember();
                    break;
                case 5:
                    // 5. 일정 관리
                    scheduleManager();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 프로세스 종료
                    break;
                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
            }
        } // end while

    } // end mainMenu


    // method

    // 1번 메뉴 처리 메서드
    // 신규 직원 등록
    private void insertMember() {
        if (mc.existMemberNum() == mc.SIZE) {
            System.out.println("등록 가능한 직원 수를 초과하였습니다.");
            return;
        }
        System.out.println("\n # 신규 직원을 등록합니다.");

        String id = null;
        while (true) {
            id = inputStr("- 직원 아이디: ");
            if (!mc.checkId(id)) break; // 아이디 중복 체크
            System.out.println("- 중복된 직원 아이디입니다!");
        }

        String name = inputStr("- 이름: ");
        String rank = inputStr("- 직급 [사원, 대리, 과장, 부장]: ");

        if (rank.equals("사원") || rank.equals("대리") || rank.equals("과장") || rank.equals("부장")) {

        } else {
            while (true) {
                System.out.println("\n[사원, 대리, 과장, 부장]만 입력이 가능합니다.");
                System.out.println("다시 입력하세요");
                rank = inputStr("- 직급 [사원, 대리, 과장, 부장]: ");
                if (rank.equals("사원") || rank.equals("대리") || rank.equals("과장") || rank.equals("부장")) {
                    break;
                }
            }
        }
        String email = inputStr("- 이메일: ");
        String phone = inputStr("- 전화번호: ");
        int family = inputNumber("- 가족 수: ");


        Member member = new Member(id, name, rank, email, phone, family);

        mc.insertMember(member);

        System.out.println("\n# 직원 등록이 완료되었습니다.");

    }


    // 2번 메뉴 처리 메서드
    // 직원 정보 조회
    // [전직원 정보 조회, 개인별 정보 조회]
    private void searchMemberInform() {

        System.out.println("\n======================== 직원 정보 조회 ========================");

        System.out.println("# 1. 전직원 정보 조회하기");
        System.out.println("# 2. 개인별 정보 조회하기");
        System.out.println("# 9. 정보 조회 메뉴 나가기");

        int menu = inputNumber("- 메뉴 입력: ");
        switch (menu) {
            case 1:
                // 전직원 정보 조회
                printAll();
                break;
            case 2:
                // 개인별 정보 조회
                searchMember();
                break;
            case 9:
                return;
            default:
                System.out.println("잘못된 메뉴 번호입니다.");
        }
    }

    // 메뉴 2-1번 처리 메서드
    // 전직원 정보 출력
    private void printAll() {
        Member[] members = mc.printAll();

        System.out.println("\n======================== 전체 직원 정보 ========================");
        System.out.println("|   사원 아이디   |   이름   |   직급   |   이메일   |   전화번호  |   가족 수   |   기본급   |   가족 수당   |   세율   |   급여   |");

        for (Member m : members) {
            if (m == null) break; // null체크
            System.out.println(m.informTotal());
        }
    }

    // 메뉴 2-2번 처리 메서드
    // 개인별 정보 조회 (아이디로 조회, 이름으로 조회)
    private void searchMember() {
        if (mc.existMemberNum() == 0) {
            System.out.println("등록된 직원이 없어 조회를 진행할 수 없습니다.");
            return;
        }

        System.out.println("\n======================== 직원 정보 조회 ========================");

        System.out.println("# 1. 아이디로 조회하기");
        System.out.println("# 2. 이름으로 조회하기");
        System.out.println("# 9. 정보 조회 메뉴 나가기");

        int menu = inputNumber("- 메뉴 입력: ");
        switch (menu) {
            case 1:
                // 아이디 조회
                searchId();
                break;
            case 2:
                // 이름 조회
                searchName();
                break;
            case 9:
                return;
            default:
                System.out.println("잘못된 메뉴 번호입니다.");
        }
    }


    // 메뉴 2-2-1번 처리 메서드
    private void searchId() {

        String targetId = inputStr("- 조회할 아이디: ");
        Member member = mc.searchId(targetId);

        if (member != null) {
            searchInformation(member);
        } else {
            System.out.println("\n입력한 아이디와 일치하는 직원이 없습니다.");
            System.out.println("다시 입력하시겠습니까? [Y/N]");

            while(true) {
                String answer = inputStr(">> ");
                switch (answer.toUpperCase().charAt(0)) {
                    case 'Y':
                    case 'ㅛ':
                        searchId();
                        break;
                    case 'N':
                    case 'ㅜ':
                        System.out.println("조회 메뉴를 종료합니다.");
                        mainMenu();
                        break;
                }
            }
        }
    }

    // 메뉴 2-2-2번 처리 메서드
    private void searchName() {
        String targetName = inputStr("- 조회할 이름: ");
        Member[] members = mc.searchName(targetName);
        if (members.length > 0) {

            for (Member member : members) {

                searchInformation(member);
            }
        } else {
            System.out.println("\n입력한 이름과 일치하는 직원이 없습니다.");
            System.out.println("다시 입력하시겠습니까? [Y/N]");

            while(true) {
                String answer = inputStr(">> ");
                switch (answer.toUpperCase().charAt(0)) {
                    case 'Y':
                    case 'ㅛ':
                        searchName();
                        break;
                    case 'N':
                    case 'ㅜ':
                        System.out.println("조회 메뉴를 종료합니다.");
                        mainMenu();
                        break;
                }
            }
        }
    }

    private void searchInformation(Member targetMember) {

        System.out.println("\n======================== 직원 정보 조회 ========================");

        System.out.println("# 1. 직원 개인정보 조회");
        System.out.println("# 2. 직원 급여 조회");
        System.out.println("# 3. 모든 정보 조회");
        System.out.println("# 9. 정보 조회 메뉴 나가기");

        int menu = inputNumber("- 메뉴 입력: ");
        switch (menu) {
            case 1:
                // 직원 개인정보 조회
                System.out.println(targetMember.informBasic());
                break;
            case 2:
                // 직원 급여 조회
                System.out.println(targetMember.informSalary());
                break;
            case 3:
                // 모든 정보 조회
                System.out.println("|   사원 아이디   |   이름   |   직급   |   이메일   |   전화번호  |   가족 수   |   기본급   |   가족 수당   |   세율   |   급여   |");
                System.out.println(targetMember.informTotal());
                break;
            case 9:
                return;
            default:
                System.out.println("잘못된 메뉴 번호입니다.");
        }
    }


    // 3번 메뉴 처리 메서드
    // 직원 정보 수정
    // [직급, 이메일, 전화번호, 가족 수]
    private void updateMember() {
        if (mc.existMemberNum() == 0) {
            System.out.println("등록된 직원이 없어 수정을 진행할 수 없습니다.");
            return;
        }
        System.out.println("\n======================== 직원 정보 수정 ========================");
        System.out.println("# 1. 직급 수정하기");
        System.out.println("# 2. 이메일 수정하기");
        System.out.println("# 3. 전화번호 수정하기");
        System.out.println("# 4. 가족 수 수정하기");
        System.out.println("# 9. 메인으로 돌아가기");

        int menu = inputNumber("- 메뉴 입력: ");
        switch (menu) {
            case 1:
                // 직급 수정
                updateRank();
                break;
            case 2:
                // 이메일 수정
                updateEmail();
                break;
            case 3:
                // 전화번호 수정
                updatePhone();
                break;
            case 4:
                // 가족 수 수정
                updateFamily();
                break;
            case 9:
                return;
            default:
                System.out.println("잘못된 메뉴 번호입니다.");
        }
    }

    // 메뉴 3-1번 처리 메서드
    private void updateRank() {
        String id = inputStr("- 직원 아이디: ");

        if (mc.checkId(id)) {
            String oldRank = mc.searchId(id).getRank();
            String newRank = inputStr("- 새로운 직급 (현재 직급: " + oldRank + "): ");

            if (newRank.equals("사원") || newRank.equals("대리") || newRank.equals("과장") || newRank.equals("부장"))
            {
                if (mc.updateRank(id, newRank)) {
                    System.out.println("\n직급 수정이 완료되었습니다.");
                } else {
                    System.out.println("\n수정에 실패하였습니다.");
                }
            } else
            {
                while (true) {
                    System.out.println("\n[사원, 대리, 과장, 부장]만 입력이 가능합니다.");
                    System.out.println("다시 입력하세요");
                    newRank = inputStr("- 새로운 직급 (현재 직급: " + oldRank + "): ");
                    if (newRank.equals("사원") || newRank.equals("대리") || newRank.equals("과장") || newRank.equals("부장")) {
                        if (mc.updateRank(id, newRank)) {
                            System.out.println("\n직급 수정이 완료되었습니다.");
                            break;
                        } else {
                            System.out.println("\n수정에 실패하였습니다.");
                        }
                    }
                }
            }

        } else {
            System.out.println("\n입력한 아이디와 일치하는 직원이 없습니다.");
            System.out.println("다시 입력하시겠습니까? [Y/N]");

            while(true) {
                String answer = inputStr(">> ");
                switch (answer.toUpperCase().charAt(0)) {
                    case 'Y':
                    case 'ㅛ':
                        updateRank();
                        break;
                    case 'N':
                    case 'ㅜ':
                        System.out.println("수정 메뉴를 종료합니다.");
                        mainMenu();
                        break;
                }
            }
        }
    }

    // 메뉴 3-2번 처리 메서드
    private void updateEmail() {
        String id = inputStr("- 직원아이디: ");

        if (mc.checkId(id)) {
            String newEmail = inputStr("- 새로운 이메일: ");

            if (mc.updateEmail(id, newEmail)) {
                System.out.println("\n이메일 수정이 완료되었습니다.");
            } else {
                System.out.println("\n수정에 실패하였습니다.");
            }

        } else {
            System.out.println("\n입력한 아이디와 일치하는 직원이 없습니다.");
            System.out.println("다시 입력하시겠습니까? [Y/N]");

            while(true) {
                String answer = inputStr(">> ");
                switch (answer.toUpperCase().charAt(0)) {
                    case 'Y':
                    case 'ㅛ':
                        updateEmail();
                        break;
                    case 'N':
                    case 'ㅜ':
                        System.out.println("수정 메뉴를 종료합니다.");
                        mainMenu();
                        break;
                }
            }
        }
    }

    // 메뉴 3-3번 처리 메서드
    private void updatePhone() {
        String id = inputStr("- 직원 아이디: ");

        if (mc.checkId(id)) {
            String newPhone = inputStr("- 새로운 전화번호: ");

            if (mc.updatePhone(id, newPhone)) {
                System.out.println("\n전화번호 수정이 완료되었습니다.");
            } else {
                System.out.println("\n수정에 실패하였습니다.");
            }

        } else {
            System.out.println("\n입력한 아이디와 일치하는 직원이 없습니다.");
            System.out.println("다시 입력하시겠습니까? [Y/N]");

            while(true) {
                String answer = inputStr(">> ");
                switch (answer.toUpperCase().charAt(0)) {
                    case 'Y':
                    case 'ㅛ':
                        updatePhone();
                        break;
                    case 'N':
                    case 'ㅜ':
                        System.out.println("수정 메뉴를 종료합니다.");
                        mainMenu();
                        break;
                }
            }
        }
    }

    // 메뉴 3-4번 처리 메서드
    private void updateFamily() {
        String id = inputStr("- 직원 아이디: ");

        if (mc.checkId(id)) {
            int newFamily = inputNumber("- 새로운 가족 수: ");

            if (mc.updateFamily(id, newFamily)) {
                System.out.println("\n가족 수 수정이 완료되었습니다.");
            } else {
                System.out.println("\n수정에 실패하였습니다.");
            }

        } else {
            System.out.println("\n입력한 아이디와 일치하는 직원이 없습니다.");
            System.out.println("다시 입력하시겠습니까? [Y/N]");

            while(true) {
                String answer = inputStr(">> ");
                switch (answer.toUpperCase().charAt(0)) {
                    case 'Y':
                    case 'ㅛ':
                        updateFamily();
                        break;
                    case 'N':
                    case 'ㅜ':
                        System.out.println("수정 메뉴를 종료합니다.");
                        mainMenu();
                        break;
                }
            }
        }
    }


    // 4번 메뉴 처리 메서드
    // 직원 정보 삭제
    private void deleteMember() {
        if (mc.existMemberNum() == 0) {
            System.out.println("\n삭제할 직원이 존재하지 않습니다.");
            return;
        }
        System.out.println("\n======================== 직원 정보 삭제 ========================");
        System.out.println("# 1. 특정 직원 삭제하기");
        System.out.println("# 2. 모든 직원 삭제하기");
        System.out.println("# 9. 메인으로 돌아가기");

        int menu = inputNumber("- 메뉴 입력: ");
        switch (menu) {
            case 1:
                // 특정 직원 삭제
                deleteOne();
                break;
            case 2:
                // 모든 직원 삭제
                deleteAll();
                break;
            case 9:
                return;
            default:
                System.out.println("잘못된 메뉴 번호입니다.");
        }
    }

    // 메뉴 4-1번 처리 메서드
    private void deleteOne() {

        String targetId = inputStr("\n# 삭제 대상 아이디: ");

        if (mc.checkId(targetId)) {
            System.out.println("\n# 직원 정보가 삭제됩니다. [Y/N]");
            String answer = inputStr(">> ");
            String name = mc.searchId(targetId).getName();

            switch (answer.toUpperCase().charAt(0)) {
                case 'Y':
                case 'ㅛ':
                    mc.delete(targetId);
                    System.out.printf("\n- [%s]직원의 데이터가 삭제되었습니다.\n", name);
                    break;
                case 'N':
                case 'ㅜ':
                    System.out.println("\n- 삭제를 취소합니다.");
                    break;
            }
        } else {

            System.out.println("\n입력한 아이디와 일치하는 직원이 없습니다.");
            System.out.println("다시 입력하시겠습니까? [Y/N]");

            while(true) {
                String answer = inputStr(">> ");

                switch (answer.toUpperCase().charAt(0)) {
                    case 'Y':
                    case 'ㅛ':
                        deleteOne();
                        break;
                    case 'N':
                    case 'ㅜ':
                        System.out.println("삭제 메뉴를 종료합니다.");
                        mainMenu();
                        break;
                }
            }
        }
    }

    // 메뉴 4-2번 처리 메서드
    private void deleteAll() {
        System.out.println("\n# 모든 정보가 삭제됩니다. [Y/N]");
        String answer = inputStr(">> ");

        switch (answer.toUpperCase().charAt(0)) {
            case 'Y':
            case 'ㅛ':
                mc.delete();
                System.out.println("\n- 모든 데이터가 삭제되었습니다.");
                break;
            case 'N':
            case 'ㅜ':
                System.out.println("\n- 삭제를 취소합니다.");
                break;
        }
    }

    // 메뉴 5번 일정관리 처리 메서드
    private void scheduleManager() {
        while (true) {
            System.out.println("\n======================== 일정 관리 진행 ========================");
            System.out.println("# 1. 신규 일정 등록");
            System.out.println("# 2. 일정 목록 조회"); // 등록된 일정 전체 조회만 가능
            System.out.println("# 3. 기존 일정 변경");
            System.out.println("# 4. 기존 일정 삭제");
            System.out.println("# 9. 일정 관리 메뉴 나가기");

            int menu = inputNumber("- 메뉴 입력: ");
            switch (menu) {
                case 1:
                    // 1. 신규 일정 등록
                    insertSchedule();
                    break;
                case 2:
                    // 2. 일정 목록 조회
                    printSchedule();
                    break;
                case 3:
                    //3. 일정 변경
                    scheduleModify();
                    break;
                case 4:
                    // 4. 기존 일정 삭제
                    deleteSchedule();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
            }
        }
    }


    // 5-1번 신규 일정 등록 처리 메서드
    private void insertSchedule() {
        System.out.println("\n======================== 신규 일정 등록 ========================");
        System.out.println("일정 관리에 필요한 정보를 차례대로 입력해주세요!");

        int idNum = 0;
        while (true) {
            idNum = inputNumber("- 일정 고유번호: ");
            if (!sm.checkIdNum(idNum)) break; // 일정 고유번호 중복 체크
            System.out.println("- 중복된 일정 번호입니다!");
        }


        int startYear = 0;
        while (true) {
            startYear = inputNumber("- 등록을 진행하려는 오늘의 연도(year)를 입력하세요(2022): ");

            if (startYear <= 9999) break;
            System.out.println("\n잘못된 입력입니다. 등록연도는 4자리까지만 입력해주세요. (ex: 2022)");
        }


        int startMonth = 0;
        while (true) {
            startMonth = inputNumber("- 등록을 진행하려는 오늘의 월(month)을 입력하세요(1~12): ");

            // 비정상적인 입력 걸러내기
            if (startMonth >= 1 && startMonth <= 12) break;
            System.out.println("\n잘못된 입력입니다. (1~12월) 사이로 입력하세요.");
        }

        int startDay = 0;
        while (true) {
            startDay = inputNumber("- 등록을 진행하려는 오늘의 일(day)을 입력하세요(1~31): ");

            // 비정상적인 입력 걸러내기
            if (startDay >= 1 && startDay <= 31) break;
            System.out.println("\n잘못된 입력입니다. (1~31일) 사이로 입력하세요.");
        }

        String toDo = inputStr("- 일정 내용을 입력해주세요: ");
        String name = inputStr("- 해당 일정의 담당자를 입력하세요.(ex: 대리 홍길동)\n" +
                "담당자가 없는 일정이라면 '-' 또는 '미정'이라고 입력하세요: ");

        int endYear = 0;
        while (true) {
            endYear = inputNumber("- 해당 일정의 마감 연도를 입력하세요: ");

            // 비정상적인 입력 걸러내기
            if (endYear <= 9999) break;
            System.out.println("\n잘못된 입력입니다. 마감연도는 4자리까지만 입력해주세요. (ex: 2022)");
        }

        int endMonth = 0;
        while (true) {
            endMonth = inputNumber("- 해당 일정의 마감 월을 입력하세요: ");

            // 비정상적인 입력 걸러내기
            if (endMonth >= 1 && endMonth <= 12) break;
            System.out.println("\n잘못된 입력입니다. (1~12월) 사이로 입력하세요.");
        }

        int endDay = 0;
        while (true) {
            endDay = inputNumber("- 해당 일정의 마감 일을 입력하세요: ");

            // 비정상적인 입력 걸러내기
            if (endDay >= 1 && endDay <= 31) break;
            System.out.println("\n잘못된 입력입니다. (1~31일) 사이로 입력하세요.");
        }

        sm.insertSchedule(idNum, startYear, startMonth, startDay, toDo, name, endYear, endMonth, endDay);
        System.out.println("\n신규 일정이 성공적으로 등록되었습니다!");
    } // end insertSchedule();


    // 5-2번 일정 목록 조회 처리 메서드
    private void printSchedule() {
        if (sm.existScheduleNum() <= 0) {
            System.out.println("등록된 일정이 없어 조회할 내용이 없습니다.");
            return;
        }

        System.out.println("\n================= 일정 목록 조회 (전체 조회만 가능합니다) =================");

        Schedule[] scheduleList = sm.schedulePrintAll();

        for (int i = 0; i < sm.existScheduleNum(); i++) {
            System.out.println(scheduleList[i].scheduleInform());
        }
        System.out.println("조회가 완료되었습니다.");
    }


    // 5-3번 일정 수정 처리 메서드
    private void scheduleModify() {
        if (sm.existScheduleNum() <= 0) {
            System.out.println("등록된 일정이 없어 변경을 진행할 수 없습니다.");
            return;
        }

        System.out.println("\n======================== 기존 일정 변경 ========================");
        System.out.println("# 1. 일정 내용 변경");
        System.out.println("# 2. 담당자 변경");
        System.out.println("# 3. 마감일자 변경");
        System.out.println("# 9. 일정 변경 메뉴 나가기");
        int menu = inputNumber("메뉴 번호: ");

        switch (menu) {
            case 1:
                // 1. 일정 내용 변경
                modifyTodo();
                break;
            case 2:
                // 2. 담당자 변경
                modifyName();
                break;
            case 3:
                // 3. 마감일자 변경
                modifyEndDate();
                break;
            case 9:
                return;
            default:
                System.out.println("잘못된 메뉴 번호입니다.");
        }
    }


    // 5-3-1번 일정 내용 변경 처리 메서드
    private void modifyTodo() {
        System.out.println("\n======================== 일정 내용 변경 ========================");
        while (true) {
            int idNum = inputNumber("- 내용을 변경할 일정의 고유번호를 입력하세요: ");
            String toDo = inputStr("- 변경할 내용을 입력하세요: ");

            if (sm.updateScheduleTodo(idNum, toDo)) {
                System.out.println("\n성공적으로 변경되었습니다.");
                break;
            } else {
                System.out.println("해당 고유번호를 가진 일정이 없습니다.");
            }
        }
    }


    // 5-3-2번 일정 담당자 변경 처리 메서드
    private void modifyName() {
        System.out.println("\n======================== 일정 내용 변경 ========================");
        while (true) {
            int idNum = inputNumber("- 내용을 변경할 일정의 고유번호를 입력하세요: ");
            String name = inputStr("- 변경할 담당자 이름을 입력하세요: ");

            if (sm.updateScheduleName(idNum, name)) {
                System.out.println("\n성공적으로 변경되었습니다.");
                break;
            } else {
                System.out.println("해당 고유번호를 가진 일정이 없습니다.");
            }
        }
    }


    // 5-3-3번 일정 마감일자 변경 처리 메서드
    private void modifyEndDate() {
        System.out.println("\n======================== 일정 내용 변경 ========================");
        while (true) {
            int idNum = inputNumber("- 내용을 변경할 일정의 고유번호를 입력하세요: ");

            int endYear = 0;
            while (true) {
                endYear = inputNumber("- 변경할 마감 연도를 입력하세요: ");

                // 비정상적인 입력 걸러내기
                if (endYear >= 2022) break;
                System.out.println("\n마감 연도는 과거일 수 없습니다.");
            }


            int endMonth = 0;
            while (true) {
                endMonth = inputNumber("- 변경할 마감 월을 입력하세요: ");

                // 비정상적인 입력 걸러내기
                if (endMonth >= 1 && endMonth <= 12) break;
                System.out.println("\n잘못된 입력입니다. (1~12월) 사이로 입력하세요.");
            }


            int endDay = 0;
            while (true) {
                endDay = inputNumber("- 변경할 마감 일을 입력하세요: ");

                // 비정상적인 입력 걸러내기
                if (endDay >= 1 && endDay <= 31) break;
                System.out.println("\n잘못된 입력입니다. (1~31일) 사이로 입력하세요.");
            }


            if (sm.updateScheduleEndDate(idNum, endYear, endMonth, endDay)) {
                System.out.println("\n성공적으로 변경되었습니다.");
                break;
            } else {
                System.out.println("해당 고유번호를 가진 일정이 없습니다.");
            }
        }
    }


    // 5-4번 기존 일정 삭제 처리 메서드
    private void deleteSchedule() {
        if (sm.existScheduleNum() <= 0) {
            System.out.println("등록된 일정이 없어 삭제를 진행할 수 없습니다.");
            return;
        }

        System.out.println("\n======================== 기존 일정 삭제 ========================");
        System.out.println("# 1. 특정 일정 삭제하기");
        System.out.println("# 2. 등록 일정 전체 삭제");
        System.out.println("# 9. 삭제 메뉴 나가기");
        int menu = inputNumber("메뉴 번호: ");

        switch (menu) {
            case 1:
                // 1. 특정 일정 삭제하기
                deleteScheduleOne();
                break;
            case 2:
                // 2. 전체 일정 삭제하기
                deleteScheduleAll();
                break;
            case 9:
                return;
            default:
                System.out.println("잘못된 메뉴 번호입니다.");
        }
    }


    // 5-4-1번 특정 일정 삭제 처리 메서드
    private void deleteScheduleOne() {
        System.out.println("\n하나의 일정을 삭제합니다.");
        int deleteId = inputNumber("- 지울 일정의 고유번호를 입력하세요: ");

        String answer = inputStr("정말 삭제하시겠습니까??[Y/N]\n>> ");

        switch (answer.toUpperCase().charAt(0)) {
            case 'Y':
            case 'ㅛ':
                if (sm.deleteScheduleOne(deleteId)) {
                    System.out.println("일정이 성공적으로 삭제되었습니다.");
                } else {
                    System.out.println("존재하지 않는 일정 고유번호입니다.");
                }
                break;
            case 'N':
            case 'ㅜ':
                System.out.println("\n- 삭제를 취소합니다.");
                break;
        }
    }


    // 5-4-2번 일정 전체 삭제 처리 메서드
    private void deleteScheduleAll() {
        System.out.println("\n전체 일정을 삭제합니다.");

        String answer = inputStr("정말 삭제하시겠습니까??[Y/N]\n>> ");

        switch (answer.toUpperCase().charAt(0)) {
            case 'Y':
            case 'ㅛ':
                sm.deleteScheduleAll();
                System.out.println("전체 일정이 성공적으로 삭제되었습니다.");
                break;
            case 'N':
            case 'ㅜ':
                System.out.println("\n- 삭제를 취소합니다.");
                break;
        }
    }


    // 입력처리를 간단하게 만드는 메서드
    private String inputStr(String msg) {
        System.out.printf(msg);
        return sc.nextLine();
    }

    private int inputNumber(String msg) {

        String value;

        while (true) {
            try {
                System.out.printf(msg);
                value = sc.nextLine();
                int nValue = Integer.parseInt(value);

                return nValue;
            } catch (NumberFormatException ex) {
//                sc.nextLine();
                System.out.println("\n숫자로만 입력하세요.");
            }
        } // end of while


    }


} // end class