package day15.abs.car;

public abstract class Car {

    // 가속 기능
    public abstract void accel();
    // 감속 기능
    public abstract void brake();
    // 핸들 열선 기능
    public void heatHandle() {} // final을 붙이면 여기서 설정된 대로만 하위 클래스에서도 써야만 함.

} // end class
