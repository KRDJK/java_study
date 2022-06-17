package day19.api.io.fileIOstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) {

        // 파일을 읽어들이려면!
            // 예외처리 하래네?? 거기 파일 없으면 어쩔건데!

            /*FileInputStream fis = null;// 그냥 InputStream은 추상클래스다.
        try {
            fis = new FileInputStream("E:/sl_basic/java_study/src/datastructure/chap08/Search.java");

            int data = 0;
            while (data != -1) { // 데이터가 없어서 못읽으면 -1을 리턴하기 때문에!!!
                data = fis.read();// 데이터를 1바이트씩 읽어들인다.
                System.out.write(data); // 아스키 코드를 문자로 출력
            }
//            data = fis.read();
//            data = fis.read();
//            System.out.println("data = " + (char) data); // package에 있는 'p'를 읽었네

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 에러!");
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        
        // try with resource 문법 : AutoCloseable 인터페이스가 구현된 객체를 자동 클로즈
        try (FileInputStream fis = new FileInputStream("E:/sl_basic/java_study/src/datastructure/chap08/Search.java")) {

            int data = 0;
            while (data != -1) {
                data = fis.read();// 데이터를 1바이트씩 읽어들인다.
                System.out.write(data); // write를 쓰면 아스키 코드를 문자로 출력
            }
//            data = fis.read();
//            data = fis.read();
//            System.out.println("data = " + (char) data); // package에 있는 'p'를 읽었네

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 에러!");
        }


    } // end main
} // end class
