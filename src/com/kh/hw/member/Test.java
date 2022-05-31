package com.kh.hw.member;

import com.kh.hw.member.controller.MemberController;

public class Test {

    public static void main(String[] args) {

        MemberController mc = new MemberController();
        System.out.println(mc.existMemberNum());


        /*
        확인용
        int idx = mc.findIndexById("ghi");
        System.out.println(idx); // 2
        int idx1 = mc.findIndexById("ghi1234");
        System.out.println(idx1); // -1


        System.out.println(mc.checkId("abc")); // true
        System.out.println(mc.checkId("abc1234")); //false
        */

        mc.insertMember("zzz", "김철수", "1111", "ㅇ@ㅇ.ㅇ", 'M', 28);
        System.out.println(mc.existMemberNum()); // 4
        System.out.println(mc.checkId("zzz")); // true 중복이다!


        System.out.println(mc.searchId("abc"));
        System.out.println(mc.searchName("김철수"));

    }
}
