package day19.api.io.file;

import java.io.*;

public class FileExample {

    public static final String ROOT_PATH = "E:/Excercise";

    public static void main(String[] args) {

        // 폴더 생성
        File dir = new File("E:/Excercise/Dir/hello");


        // 폴더 생성 명령
        if (!dir.exists())dir.mkdirs(); // s를 빼면 Dir까지는 있다고 보고 hello만 생성하려고 한다.
                        // 근데 그 경로가 없으면 못 만든다.
        // 하지만 mkdirs는 경로 적어준대로 다 만든다.


        // 중복 방지 위한 if문 필요
        // if문은 해당 경로에 그 파일들이 존재하지 않으면~~ 만들어라.  있으면 만들지 마!!
        

        // 파일 생성
        File file1 = new File("E:/Excercise/file1.txt");
        File file2 = new File("E:/Excercise/file2.txt");
        File file3 = new File(ROOT_PATH+"/file3.txt");


        try {
            // 파일 생성 명령
            if (!file1.exists()) file1.createNewFile();
            if (!file2.exists()) file2.createNewFile();
            if (!file3.exists()) file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        // 폴더 파일 정보 읽기
        // 자주 쓰이는 "E:/Exercise" 같은 경로를 상수처리 하는게 좋다. 실수 방지!!
        File excercise = new File(ROOT_PATH);



        // 해당 디렉토리 모든 파일 정보 얻기
        File[] files = excercise.listFiles();

        for (File f : files) {
            if (f.isDirectory()) {
                System.out.printf("Directory - 폴더명: %s\n", f.getName());
            } else {
                System.out.printf("File - 파일명: %s, 크기: %d\n", f.getName(), f.length());
            }
        }


    } // end main
} // end class
