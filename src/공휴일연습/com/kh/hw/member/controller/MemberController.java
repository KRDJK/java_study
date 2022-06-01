package 공휴일연습.com.kh.hw.member.controller;

import 공휴일연습.com.kh.hw.member.model.vo.Member;

public class MemberController {

    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;


    // 생성자는 원래 안두는걸로 되어 있었으낭 원활한 확인을 위해 임시 생성
    public MemberController() {
        m[0] = new Member("abc", "김철수", "1234", "abc@naver.com", 'M', 24);
        m[1] = new Member("def", "박영희", "4321", "def@naver.com", 'F', 32);
        m[2] = new Member("ghi", "김철수", "6544", "ghi@naver.com", 'M', 44);
    }

                        // =============== 메서드 =======================

    // 현재 존재하는 멤버 수를 반환하는 메서드
    public int existMemberNum() {
        int count = 0;

        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) break;
            else count++;
        }

        return count;
    }


    // 아이디가 중복되었는지를 확인하는 메서드
    public boolean checkId (String inputId) {
        for (int i = 0; i < existMemberNum(); i++) {
            if (m[i].getId().equals(inputId)) {
                return true;
            }
        }
        return false;
    }


    // 멤버 객체를 반환하는 메서드 ( 데이터 다 뽑나? )
    public Member[] printAll() {
        return m;
    }


                        // =============== 삽입 =======================

    // 멤버 객체를 객체배열에 저장하는 메서드
    public void insertMember(String id, String name, String password,
                             String email, String gender, int age) {

        // 성별을 String으로 받았기 때문에 char로 변환 먼저 해주고 매개변수로 넣기
        char sex = ' ';

        switch (gender) {
            case "남자": case "남": case "맨": case "m": case "M": case "男": {
                sex = 'M';
            }
            case "여자": case "여": case "걸": case "g": case "G":
                case "녀": case "女": case "f": case "F": {
                sex = 'F';
            }
        }

        m[existMemberNum()] = new Member(id, name ,password, email, sex, age);
    }


                        // =============== 조회 =======================

    // id로 회원을 조회하는 메서드
    public Member searchId(String id) {

        for (int i = 0; i < existMemberNum(); i++) {
            if (m[i].getId().equals(id)) {
                return m[i];
            }
        }

        return null;
    }


    // 이름으로 회원을 조회하는 메서드
    public Member[] searchName(String name) {
        int count = 0; // 같은 닉네임이 얼마나 있는지 카운트할 변수.

        for (int i = 0; i < existMemberNum(); i++) {
            if (m[i].getName().equals(name)) {
                count++;
            }
        }

        // 카운트가 끝난 후
        if (count == 0) { // 같은 이름이 하나도 없는 경우
            return null;
        }
        else { // 같은 이름의 회원이 있는 경우 그들의 전체정보를 새로운 배열에 저장하여 리턴
            Member[] sameNameList = new Member[count];

            for (int i = 0; i < sameNameList.length; i++) {
                for (int j = i; j < existMemberNum(); j++) {
                    if (m[j].getName().equals(name)) {
                        sameNameList[i] = m[j];
                        break;
                    }
                }
            }
            return sameNameList;
        }
    }
//
//
//    // 이메일로 회원을 조회하는 메서드
//    public Member[] searchEmail(String email) {
//
//    }


                        // =============== 수정 =======================

    // id를 받아 해당 id의 비밀번호 정보를 변경하는 메서드
    public boolean updatePassword(String id, String password) {
        int idIndex = -1;

        for (int i = 0; i < existMemberNum(); i++) {
            if (m[i].getId().equals(id)) {
                idIndex = i;
                break;
            }
        }

        if (idIndex != -1) {
            m[idIndex].setPassword(password);
            return true;
        } else {
            return false;
        }
    }


    // id를 받아 해당 id의 이름 정보를 변경하는 메서드
    public boolean updateName(String id, String name) {
        int idIndex = -1;

        for (int i = 0; i < existMemberNum(); i++) {
            if (m[i].getId().equals(id)) {
                idIndex = i;
                break;
            }
        }

        if (idIndex != -1) {
            m[idIndex].setName(name);
            return true;
        } else {
            return false;
        }
    }


//    // id를 받아 해당 id의 이메일 정보를 변경하는 메서드
//    public boolean updateEmail(String id, String email) {
//
//    }
//
//
                        // =============== 삭제 =======================

    // 한 명의 회원을 삭제하는 메서드
    public boolean delete(String id) {
        int idIndex = -1;

        for (int i = 0; i < existMemberNum(); i++) {
            if (m[i].getId().equals(id)) {
                idIndex = i;
                break;
            }
        }

        if (idIndex != -1) { // 지울 아이디가 존재하는 경우
            for (int i = idIndex; i < existMemberNum()-1; i++) {
                m[i] = m[i+1];
            }

            m[existMemberNum()-1] = null;

            return true;

        } else { // 지울 아이디가 없는 경우
            return false;
        }
    }


    // 전체 회원을 삭제하는 메서드
    public void delete() {
        int temp = existMemberNum();
        for (int i = 0; i < temp; i++) {
            m[i] = null;
        }
    }



} // end class
