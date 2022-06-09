package day13.static_.singleton;

public class Controller {

    public int number;

    // 2. 필드로 객체를 딱 하나 생성시키는데
    //    static 제한을 걸어서 공유 객체로 전환
    private static Controller con;

    static {
        con = new Controller();
    }
    
    
    // 1. 단 하나의 생성자에 private 제한을 걸어
    //    외부에서 직접적으로 객체를 생성할 수 없도록 제한.
    private Controller() {
        
    }


    // 3. 준비된 단 하나의 객체를 public 메서드를 통해 제공한다.
        // 객체 생성 없이도 외부에서 이 메서드를 call할 수 있도록 static 부여
    public static Controller getInstance() { // 자기 자신을 리턴
        if (con != null) {
            return con;
        } else {
            return new Controller();
        }
    }



} // end class
