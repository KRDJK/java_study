package day08.player;

public class Player {

    String name; // 닉네임
    int level; // 레벨
    int hp; // 체력


    // 생성자
    Player() {
        this("이름없음"); // 주의 사항!!! 이 this 호출문은 쓸거면 맨 위에 있어야 한다.
        System.out.println("1번 생성자 호출!");
//        this.name = "이름없음";
//        this.level = 1;
//        this.hp = 50;
    }

    Player(String name) {
        this(name, 1, 50);
        System.out.println("2번 생성자 호출!");
//        this.name = name;
//        this.level = 1;
//        this.hp = 50;
    }

    Player(String name, int level, int hp) {
            // 만약에 name, name이면 구분이 안되서 얘가 에러를 내는데 this를 쓰면 됨.
        this.name = name;
        this.level = level;
        this.hp = hp;
    }







    // 메서드
    void attack(Player target) {
                // 매개변수가 하나처럼 보이지만 사실은 2개다. 누가 숨어있지? 자기 자신 타입의 this가 숨어있다.
        // 출력메시지 : x가 y를 공격합니다.
        // 상대방의 체력을 10 낮추고, 나의 체력을 5 회복하고 싶다면??
//        System.out.println("this = " + this);     검증용
//        System.out.println("target = " + target); 검증용
        if (this == target) { // 주소 비교니까 == 비교를 할 수 있다. .name끼리였으면 문자열이라 .equals였겠군..
            System.out.println("자해할 수는 없어요..");
            return;
        }
        System.out.println(this.name + "가 " + target.name + "를 공격합니다.");
        target.hp -= 10;
        this.hp += 5;
        System.out.printf("나의 체력: %d, 상대방 체력: %d\n", this.hp, target.hp);
    }


    // 캐릭터 정보 출력 메서드 (main2에서 활용)
    void info() {
        System.out.printf("이름: %s, 레벨: %d, 체력: %d\n", name, level, hp);
    }


} // end class
