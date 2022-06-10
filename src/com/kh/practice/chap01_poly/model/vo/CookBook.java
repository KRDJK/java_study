package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {

    private boolean coupon; // 요리학원 쿠폰유무

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    // 메서드
    @Override
    public String toString() {
        return String.format("CookBook %s, coupon=%b]", super.toString(), coupon);
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
} // end class
