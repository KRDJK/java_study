package day12.inherit;

public class Mage extends Player {

    public int mana; // 마력게이지
    
    
    // 생성자
    public Mage(String name) {
        super(name);
        this.name = name;
        this.level = 1;
        this.hp = 50;
        this.mana = 100;
    }


    // 메서드
    public  void blizzard() {
        System.out.println(name + "님 눈보라 마법 시전!");
    }

    public void showStatus() {
        super.showStatus();
        System.out.println("# mana : " + mana);
    }

} // end class
