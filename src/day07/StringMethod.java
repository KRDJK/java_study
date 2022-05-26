package day07;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {

        String str = "hello java";
        
        // charAt(index): 문자열 인덱스에 따른 단일문자 반환
        char c = str.charAt(4);
        System.out.println("c = " + c);

        // substring( beginIdx, endIdx ) // 문자열의 특정 범위를 추출
        String ss1 = str.substring(1,5); // 1번 이상 4번 미만
        System.out.println("ss1 = " + ss1);


        String ss2 = str.substring(6); // 6번부터 끝까지 슬라이싱(복사)
        System.out.println("ss2 = " + ss2);


        // length(): 문자열의 총 길이 반환
        int len = str.length();
        System.out.println("len = " + len); // 10 공백을 포함함


        // indexOf(str)
        // 해당 문자가 존재하지 않으면 -1을 리턴.
        int idx1 = str.indexOf("l"); // 앞에서부터 탐색해서 먼저 발견되면 거기서 멈추고 해당 인덱스 번호를 반환.
        System.out.println("idx1 = " + idx1); // 2


        // lastIndexOf(str)
        int idx2 = str.lastIndexOf("l"); // 뒤에서부터 탐색해서 먼저 발견되면 거기서 멈추고 해당 인덱스를 반환.
        System.out.println("idx2 = " + idx2); // 3


        // 일괄 대소문자 변경
        String str2 = "HeLLo PORorO";
        String lower = str2.toLowerCase(); // 전부 다 소문자로 변경
        System.out.println("lower = " + lower);

        String upperCase = str2.toUpperCase(); // 전부 다 대문자로 변경
        System.out.println("upperCase = " + upperCase);


        // replace(old, new) : 문자열 내부에 old 문자를 모두 탐색하여 new 문자로 변환
        String str3 = "python study, python app, python data";
        String replace = str3.replace("python", "java");
        System.out.println("replace = " + replace);
        


        // 파일 경로에서 확장자 추출
        String filePath = "D:/local/img/2022/05/26/lalalala.jpg";

        // .jpg .txt .jpeg 이런거 다 추출하려면??
        // .의 인덱스를 찾으면 되지 않을까..??
        int dotIdx = filePath.indexOf('.');


//        System.out.println("dotIdx = " + dotIdx);

//        String[] temp = new String[filePath.length() - dotIdx];
//
//        int count = 0;

        String result = "";

        for (int i = dotIdx+1; i < filePath.length(); i++) {
             result += filePath.charAt(i);
//             count++;
        }

        // substring을 썼으면 더 편했네... 그래도 됐으니까....

        System.out.println("result = " + result);


        switch (result.toLowerCase()) { // 윈도우에서 대문자 확장자도 똑같은 확장자로 인식하기 때문에
                                        // 이렇게 하면 편리하다.
            case "jpg": case "gif": case "png" : case "svg" :
                System.out.println("이미지 파일입니다.");
                break;
            default:
                System.out.println("이미지 파일이 아닙니다.");
        }


        // 문자열의 정수 변환
        System.out.println("================================================");
        String s1 = "100";
        String s2 = "200";

        // 문자열 -> 정수 : Integer.parseInt(str)
        // 문자열 -> 실수 : Integer.parseDouble(str)
        // 문자열이 아닌 것 -> 문자열 : String.valueOf(data)
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println("sum = " + sum);


    } // end main
} // end class
