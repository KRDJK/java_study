package day16.Exception;

public class AccMain {

    public static void main(String[] args) {
        Account acc = new Account();

        try {
            acc.withdraw(10000); // 함부로 막 실행되면 안됨.
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    } // end main
} // end class
