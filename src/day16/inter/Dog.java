package day16.inter;

// 구현 클래스가 인터페이스를 구현할 때는 implements 키워드를 사용.
public class Dog extends Animal implements Pet { // Dog는 Animal이면서 Pet이다.



    @Override
    public void play() {
        System.out.println("강아지는 꼬리를 흔들며 놀아요~");
    }

    @Override
    public void eat() {

    }
} // end class
