package day14.poly;

import day12.inherit.Hunter;
import day12.inherit.Mage;
import day12.inherit.Warrior;
import utility.Util;

public class PlayerQuiz {
    public static void main(String[] args) {

        Mage m = new Mage("눈보라왕");
        Warrior w = new Warrior("주차왕파킹");
        Hunter h = new Hunter("멍멍이조아여");

        m.blizzard(w, h);
        m.blizzard(w);
        m.blizzard(h, m, new Mage("마법의제왕")); // 헌터, 다른 메이지만 피해입고 나는 피해 안입음


        Util.line();


        w.rush(m); // -20
        w.rush(h); // -15
        w.rush(new Warrior("짱쎈전사")); // -10


    } // end main
} // end class
