package day16.Exception;

// 사용자 정의 예외 클래스
public class BalanceInsufficientException extends Exception{

    public BalanceInsufficientException() {
    }

    public  BalanceInsufficientException(String msg) {
        super(msg);
    }
    
}
