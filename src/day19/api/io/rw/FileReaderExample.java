package day19.api.io.rw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("E:/Excercise/dog.txt")) {

            int data;
            while ((data = fr.read()) != -1)  {
                System.out.print((char)data); // 16 진수로 가져오네
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    } // end main
} // end class
