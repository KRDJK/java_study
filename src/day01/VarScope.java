package day01;

public class VarScope {

    public static void main(String[] args) {

        int num1 = 10, num2 = 20;
//        int num3;
        if (true) {
            // int num1 = 300; ==>> 이렇게 했다면 JS에서는 아래 코드에서 300을 먼저 참조했겠지만!!
            // 자바에서는 동일한 변수 이름을 설정하는 것 자체가 불가능하다!!!
            int num3 = num1 + num2;
            System.out.println("num3 = " + num3);
        }//end if

        int num3 = 500; // 얘는 가능! if문 안에서만 num3가 존재했기 때문!!

//        if문 안에서만 num3가 존재! 해당 if문 블록 범위를 벗어나면 메모리에서 자동 삭제됨.
//        특정 블록에서 선언된 변수는 해당 블록을 벗어나면 메모리에서 자동 삭제!
        System.out.println("num3 = " + num3);

    }//end main
//    int num4 = num1 + num2; main밖이라 num1, num2 값이 죽었기 때문에 쓸 수 없음.
}//end class
