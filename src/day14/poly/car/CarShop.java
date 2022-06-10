package day14.poly.car;

public class CarShop {

    // 차를 판매하는 기능
    public int sellCar(Car car) {

        if (car instanceof Granduer) { // 매개변수로 들어온 car가 그랜져에서 파생된 car냐??
            return 2000;
        } else if (car instanceof Mustang) {
            return 3000;
        } else if (car instanceof Stinger) {
            return 3100;
        } else {
            return 0;
        }
    }

} // end class
