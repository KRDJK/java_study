package day07;

// 핸드폰 설계도
// 설계도로 쓸 클래스는 main을 만들지 않습니다.
    // 여기다 메인을 만들면 설계도로 핸드폰 기능을 수행하라는 뜻과 같다.. 말이 안되잖아?
    // 그래서 만들지 않는다.
public class Phone {
    
    // 속성 : 객체의 데이터 (field)

    // 고유 속성 (잘 바뀌지 않는 부분)
    String model; // 모델명 갤럭시 만드는데 그걸 아이폰이라고 바꿀거냐..? 그게 가능..? ㄴㄴ 그래서 고유속성
    String color; // 색상
    int price; // 출고가 (판매가는 변할 수 있으나 출고가는 거의 고정)

    
    // 상태 속성
    int messageCount; // 받은 문자메시지 수!   매우 가변적
    boolean on; // 전원이 켜진 여부!!


    // 부품 속성
    String[] receiveMessages = new String[3]; // 문자메시지함


    // 생성자 (constructor) : 객체의 초기화를 담당하며, 객체 생성시 반드시 호출!!
    // 하나도 선언하지 않을 시 자동으로 기본 생성자가 만들어진다.
        // 생성자 함수의 이름은 클래스의 이름과 대소문자가 완벽히 같아야 함.
            // 만약에 완벽히 같게 만들지 않으면?? 생성자가 아닌 일반 메서드로 인식함.


    // 매개변수가 없는 생성자 => 기본 생성자라고 함. 아래 Phone!! 괄호가 비어있다.
    Phone() { // 얘는 무조건 void 함수!! 다른 리턴 자체를 줄 수 없음. 그래서 void란 말 자체도 쓰지 않음.
        System.out.println("1번 생성자 호출!");
        model = "애니콜";
        color = "그레이";
        price = 120000;
        powerOn();
        // 이렇게 하면...
        // 객체를 만들자마자 쓸 수 있도록 처음에 만들 때부터 세팅해줄 수 있음!!
        Math.random(); // 메서드나 생성자 안에서만 메서드 호출해야함.
    }

    // 생성자 오버로딩 : 생성자를 중복 선언
        // 오버로딩을 할 때는 매개변수를 받아야 함.
    Phone(String pModel) {
        System.out.println("2번 생성자 호출!");
        model = pModel;
        color = "사파이어";
        price = 500000;
        powerOn();
    }

    Phone(String pModel, String pColor) {
        System.out.println("3번 생성자 호출!");
        model = pModel;
        color = pColor;
        price = 800000;
        powerOn();
    }

    Phone(String pModel, String pColor, int pPrice) {
        System.out.println("4번 생성자 호출!");
        model = pModel;
        color = pColor;
        price = pPrice;
        powerOn();
    }





    // 기능 : 객체의 행위, 동작 (method)
    // 설계도의 메서드는 static을 붙이지 말 것!!!


    // 전원을 켜는 기능!!      기능이 쓰여 있지만 여기서 실행하는건 불가능하다. why? 설계도를 주고 전원 키라고 하면 되냐?? ㄴㄴ
    void powerOn() {
        on = true;
        System.out.println(model + "의 전원을 켭니다.");
    }


    // 전원을 끄는 기능
    void powerOff() {
        on = false;
        System.out.println(model + "의 전원을 끕니다.");
    }


    // 핸드폰 정보를 알려주는 기능
    void showSpec() {
        if (!on) {
            System.out.println(model + "의 전원을 먼저 켜세요.");
            return;
        }
        System.out.println("\n 휴대폰 정보");
        System.out.println("* 모델명: " + model);
        System.out.println("* 색상: " + color);
        System.out.println("* 가격: " + price);
    }

    
    // 메시지를 보내는 기능
    // 아이폰.메시지를 보낸다(갤럭시);
    // 고양이.먹는다(참치캔);
    void sendMessage(Phone targetPhone, String msg) {
        // 상대방의 메시지함이 가득차있는가??  의문 : 근데 받을 때 내가 가득 찼으면 못 받는게 더 낫지 않나?
        if (targetPhone.receiveMessages.length > targetPhone.messageCount) {
            // 상대방 메시지함에 메시지 넣기
            targetPhone.receiveMessages[targetPhone.messageCount] = msg + "by *" + model;
            targetPhone.messageCount++;
        } else { // 가득 찬 경우
            System.out.println(targetPhone.model + "의 메시지함이 가득찼습니다.");
            
        }
    }
    
    // 수신메시지를 확인하는 기능(메시지함을 열어보는 기능)
    void checkMessages() {
        System.out.printf("\n============ [%s]의 메시지함 ==================\n", model);

        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i+1, receiveMessages[i]);
        }
    }


} // end class
