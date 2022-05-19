package day02;

public class StdOutput {

    public static void main(String[] args) {

        String dog = "멍멍이", cat = "야옹이";

        System.out.print(dog);
        System.out.println(cat);

        //System.out.print(dog);
        //System.out.print(cat);
        // 이러면 "멍멍이야옹이" 이렇게 나옴

        int month = 7;
        int day = 17;
        String anniversary = "제헌절";

        System.out.println(month + "월 "
                + day + "일은 "
                + anniversary + "입니다.");

        // 포맷 문자 형식
        // %d: 10진수 정수, %f: 실수, $s: 문자열, $c: 단일문자
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anniversary);
//        System.out.printf("%d월 %d일은 %s입니다.\n", month, day);
        // ㄴ %는 3개 줘놓고 month, day 등 인수를 2개만 주면 에러난다.
        // %는 3개인데 인수를 더 많이 주면?? 정상 실행된다.
        // %d라고 해놓고 문자열을 줘버리면??? 에러난다.
        System.out.println(dog);


//        double rate = 25.4567;
//        System.out.printf("비율은 %f입니다.\n", rate); // 이랬더니 25.456700 이라고 나오네??

//        double rate = 25.45;
//        System.out.printf("비율은 %f입니다.\n", rate); // 이랬더니 25.450000 이라고 나오네

        // %f: 강제로 소수점 6자리를 표현합니다.
        double rate = 25.45678901234;
        System.out.printf("비율은 %f입니다.\n", rate); // 이랬더니 25.456789 이라고 나오네
        System.out.printf("비율은 %.4f입니다.\n", rate); // 이랬더니 25.4567 이라고 나오네
        System.out.printf("비율은 %.2f입니다.\n", rate); // 이랬더니 25.45 이라고 나오네
//        System.out.printf("비율은 %.2f%입니다.\n", rate); // 이랬더니 오류남. %입이 뭐냐고 묻다니..
        System.out.printf("\\비율은 %.2f%%입니다.\n", rate); // 이래야 뒤에 %입니다.라고 제대로 나옴.



    }

}
