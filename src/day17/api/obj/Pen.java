package day17.api.obj;

// 객체 복사를 사용하려면 Clonable 인터페이스를 구현해야 함.
public class Pen extends Object implements Cloneable {

    Company company; // 제조사 정보 // 이렇게 클래스 필드 안에 객체가 들어오는 것을 컴포지션이라고 한다.
    long serial; // 일련번호
    String color; // 색상
    int price; // 가격


    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    public Pen(Company comapany, long serial, String color, int price) {
        this.company = comapany;
        this.serial = serial;
        this.color = color;
        this.price = price;
    }


    // 원래는 주소비교인데 그거 말고 일련번호가 같으면 같다고 해줘!
    @Override
    public boolean equals(Object o) {
        if (o instanceof Pen) {
            Pen p = (Pen) o;
            return this.serial == p.serial;
        }
        return false;
    }


    // clone: 객체 복사 : 얕은 복사 개념 ( 해당 포인터 객체만 복사 )
    // 객체가 중첩구조를 이루고 있을 때는 제대로된 복사가 되지 않는다. (Main 부분 메모 참조)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    
    // 깊은 복사 : 해당 객체뿐만 아니라 컴포지션된 객체도 모두 복사
    // 직접 구현해야함.
    public Pen deepClone() throws CloneNotSupportedException {
        // 1. 우선 얕은 복사 진행
        Pen copy = (Pen) this.clone(); // 왜 형 변환?? 그냥 clone이 오브젝트를 리턴하니까

        // 2. 컴포지션된 객체도 복사 진행
        copy.company = (Company) copy.company.clone();
        return copy;
    }


    @Override
    public String toString() {
        return "Pen{" +
                "company=" + company +
                "serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


} // end class
