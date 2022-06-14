package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {

    private String maker; // 제조사 정보


    // 생성자
    public SmartPhone() {
    }


    // 메서드
    public abstract String printInformation(); // 스마트폰의 제원 정보를 출력하기 위한 추상 메서드

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
} // end class
