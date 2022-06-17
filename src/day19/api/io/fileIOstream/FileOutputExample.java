package day19.api.io.fileIOstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {

        // 파일 출력
        try (FileOutputStream fos =
                     new FileOutputStream("E:/Excercise/dog.txt")) {

            String msg = "멍멍이는~~~ 멍멍멍멍~왈왈왈~~ \n하하호호~";

            fos.write(msg.getBytes());
            // String에서는 아스키코드를 전달할 필요가 없다.
            // 원래는 write의 매개변수로 바이드 배열을 요구함.


        } catch (FileNotFoundException e) {
            System.out.println("해당 경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 에러!");
        }

    } // end main
} // end class
