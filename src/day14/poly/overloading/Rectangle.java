package day14.poly.overloading;

public class Rectangle {

    // 정사각형의 넓이를 구하는 기능
    // calcArea(int)
    // 이 형식이기 때문에 이 클래스 안에서 이후로는 이런 형식의 메서드를 죽었다 깨어나도 절대 못만든다(오버로딩이 불가능하다).
    public int calcArea(int length) { // 정사각형이니까 한 변의 길이만 알면 된다.
        return length * length;
    }


    // 직사각형의 넓이를 구하는 기능
    // clacArea(int, int)
    public int calcArea(int w, int h) {
        return w * h;
    }

    // calcArea(double)
    public int calcArea(double a) {
        return 0;
    }



    // calcArea(int, String)



} // end class
