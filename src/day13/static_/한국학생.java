package day13.static_;

public class 한국학생 {

    String 전공; // 학생마다 다를 수 있다.
    static String 국적; // 한국 학생이라며 무조건 한국 국적이지


    void 전공을_물어보다() {
        System.out.println(국적);
        System.out.println(전공);
    }

    static void 국적을_물어보다() {
        System.out.println(국적);
//        System.out.println(전공); // 이건 안된다.
    }


    public static void main(String[] args) {
        한국학생.국적을_물어보다();
//        한국학생.전공을_물어보다(); // 불가능!! 누구한테 물어보는거야..

        한국학생 김철수 = new 한국학생();
        김철수.전공을_물어보다();
    }

} // end class
