package practice3.model.vo;

public class Dog extends Animal {
    public static final String PLACE;

    private int weight;

    static {
        PLACE = "애견카페";
    }

    public Dog() {
    }

    public Dog(String name, String kinds, int weight) {
        super(name, kinds);
        this.weight = weight;
    }


    @Override
    public void speak() {
        System.out.println(super.toString() + "몸무게는 " + weight + "kg입니다.");
    }

    // setter / getter

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

} // end class
