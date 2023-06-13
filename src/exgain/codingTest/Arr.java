package exgain.codingTest;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;

    }
}

public class Arr {
    public static void main(String[] args) {
        Solution so = new Solution();
        int[] answer = so.solution(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(answer);
    }

}
