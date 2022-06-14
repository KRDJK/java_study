package day16.Exception;

public class Account {

    String owner;
    int balance; // 잔액

    // 출금 기능
    public void withdraw(int money) throws BalanceInsufficientException {
        if (balance < money) { // 문제가 되는 상황
//            return; // 어떻게 보면 소극적 대응이다.
            // throw : 유발하다, 발생하다.
            throw new BalanceInsufficientException("잔액 부족!!"); // 의도적으로 에러를 발생시킨다. // 적극적 대응
            // 잔액 부족인데 너 뭐하니??
        }
        this.balance -= money;
    }


    // 자바가 미리 예상해둔 예외를 클래스로 만들어뒀는데.. 잔액부족의 경우 그런 예외 클래스는 없다
    // 그러면?? 내가 만들어서 쓰면 된다. (사용자 정의 예외 클래스)

} // end class
