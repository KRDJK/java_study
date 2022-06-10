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

    // 쌤버전 러쉬 메서드
    /*public void rush(Player target) {
        System.out.printf("%s님이 %s님에게 FireRush를 시전했습니다!\n"
                , this.name, target.name);
        int damage;
        String job;
        if (target instanceof Warrior) {
            damage = 10;
            job = "전사";
        } else if (target instanceof Mage) {
            damage = 20;
            job = "마법사";
        } else if (target instanceof Hunter) {
            damage = 15;
            job = "사냥꾼";
        } else {
            damage = 0;
            job = "미확인";
        }
        target.hp -= damage;
        System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n"
                , target.name, job, damage);
        System.out.printf("%s님의 현재 체력: %d\n"
                , target.name, target.hp);
        System.out.println();
    }*/ // end 쌤버전 러쉬 메서드
    
    // 메서드
    public void rush(Player target) {
        System.out.println(name + "님이 " + target.name + "님에게 FireRush를 시전했습니다!");

        if (target != this) {
            if (target instanceof Warrior) {
                target.hp -= 10;
                System.out.println(target.name + "(전사)님이 10의 피해를 입었습니다.\n"
                        + target.name + "(전사)님의 현재 체력: " + target.hp);
            } else if (target instanceof Hunter) {
                target.hp -= 15;
                System.out.println(target.name + "(사냥꾼)님이 15의 피해를 입었습니다.\n"
                        + target.name + "(사냥꾼)님의 현재 체력: " + target.hp);
            } else if (target instanceof Mage) {
                target.hp -= 20;
                System.out.println(target.name + "(마법사)님이 20의 피해를 입었습니다.\n"
                        + target.name + "(마법사)님의 현재 체력: " + target.hp);
            }
        }
        System.out.println();
    }

    
    // 오버라이딩 룰 체크
    public void showStatus() { // 부모가 물려준 이름 그대로!! 부모가 매개변수를 받으면 똑같이 받아야하고!! 리턴타입도!!
        super.showStatus(); // 부모가 물려준 원본을 호출할 수 있다. 여기선 this 활용 불가!! why? Warrior 클래스 안에서도 showStatus가 있잖아!
        System.out.println("# rage : " + rage);
    }

} // end class
