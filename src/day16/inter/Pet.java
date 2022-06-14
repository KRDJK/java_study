package day16.inter;

// 인터페이스 : 객체의 규격(기능)을 표준화해서 명세하는 역할
public interface Pet {

    // 인터페이스는 객체화 될 수 없으며, 필드도 가질 수 없음
    // 또한 상수와 추상메서드만 선언 가능


    // 필드를 선언하면 자동으로 앞에 public static final을 붙여준다.
    public static final String PLAY_GROUND = "애완동물 카페"; // 애완동물이 노는 장소


    // 안써도 자동으로 public abstract가 붙는다.
    public abstract void play(); // 애완동물이 노는 기능
} // end interface
