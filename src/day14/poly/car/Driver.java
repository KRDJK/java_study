package day14.poly.car;

public class Driver {

    public void drive(Car c) {
        System.out.println("운전을 시작합니다.");
        c.run();
    }

//    public void drive(Granduer g) {
//        System.out.println("운전을 시작합니다.");
//        g.run();
//    }


    public Car buyCar(String carName) {
        if (carName.equals("스팅어")) {
            System.out.println("스팅어를 구매합니다.");
            return new Stinger(); // 여기서 리턴 스팅어라고 리턴타입 스팅어로 잡으면 여기만 해결된다.
        } else if (carName.equals("그랜져")) {
            System.out.println("그랜져를 구매합니다.");
            return new Granduer();
        } else if (carName.equals("머스탱")) {
            System.out.println("머스탱을 구매합니다.");
            return new Mustang();
        } else {
            System.out.println("없는 차종입니다.");
            return null;
        }
    }



} // end class
