package miniproject.com.kh.hw.member.controller;

import miniproject.com.kh.hw.member.model.vo.Member;

public class MemberController {

    private Member[] m = new Member[SIZE];

    public static final int SIZE = 10;


    // 생성자
    public MemberController() {
        m[0] = new Member("hgd220602","홍길동", "부장", "abc@naver.com", "010-1234-5678", 4);
        m[1] = new Member("kcs220602","김철수", "대리", "def@naver.com", "010-4567-1234", 5);
    }

    // 메서드
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

    // 멤버 객체를 반환하는 메서드
    public Member[] printAll() {
        return m;
    }


    // 신규 직원을 등록하는 메서드
    public void insertMember(String id, String name, String rank, String email, String phone, int family) {
        m[existMemberNum()] = new Member(id, name, rank, email, phone, family);
    }




} // end class
