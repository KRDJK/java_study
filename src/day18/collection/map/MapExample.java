package day18.collection.map;

import utility.Util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
} // end class

public class MapExample {
    public static void main(String[] args) {

        Map<String, Student> map = new HashMap<>();
        
        
        // put(k, v) : 데이터 추가
        map.put("짹짹이", new Student("김철수", 3)); // put 괄호 속에 있는 부분을 엔트리라고 부름.
        map.put("냥냥이", new Student("도우너", 5));
        map.put("멍멍이", new Student("고길동", 1));


        System.out.println(map.size());
        System.out.println(map.toString());


        // 중복된 key 객체로 put을 하면 value가 수정된다. // 위에 도우너가 사라짐.
        map.put("냥냥이", new Student("둘리", 6));
        System.out.println(map);



        // get(key) : 저장된 value를 참조.
        Student student = map.get("멍멍이");
        System.out.println("student = " + student);


        // 주소를 반환받기 때문에 아래와 같은 행위가 가능하다.
        student.name = "빠빠빠";
        System.out.println(map);


        Util.line();

        // containsKey(key) : 현재 맵에 특정 key가 있는지 확인 여부. 있으면 true, 없으면 false
        System.out.println(map.containsKey("꽉꽉이"));
        System.out.println(map.containsKey("짹짹이"));


        // map 루프 처리
        Set<String> keySet = map.keySet();// map에 모든 키를 Set에 담아 리턴
        System.out.println(keySet);

        for (String key : keySet) {
            System.out.println(map.get(key));
        }


        // remove(key) : key에 해당하는 Entry 삭제 (key, value 모두 삭제)
        map.remove("냥냥이");
        System.out.println(map);


        map.clear();
        System.out.println(map.isEmpty());


        // 맵에 value 값으로 List를 사용하려면..??
        Map<String, List<Integer>> mapList = new HashMap<>();

        // 이것도 가능.
        Map<String, Set<Integer>> mapList2 = new HashMap<>();



    } // end main
} // end class
