package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;

    public MemberController() {
        m[0] = new Member("abc", "김철수", "1234", "abc@naver.com", 'M', 24);
        m[1] = new Member("def", "박영희", "4321", "def@naver.com", 'F', 32);
        m[2] = new Member("ghi", "김철수", "6544", "ghi@naver.com", 'M', 44);
    }

    /**
     * 실제로 배열에 저장되어 있는 회원객체의 숫자를 세는 메서드
     *
     * @return count - 실제 저장된 회원의 수
     */
    public int existMemberNum() {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            if(m[i] == null) {
                break;
            }
                count++;
        }
        return count;
    }

    /**
     * 아이디 중복을 체크하는 메서드
     *
     * @param inputId - 중복을 확인할 사용자의 입력 아이디
     * @return 중복되었으면 true, 아니면 false
     */
    public boolean checkId(String inputId) {
        return findIndexById(inputId) != -1;
    }


    //멤버 배열 리턴
    public Member[] printAll() {
        return m;
    }


    //회원정보를 배열 m에 저장하는 메서드
    public void insertMember(String id, String name, String password
            , String email, char gender, int age) {
        m[this.existMemberNum()] = new Member(id, name, password, email, gender, age);
    }


    /**
     * 아이디를 입력하면 해당 회원 객체를 리턴
     *
     * @param inputId - 검색할 회원의 아이디
     * @return Member - 찾은 경우 해당 아이디를 가진 회원의 전체정보를 가진 객체
     * - 못 찾은 경우 null 리턴
     */
    public Member searchId(String inputId) {
        /*for (Member member : m) {
            if (member.getId().equals(inputId)) {
                return member;
            }
        }
        return null;*/
        int index = findIndexById(inputId);
        return (index != -1) ? m[index] : null;
    }

    /**
     *
     * @param name - 검색할 회원의 이름
     * @return 동명이인 포함 해당 이름과 일치하는 모든 회원정보 배열
     */
    public Member[] searchName(String name) {
        int count = 0;

        // iter로 m을 전부를 돌리다가 에러가 났었다 why??
        // m의 길이는 10이 고정이고 그 안에 null값이 들어있을 수 있기 때문!! null.getName이 오는 구간이 있었으니까!!
        for (int i = 0; i < existMemberNum(); i++) {
            Member member = m[i];
            if (member.getName().equals(name)) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        Member[] sameNameList = new Member[count];

        for (int i = 0; i < sameNameList.length; i++) {
            for (int j = 0; j < existMemberNum(); j++) {
                Member member = m[j];
                if (member.getName().equals(name)) {
                    sameNameList[i] = member;
                }
            }
        }

        return sameNameList;

        // 쌤버전
        /*// 임시 배열 생성
        Member[] temp = new Member[SIZE];
        int count = 0;
        for (int i = 0; i < existMemberNum(); i++) {
            if (name.equals(m[i].getName())) {
                temp[count++] = m[i];
            }
        }
        // 리턴할 배열
        Member[] returned = new Member[count];
        for (int i = 0; i < returned.length; i++) {
            returned[i] = temp[i];
        }
        return returned*/
    }

    /**
     * 회원의 비밀번호를 변경하는 메소드
     *
     * @param id          - 변경을 요청한 회원의 아이디
     * @param newPassword - 새로운 비밀번호
     * @return - 변경 성공 여부
     */
    public boolean updatePassword(String id, String newPassword) {
        if (findIndexById(id) != -1) {
            m[findIndexById(id)].setPassword(newPassword);
            return true;
        }
        return false;
    }

    /**
     * @param id      - 수정할 회원의 아이디
     * @param newName - 새롭게 수정될 새로운 이름
     * @return 수정 성공시 true
     */
    public boolean updateName(String id, String newName) {
        if (findIndexById(id) != -1) {
            m[findIndexById(id)].setName(newName);
            return true;
        }
        return false;
    }

    /**
     * @param id       - 수정할 회원의 아이디
     * @param newEmail - 새롭게 수정될 새로운 이메일
     * @return 수정 성공시 true
     */
    public boolean updateEmail(String id, String newEmail) {
        if (findIndexById(id) != -1) {
            m[findIndexById(id)].setEmail(newEmail);
            return true;
        }
        return false;
    }

    /**
     * 아이디를 통해 회원배열에서 특정 회원이 저장된 인덱스를 알려주는 기능
     *
     * @param id - 찾을 회원의 아이디값
     * @return 찾은 회원의 인덱스값, 못찾을 시 -1 리턴
     */
    public int findIndexById(String id) {
        int index = -1;
        for (int i = 0; i < this.existMemberNum(); i++) {
            if (id.equals(m[i].getId())) {
                index = i;
                break;
            }
        }

        return index;
    }

    //회원정보 하나를 삭제하는 메서드

    /**
     * @param id - 삭제를 원하는 회원의 아이디정보
     * @return 삭제성공시 true, 회원이 존재하지 않아 실패시 false
     */
    // 중간 삭제 반영이 안됐네.. 이게 맞나
    public boolean delete(String id) {
        if (findIndexById(id) != -1) {
            for (int i = findIndexById(id); i < existMemberNum()-1; i++) {
                m[i] = m[i+1];
            }

            m[existMemberNum()-1] = null;
            return true;
        }
        return false;
    }

    //회원정보 전체 삭제
    public void delete() {
        int count = existMemberNum();
        // 그냥 다이렉트로 existMemberNum을 쓰면 i++이 될 때마다 새로 existMemberNum을 갱신함..
        // 그럼 1회차 이후로는 쭉 0으로 되면서 0 이후 인덱스들을 제대로 삭제할 수 없다..
        for (int i = 0; i < count; i++) {
            m[i] = null;
        }
    }


} // end class