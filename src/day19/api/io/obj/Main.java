package day19.api.io.obj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {

        humanList.add(new Human("김철수", 22, "서울시 구로구"));
        humanList.add(new Human("박영희", 24, "서울시 금천구"));
        humanList.add(new Human("홍길동", 45, "서울시 중구"));

//        saveTextFile();
        saveObject();
        
    } // end main


    // 객체 세이브 기능
    static void saveObject() {
        
        // 객체를 저장할 수 있게 해주는 보조스트림
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("E:/Excercise/human.sav"))) {


            oos.writeObject(humanList); // 이러면 에러나네 휴먼 클래스가 직렬화 되어있지 않아서
            // 직렬화?? Serializable : 직렬화 가능한~~ 이라는 뜻!!
//            class Human implements Serializable 이렇게 해주고 와야함.


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    
    // 세이브 기능 : 옛날엔 txt 파일로 저장했다..
    static void saveTextFile() {

        try (FileWriter fw = new FileWriter("E:/Excercise/human.txt")){

            StringBuilder sb = new StringBuilder();
            for (Human human : humanList) {
                fw.write(String.format("%s, %d, %s\n", human.getName(), human.getAge(), human.getAddress()));
            }
            System.out.println("저장 완료!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
} // end class
