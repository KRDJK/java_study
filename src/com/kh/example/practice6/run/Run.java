package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
    public static void main(String[] args) {
        Book book1 = new Book();

        Book book2 = new Book("해리포터", "aaa", "jk롤링");

        Book book3 = new Book("원피스", "점프", "오다 에이치로", 9900,10);

        book1.inform();
        System.out.println("==================================");
        book2.inform();
        System.out.println("==================================");
        book3.inform();


//        new Book()
    }
}
