package day17.api.obj;

public class Company implements Cloneable {
    String name; // 제조사명
    String address; // 주소


    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

} // end class
