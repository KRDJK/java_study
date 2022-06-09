package day13.static_;

public class Count {

    public int x; // 인스턴스 필드

    public static int y; // 정적 필드

    // 메서드
    public void m1() { // 인스턴스 메서드
        System.out.println("x = " + this.x);
        System.out.println("y = " + y);
    }

    // static 블록 ( 메서드, 정적 초기화자 ) 에서는
    // static 필드, 메서드만!! 참조 가능. ??????????
    // static블록은 this를 사용할 수 없음.
    public static void m2() { // 정적 메서드
        Count ccc = new Count();
        System.out.println("x = " + ccc.x); // 여기서 문제가 생기네.
                                            // static은 객체 생성 없이도 쓸 수 있는데
                                            // this.x면 누구의 x인지 어케 알아!!
//        System.out.println(ccd.x); // ccd가 누군데
        System.out.println("y = " + y);
    }


} // end class
