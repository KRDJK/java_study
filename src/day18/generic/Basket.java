package day18.generic;

// 이 바스켓 클래스 (제네릭 클래스 = 복제 클래스)는 객체가 생성되는 시점에 타입이 결정된다.
// - 제네릭 클래스는 타입의 안정성을 제공합니다. (타입이 일치되어 있을수록 공통적으로 처리할 수 있는 것이 많아진다.)

public class Basket<F extends Fruit> { // 이게 제네릭 클래스라고 명시해주는 것 : <제네릭 타입>


    // 필드 선언
    // (ex. 과일을 하나 담을건데. 해당 과일을 담고 나서는 그 타입의 과일만 담을거야)
    private F fruit; // 관례적으로 아무거나 한 글자를 쓴다. F라는 제네릭 타입이 생긴 것임.
    // 타입을 고정시켜 놓은 것이 아님!!!

    // 다형성을 쓰면 되지 않나..? 라고 생각할 수도 있는데 그러면 생성된 이후
    // 내가 원하는건 전용 바구니다! 근데 아직 뭘 담을지 모름. 그러나 한번 담기기 시작하면 그걸로 고정할건데
    // 상위 타입으로 바꿔버리면 하위 형 변환으로 전용 바구니가 퇴색될 수 있다.


    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }


    // F타입 부분이 객체가 생성되는 순간! 해당 타입으로 변경됨. 그럼 전용바구니가 되네!

} // end class