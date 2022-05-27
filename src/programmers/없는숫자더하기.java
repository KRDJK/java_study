package programmers;

public class 없는숫자더하기 {
    static public int solution(int[] numbers) {
//        int answer = -1;

        //정상적으로 들어있는 배열을 만들어서 비교해볼까
        int[] nums = {1,2,3,4,5,6,7,8,9,0};

        for (int i = 0; i < nums.length; i++) {
            for (int n : numbers) {
                if(nums[i] == n) {
                    nums[i] = 0;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }


        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(solution(numbers));
    }
}
