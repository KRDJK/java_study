package com.kh.practice.point.model.vo;

public class Circle extends Point {

    private int radius;

    public Circle() {

    }

    public Circle(int x, int y, int radius) {
        super(x, y); // 이 부분 유의!
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + ", radius: " + radius; // 여기 다시보기
    }
}
