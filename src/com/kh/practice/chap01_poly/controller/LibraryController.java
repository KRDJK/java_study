package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.LinkedList;
import java.util.Queue;

public class LibraryController {

    private Member mem; // null로 명시 초기화

    private Book[] bList; // 크기 5 할당

    // 필요한 상수 선언
    public static final int RENT_FAIL = 1;
    public static final int RENT_SUCCESS = 0;
    public static final int RENT_SUCCESS_WITH_COUPON = 2;



    // 생성자
    public LibraryController() {
        mem = null; // 명시적으로 null 주래서 했는데 굳이 안써도 되긴 했을듯
        bList = new Book[5];
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }


    // 메서드
    // 회원정보 조회 기능
    public Member myInfo() {
        return mem;
    }

    // 도서 전체 목록 조회 기능
    public Book[] selectAll() {
        return bList;
    }


    // 매개변수로 전달받은 mem 주소값을 컨트롤러 mem에 대입하는 메서드
    public void insertMember(Member mem) {
        this.mem = mem;
    }


    /*// 키워드로 책들 찾는 메서드
    public Book[] searchBook(String keyword) {
        int count = 0;
        for (Book book : bList) {
            if (book == null) {
                continue;
            } else {
                if (book.getTitle().contains(keyword)) {
                    count++;
                }
            }
        }

        Book[] foundBookList = new Book[count];

        int idx = 0;
        for (int i = 0; i < foundBookList.length; i++) {
            for (int j = idx; j < bList.length; j++) {
                if (bList[j].getTitle().contains(keyword)) {
                    foundBookList[i] = bList[j];
                    idx = j+1;
                    break;
                }
            }
        }

        return foundBookList;
    } // end searchBook*/



    // 쌤이랑 같이 키워드 조회 기능
    public Book[] searchBook(String keyword){
        // 검색된 책들을 담아둘 큐를 생성
        Queue<Book> bookQueue = new LinkedList<>();

        // 책 검색 시작
        for (Book book : bList) {
            if (book.getTitle().contains(keyword)) {
                bookQueue.add(book);
            }
        }

        Book[] searchedList = new Book[bookQueue.size()];
        for (int i = 0; i < searchedList.length; i++) {
            searchedList[i] = bookQueue.poll();
        }

        return searchedList;
    }



    /*// 책 번호를 입력하면 확인절차 후 책을 빌려주는 메서드
    public int rentBook(int index) {
        int result = 0;

        Book target = bList[index];

        if (target instanceof AniBook) {
            int accessAge = ((AniBook) target).getAccessAge();
            if (mem.getAge() < accessAge) {
                result = 1;
            }

        } else if (target instanceof CookBook) {
            boolean isCoupon = ((CookBook) target).isCoupon();

            if (isCoupon) {
                mem.setCouponCount(mem.getCouponCount() + 1);
                result = 2;
            }
        }

        return result;
    } // end rentBook*/

    // 쌤이랑 같이!! 상수 활용!! - 책 빌리기 메서드
    public int rentBook(int index) {
        Book book = bList[index];

        // 책 정보 판단
        if (book instanceof AniBook) {
            AniBook aniBook = (AniBook) book;
            // 나이 검사
            if (aniBook.getAccessAge() <= mem.getAge()) {
                // 만화책을 빌릴 수 있는 경우
                return RENT_SUCCESS;
            }
        } else if (book instanceof CookBook) {
            CookBook cookBook = (CookBook) book;
            if (cookBook.isCoupon()) {
                // 쿠폰제공하는 경우
                mem.setCouponCount(mem.getCouponCount() + 1);
                return RENT_SUCCESS_WITH_COUPON;
            } else {
                return RENT_SUCCESS;
            }
        }
        return RENT_FAIL;
    }



} // end class
