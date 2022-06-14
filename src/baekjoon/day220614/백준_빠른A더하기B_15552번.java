package baekjoon.day220614;

import java.io.*;
import java.util.StringTokenizer;

public class 백준_빠른A더하기B_15552번 {
    /*
        문제에 있는 설명 중 일부를 가져왔습니다:

        ● Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

        System.out.println() 은 속도가 느려 100만 번이나 출력해야 하는 본 문제에서는 시간 초과를 받을 수 있으므로, 이를 BufferedWriter 형식으로 바꾸어 봅시다. BufferedWriter 방식은 출력할 문자열들을 버퍼에 담아 두었다가 한꺼번에 출력하는 방식이기 때문에 System.out.println() 보다 훨씬 빠릅니다.

        ● 16번째 줄의 코드를 아래와 같이 교체해 봅시다:

        bw.write(Integer.toString(A + B) + '\n');
        이렇게 하면 A + B를 계산한 결과를 바로 출력하는 대신에, 버퍼에 출력할 데이터를 버퍼에 담을 수 있습니다. 이 때 버퍼에는 문자열을 담아야 하므로, Integer.toString()을 이용해 계산한 A + B의 결과를 문자열로 형변환하였고, BufferedWriter는 줄바꿈 문자를 자동으로 넣어주지 않으므로, 직접 '\n' 을 넣었습니다.

        ● 17번째 줄, 18번째 줄의 '}' 사이에 아래의 코드를 넣어봅시다:

        bw.flush();
        버퍼에 모아뒀던 데이터들을 한꺼번에 출력하는 코드입니다. bw.flush() 를 사용함으로써 지금까지 모아둔 데이터를 출력하게 됩니다.

        이렇게 수정하면 시간 초과를 피할 수 있을 것입니다!
    */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
//            int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());

            bw.write(Integer.parseInt(st.nextToken()) +
                    Integer.parseInt(st.nextToken())+ "\n");
        }

        bw.close();

    } // end main
} // end class
