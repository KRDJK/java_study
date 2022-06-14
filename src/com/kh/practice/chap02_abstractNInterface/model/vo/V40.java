package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen {
    // 생성자
    public V40() {
        this.setMaker("LG");
    }

    // 메서드
    @Override
    public String picture() {
        return "1200, 1600만 화소 트리플카메라\n";
    }

    @Override
    public String charge() {
        return "고속충전, 고속 무선 충전\n";
    }

    @Override
    public boolean bluetoothPen() {
        return false;
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름\n";
    }

    @Override
    public String takeCall() {
        return "전화받기 버튼을 누름\n";
    }

    @Override
    public String printInformation() {
        return String.format("V40은 "+ getMaker() + "에서 만들어졌고 제원은 다음과 같다\n" +
                makeCall() + takeCall() + picture() + charge() + touch()
                + "블루투스 펜 탑재 여부 : " + bluetoothPen());
    }

    @Override
    public String touch() {
        return "정전식\n";
    }
}
