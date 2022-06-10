package com.kh.practice.chap01_poly.model.vo;

public class Book {

    private String title; // 도서명

    private String author; // 작가명

    private String publisher; // 출판사명


    public Book() {
    }

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // 메서드
    @Override
    public String toString() {
        return String.format("[Book [title=%s, author=%s, publisher=%s]", title, author, publisher);
    }


    // getter / setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

} // end class
