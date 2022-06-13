package practice3.model.vo;

public abstract class Animal {

    private String name;
    private String kinds;


    protected Animal() {

    }

    protected Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }

    public String toString() {
        return String.format("저의 이름은 %s이고, 종류는 %s입니다.", name, kinds);
    }

    public abstract void speak();

} // end class
