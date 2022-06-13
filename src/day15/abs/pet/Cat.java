package day15.abs.pet;

public class Cat extends Pet{

    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    public void takeNap() {
        System.out.println("고양이는 캣타워에서 자요.");
    }

    @Override
    public void feed() {
        System.out.println("고양이는 생선을 먹어요.");
    }

} // end class
