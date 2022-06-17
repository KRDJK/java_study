package day19.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("E:/Excercise/자바수업.txt")){

            String str = "지금은 자바 입출력 수업중입니다. \n꿀잼이야~";
            fw.write(str); // 굳이 byte[]로 변환이 필요없다. 문자 단위로 읽어들여서

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
