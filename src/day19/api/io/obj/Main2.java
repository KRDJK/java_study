package day19.api.io.obj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {

    static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {
//        loadTextFile();
        loadObj();

//        System.out.println(humanList);
        for (Human h : humanList) {
            System.out.println(h);
        }

    } // end main


    // 세이브 파일 불러와서 리스트에 넣기
    static void loadObj() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/Excercise/human.sav"))) {

            humanList = (List<Human>) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    
    // 텍스트 파일 불러와서 리스트에 넣기 : 옛날 방식
    static void loadTextFile() {

        try (BufferedReader br = new BufferedReader(new FileReader("E:/Excercise/human.txt"))) {

            String s = "";
            while ((s=br.readLine()) != null) {
//                System.out.println(s); // 이건 걍 출력이고 제대로 파일에 넣어주려면 한줄 한줄을 뜯어서 다시 넣어줘야함.
                StringTokenizer st = new StringTokenizer(s, ", ");

                Human human = new Human(st.nextToken(),
                        Integer.parseInt(st.nextToken()),
                        st.nextToken());

                humanList.add(human);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
} // end class
