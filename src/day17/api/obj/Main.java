package day17.api.obj;

import utility.Util;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Pen pen1 = new Pen(123, "빨강", 1000);
        Pen pen2 = new Pen(new Company("모나미", "서울"),
                456, "노랑", 900);
        Pen pen3 = new Pen(123, "초록", 1100);


        // pen2를 복사해서 pen4에 대입
//        Pen pen4 = pen2; // pen2의 주소값이 들어가는 것! 둘 다 pen2가 된다.
//        Pen pen4 = new Pen(pen2.serial, pen2.color, pen2.price); // 이래야 복사가 된다.
        //  근데 너무 비효율적인걸..? clone해보자
//        Pen pen4 = (Pen) pen2.clone(); // 형변환하는 이유 clone의 리턴타입이 Object라서.
        Pen pen4 = pen2.deepClone();


        pen2.color = "노오오오오란색";
        pen2.company.address = "부산";
        // 이렇게 하면 pen2.컴퍼니의 부분만 바뀌어야 하는데.. pen4.컴퍼니도 가네..? 얕은 복사다
        // 저 company를 생성하는 부분이 먼저 실행될 때 new Company를 Company com1 이라고 변수에 저장해서 비교해보면 더 이해가 쉬울듯!

        // 이게 얕은 복사다.
        // 그럼 복사했을 때 기존 Company와 같은 속성값을 지닌 새로운 Company를 만들게 했으려면???
        // 우리가 deepClone을 따로 구현해야한다.


        System.out.println("pen2 = " + pen2); // pen2.toString()이 생략되어 있는 것!!!
        System.out.println("pen4 = " + pen4);


        // 같은 일련번호를 가지면 같은 공장에서 생산된 제품이라고 가정.
//        System.out.println(pen1 == pen3); // 이러면 주소값 비교다.
        System.out.println(pen1.equals(pen3));



        Util.line();


        Count c = null; // 이러면 배열에 넣은게 아니라서 마지막 회차의 객체만 저장되어 있다.
        // 그럼 나머지 19개의 허공 메모리에 있는 객체들은???
        // c 언어의 경우 그 19개 객체들을 heap에서 매번 제거해줘야함.
        // 자바는 자동으로 19개를 알아서 처리해준다. 누가?? 가상머신인 GC (가비지컬렉터 = 쓰레기 수집가)
        // 지워주는 시기도 지 맘대로, 순서도 지 맘대로다. 아무도 모름..
        for (int i = 0; i < 20; i++) {
            c = new Count(i + 1);
            c = null;

            System.gc(); // 이걸 쓰면 가비지 컬렉터를 좀 더 빨리 가동
            // 지 멋대로 아무때나, 아무거나 소멸시키네..?? 이래서 게임 만드는데에 자바가 적합하지 않다.
        }



    } // end main
} // end class
