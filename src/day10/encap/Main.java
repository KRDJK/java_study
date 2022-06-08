package day10.encap;

public class Main {
    public static void main(String[] args) {

//        Car myCar = new Car("그랜져");
//
//        /*
//        myCar.speed = 30000;
//        myCar.mode = 'F';
//
//        System.out.println("현재속도: " + myCar.speed); // 참조까지도 안되어버림.
//        */
//
//        // 이상한 값으로 교란시킬까봐 막은건데 정상적인 값도 못 넣게 되어버렸다..
//        // 그럼 메서드를 통해서..!!! 정상적인 범위 안에서만 값을 저장해라. 세부 설정 가능!
//        myCar.setSpeed(150);
//        // 참조까지도 막히기 때문에 getter로 가져와야함.
//        System.out.println("현재속도: " + myCar.getSpeed());
//
//        myCar.setMode('R');
//        System.out.println("현재 모드: " + myCar.getMode());


        Car car = new Car("소나타");
        
        // 시동 먼저 걸고 -> 엔진 오일 순환 -> 연료를 주입 -> 실린더 작동
        car.engineStart();
//        car.injectOil();
//        car.injectGasoline();
//        car.moveCylinder();

        car.setMode('D');
        car.setSpeed(100);
        car.engineStop();

    }
}
