package Jungsuk_Quiz.Chapter02_Variable;

public class Quiz09 {
    public static void main(String[] args) {
        /*
        다음 중 형변환을 생략할 수 있는 것은 모두 고르시오. ( a, b, e )
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        a. b = (byte)i;
        b. ch = (char)b;
        c. short s = (short)ch;
        d. float f = (float)l;
        e. i = (int)ch;

        정답 : d, e...
            - byte b = 10; 우항 리터럴 타입이 int라서 byte로의 변환이 필요함.
            - char ch = (char) 'A'; 우항 리터럴 타입은 byte라서 char가 더 크니까 생략될거 같지만
                                        표현 범위가 달라서 형변환이 필요하다고 함.
            - short s - (short) ch; 같은 2바이트지만 표현 범위가 달라서 필요하다고 함.
            !! 표현 범위가 다르다는 뜻은 char에는 음수 표현이 없기 때문!!!
        */
    }
}
