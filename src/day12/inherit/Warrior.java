package day12.inherit;

// 자식 클래스 (sub class)
public class Warrior extends Player {
    
    public int rage; // 분노 게이지
    
    
    // 생성자
    public Warrior(String name) {
//        super(); ==>> 이게 생략되어 있는거다. Player(); 이게 있는 것과 같다.
        super(name);
//        System.out.println("Warrior 생성자 호출!");
        // 원래는 super.level이 맞지만 this.level이라고 해도 된다.
    }


    // 메서드
    public void rush() {
        System.out.println(name + "님이 돌진합니다.");
    }

    
    // 오버라이딩 룰 체크
    public void showStatus() { // 부모가 물려준 이름 그대로!! 부모가 매개변수를 받으면 똑같이 받아야하고!! 리턴타입도!!
        super.showStatus(); // 부모가 물려준 원본을 호출할 수 있다. 여기선 this 활용 불가!! why? Warrior 클래스 안에서도 showStatus가 있잖아!
        System.out.println("# rage : " + rage);
    }

} // end class
