package com.kh.example.practice6.model.vo;

public class Book {

    String title;
    String publisher;
    String author;
    int price;
    double discountRate;



    public Book() {

    }

    public Book(String t, String p, String a) {
        title = t;
        publisher = p;
        author = a;
    }

    public Book(String t, String p, String a, int pr, double dr) {
        title = t;
        publisher = p;
        author = a;
        price = pr;
        discountRate = dr;
    }



    public void inform () {
        System.out.println("제목 = " + title);
        System.out.println("출판사 = " + publisher);
        System.out.println("작가 = " + author);
        System.out.println("가격 = " + price);
        System.out.println("할인율 = " + discountRate);
    }
}
