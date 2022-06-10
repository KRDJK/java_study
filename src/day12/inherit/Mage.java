package day12.inherit;

import utility.Util;

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

    // 쌤버전 블리자드 메서드
    /*public void blizzard(Player... targets) {
        System.out.printf("# %s님 눈보라 시전!!!!\n", this.name);
        System.out.println("======================================");


        for (Player p : targets) {
            //맞은 사람이 혹시 나??
            if (p == this) continue;

            //10 ~ 15의 랜덤 피해
            int damage = (int) (Math.random() * 6 + 10);
            //실제 체력에서 차감
            p.hp -= damage;
//            p.setHp(p.getHp() - damage);

            System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                    , p.name, damage, p.hp);
        }
    }*/ // end 쌤버전 블리자드 메서드
    
    
    // 메서드
    public void blizzard(Player... targetList) {
        System.out.println(name + "님 눈보라 마법 시전!");
        Util.line();

        for (Player target : targetList) {

            if (target != this) {

                int damage = (int) (Math.random() * 6 + 10);

                if (target instanceof Warrior) {
                    target.hp -= damage;
                    System.out.println(target.name + "님이 "+ damage +"의 피해를 입었습니다. " +
                            "(남은 체력:" + target.hp + ")");
                } else if (target instanceof Hunter) {
                    target.hp -= damage;
                    System.out.println(target.name + "님이 "+ damage +"의 피해를 입었습니다. " +
                            "(남은 체력:" + target.hp + ")");
                } else if (target instanceof Mage) {
                    target.hp -= damage;
                    System.out.println(target.name + "님이 "+ damage +"의 피해를 입었습니다. " +
                            "(남은 체력:" + target.hp + ")");
                }
            }

        }

    } // end blizzard



    public void showStatus() {
        super.showStatus();
        System.out.println("# mana : " + mana);
    }

} // end class
