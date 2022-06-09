package day13.final_;

public class Korean {
    
    String name; // 이름
    final String id; // 주민번호

    // 상수 : 불변성과 유일성을 모두 만족해야함.
        // 아래의 nation은 왜 상수가 아닐까??
        // 객체가 생성될 때마다 nation이 객체만큼 계속 생성되기는 하기 때문!!!
        // 그래서 static final ~~ 이렇게 해왔나보다.
    static final String nation; // 국적 // 무슨 값을 final로 할건지 최소 생성자에서라도 받았어야지!!

    //
    static {
        nation = "대한민국";
    }




    public Korean(String name, String id, String nation) {
        this.name = name;
        this.id = id; // 여기서 받은 값을 기록하고 이걸 final로 만든다.
//        this.nation = nation;
    }




    @Override
    public String toString() {
        return "이름: " + name + ", 주민번호: " + id + ", 국적: " + nation;
    }




    // 주민번호를 바꾸는 메서드
    public void chaneId(String id) {
//        this.id = id; // final을 id에 붙였기 때문에 클래서 안에서도 변경이 안된다.
    }


} // end class
