package day17.api.time;

import utility.Util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class LocalDateExample {
    public static void main(String[] args) {

//        Calendar cal = Calendar.getInstance();

        // 현재 날짜 정보 얻기 (연, 월, 일)
        LocalDate now = LocalDate.now();
        System.out.println(now);


        // 현재 시간 정보 얻기 (시, 분, 초)
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);


        // 현재 날짜와 시간 정보 얻기 (연, 월, 일, 시, 분, 초)
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        
        
        // 특정 날짜와 시간 정보 얻기
        LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println("beginDate = " + beginDate);


        // 연도 추출하기
        int year = localDateTime.getYear();
        System.out.println("year = " + year);

        int monthValue = localDateTime.getMonthValue();
        System.out.println("monthValue = " + monthValue); // 6월이라 6 나옴.

        Month month = localDateTime.getMonth();
        System.out.println("month = " + month); // 6월이라 June이 나옴.


        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear); // 1년 중 몇번 째 day냐?? 6월 15일은 166일째다.



        Util.line();



        // 지금으로부터 3일 뒤 (반납일)
        LocalDateTime returnDate = localDateTime.plusDays(3);
        System.out.println("returnDate = " + returnDate);
        
        
        // 지금으로부터 1년 2개월 7일 뒤
        LocalDateTime d1 = localDateTime.plusYears(1).plusMonths(2).plusDays(7);



        // 사이 날짜 연산
        LocalDate b = LocalDate.of(2020, 12, 30);

        LocalDate f = LocalDate.of(2022, 9, 14);

        long between = ChronoUnit.DAYS.between(b, f);
        System.out.println("between = " + between); // 전역일자 계산기 유용하겠군
        


        Util.line();
        // 날짜 포맷 변경하기
        System.out.println(localDateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분");
        System.out.println(localDateTime.format(dtf));


    } // end main
} // end class
