package day14.poly.car;

import utility.Util;

public class Main {

    public static void main(String[] args) {

        Car g1 = new Granduer();
        Car g2 = new Granduer();
        Car g3 = new Granduer();


        Car m1 = new Mustang();
        Car m2 = new Mustang();


        Car s1 = new Stinger();
        Car s2 = new Stinger();


        Car[] cars = {g1, g2, g3, m1, m2, s1, s2,
                new Granduer(), new Mustang(), new Stinger()};

        for (Car car : cars) {
            car.run();
        }



            // 이것도 가능하다. 그렇지만 공통된 메서드가 없기 때문에 좋은 방법은 아니다.
        Object[] oArr = {
                10, 3.3, "하하호호", new Mustang(), true, false
        };


        System.out.println("==============================");

        Driver kim = new Driver();
        kim.drive(new Mustang());
        kim.drive(new Granduer());


        System.out.println("==============================");
        Car myCar = kim.buyCar("그랜져");
        myCar.run(); // 실제 들어간 객체가 그랜져기 때문에 오버라이딩된 그랜져가 달립니다가 나온다.


        kim.buyCar("머스탱").run();
//        new Driver().buyCar("").run();

        kim.drive(kim.buyCar("스팅어"));


        System.out.println("==============================");

        Mustang mm = new Mustang();
        Car cc = mm; // 업캐스팅이 자동으로 되기 때문에 앞에 (Car)를 붙일 필요가 없다.

        mm = (Mustang) cc; // 다운 캐스팅 이걸 왜 할까??

        System.out.println(mm);
        System.out.println(cc);


        // 애초에 안되는 문법 - 부모 객체를 자식타입으로 변환할 수 없음.
//        Car ccc = new Car();
//        Mustang mmm = (Mustang) ccc;

        System.out.println("================================");

        Car myMs = kim.buyCar("머스탱");
         //Stinger myMs = (Stinger) kim.buyCar("머스탱");
//        Mustang myMs = (Mustang) kim.buyCar("머스탱");
        myMs.run();
        ((Mustang)myMs).joinMustangClub();


        Util.line();

        CarShop shop = new CarShop();
        int money = shop.sellCar(new Car());
        System.out.println("money = " + money);


        Util.line();


        cast(m1);


    } // end main


    public static void cast(Object o) {

        if (o instanceof String) {
            String s = (String) o;
            System.out.println("스트링 변환 성공!");
        } else {
            System.out.println("변환 불가능!");
        }

    }


} // end class
