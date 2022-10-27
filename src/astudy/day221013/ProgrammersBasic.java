package astudy.day221013;

import com.kh.hw.member.model.vo.Member;

import java.util.ArrayList;
import java.util.List;

// level 0. 옹알이
public class ProgrammersBasic {

    public static int solution (String[] babbling) {
        int answer = 0;

        List<String> lang = new ArrayList<>();

        lang.add("aya");
        lang.add("ye");
        lang.add("woo");
        lang.add("ma");

        for (String s: lang) {
            for (String word : babbling) {
                if (s.contains(word)) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static int solution2(int num1, int num2) {
        int answer = 0;

        double result = (double) num1/num2;

        double result2 = result * 1000;

        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);

        System.out.println((int) result2);

        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"ayaye", "yeye", "uuu", "ayaayaa", "yemawoo"};

//        System.out.println(solution(arr));
        System.out.println(solution2(3,2));
    }
}
