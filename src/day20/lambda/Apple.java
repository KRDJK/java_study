package day20.lambda;

public class Apple {

    enum Color {  // 내부 클래스처럼 Apple안에서만 사용할거라면 클래스 안에서 선언 가능
        RED, GREEN
    }

    private int weight; // 사과의 무게
    private Color color = Color.RED; // 사과의 색상 // 열거체 이름.상수


    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }


} // end class
