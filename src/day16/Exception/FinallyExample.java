package day16.Exception;

public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = {"비둘기", "거북이", "짹짹이"};

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i] + " 키울래요~");
            } catch (Exception e) {
                System.out.println("애완동물 정보가 더이상 존재하지 않습니다.");
            } finally {
                // 예외가 발생하든 발생하지 않든 무조건 실행될 코드
                System.out.println("애완동물 조아요~\n");

                // 메모리 누수 방지 코드를 보통 finally에 작성
                // ex) 데이터베이스 연결코드, 네트워크 연결코드, 하드웨어 장치 연결코드 ...
                // 이런 ex)들이 에러가 나든 안나든 실행시킬 코드가 있어서!! finally를 사용한다.
            }
        }

        System.out.println("프로그램 정상 종료!");


    } // end main
} // end class
