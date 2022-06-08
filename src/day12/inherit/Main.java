package day12.inherit;

public class Main {
    public static void main(String[] args) {

        Warrior w = new Warrior("키보드워리어");
        
        Mage m = new Mage("번개왕썬더");

        Hunter h = new Hunter("멍멍이조련사");

        Rogue r = new Rogue("다크로드");


        w.level = 10;
        w.showStatus();
//        w.rush();
        m.showStatus();
        h.showStatus();

        r.showStatus();

        w.exp = 100;
        m.exp = 50;
        h.exp = 200;

//        w.equals(); // 이게 왜 돼?? 어딘가에서 물려받았기 때문 Player에도 없는데??
                        // Player도 부모가 있다.
        
    }
}