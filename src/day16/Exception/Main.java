package day16.Exception;

public class Main {
    public static void main(String[] args) {

        try {
            int n = EasyScanner.inputInteger("정수: ");

            double d = EasyScanner.inputFloat("실수: ");
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }

    } // end main
} // end class
