package day07;

// 실행용 클래스
// main 메서드를 생성
public class PhoneFactory {

    public static void main(String[] args) {

        // Phone 객체 생성
        // 객체의 타입은 클래스 이름과 같다.

        // 메서드 안에 있기 때문에 얘는 변수다.
        Phone galaxy = new Phone(); // 이러면 폰이 만들어지고 이걸 인스턴스라고 부름.
        // 앞에 Phone은 갤럭시의 타입임.
        // 우항의 new Phone에서 Phone은 생성자 함수!!! (설계도를 가지고 만들게 해주는 기술자 역할)
            // 근데 저런 함수를 만든 적이 없는데????


        // 객체의 속성과 기능을 참조.( . 연산자를 사용해야함  .은 참조 연산자)
            // 얘네는 변수 개념이 아니라 속성 개념이다.
//        galaxy.model = "갤럭시 S21"; // model이 String 타입이라서 이렇게 대입.
//        galaxy.color = "펄 블루";
//        galaxy.price = 1000000;
        galaxy.model = "갤럭시"; // 애니콜로 태어나놓고 이름만 갤럭시로 바꿔..? 이상해..

//        galaxy.powerOn();
        galaxy.showSpec();

        System.out.println("=====================================");

        Phone iPhoneX = new Phone("아이폰X");
        iPhoneX.showSpec();

        System.out.println("==========================================");

        Phone gNote = new Phone("갤럭시 노트", "제니레드");
        gNote.showSpec();

        System.out.println("=====================================");

        Phone xhaomi = new Phone("샤오미3.0", "화이트", 200000);
        xhaomi.showSpec();

    }
}
