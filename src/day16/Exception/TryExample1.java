package day16.Exception;

public class TryExample1 {
    public static void main(String[] args) {

        int n1 = 10, n2 = 0;
        System.out.println("나눗셈 시작!");
        
        try { // 일단 돌려봐
            // 예외 발생 가능성이 있는 코드
            System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2); // n2에 0이 들어오면 프로그램이 터질 가능성이 있어서 예외처리가 필요하다.

        } catch(Exception e) { // 처리할 예외에 대한 클래스 작성(..??)  // try에서 에러가 나면 즉시 실행을 중지하고 매개변수 e에 넣어줌.
            // 예외 발생시 실행할 코드
            // 어떤 예외가 일어날지 어떻게 알아..? 경험에 의해.. 알아야 한다. 콘솔에 에러가 뜰테니..
            System.out.println("0으로 나눌 수 없습니다.");
            // 예외 처리 후에 예외 로그를 보고 싶을 때
            e.printStackTrace();
            // 전체로그 말고 예외 원인 메시지만 확인하고 싶을 때
            System.out.println(e.getMessage());
        }

        System.out.println("프로그램 정상 종료!");

    } // end main
} // end class
