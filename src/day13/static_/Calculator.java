package day13.static_;

public class Calculator {
    
    public String company; // 제조사  계산기마다 제조사는 다를 수 있다.
    public String color; // 색상 계산기마다 색상은 다를 수 있다.
    public static double PI; // 원주율 계산기가 뭐든 원주율은 항상 고정. 여기서 static을 쓰면
                    // 객체가 몇개 생성되든 PI 메모리는 단 하나! 효율적!!




    // static initializer : 정적 초기화자
    // static 데이터의 초기화를 담당
    static { // 처음 static이 등장할 때 한번만 생성자가 발동되고 그 이후로는 발동되지 않는다.
        PI = 3.141592;
        System.out.println("정적 초기화 호출!");
    }




    // 생성자
    public Calculator(String company, String color) {
        this.company = company;
        this.color = color;
//        this.PI = 3.14159; // 이러면 안될거 같은데..? 역시나 안된다.
    }




    // 메서드

    // static을 붙이면 어디 계산기에 컬러를 입히라는건지 모르게 된다.
    public void 색상을_칠하다(String color) {
        this.color = color;
    }

    // 어떤 계산기든 가지고 원의 넓이를 구해봐!!
    // 뭐로 계산하든 결과는 같으므로 static 가능
    public static double 원의_넓이를_구하다(int r) {
        return PI * r * r;
    }


    
    // 메인
    public static void main(String[] args) {
        System.out.println("원주율: " + Calculator.PI); // 왜 아예 0.0..?
                                                        // Math.PI로 초기화 해놨던게 아니니까!!
        Calculator.원의_넓이를_구하다(5); // 가능!


        Calculator sharp = new Calculator("삼성", "회색");
        sharp.색상을_칠하다("red");

        System.out.println("원주율: " + Calculator.PI);
    }
    
} // end class
