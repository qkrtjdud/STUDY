package exgain.codingTest;

class Solution {
    public double solution(int num1, int num2) {
        double result = (double) num1 / num2; // num1을 num2로 나눈 값 계산
        result *= 1000; // 1,000을 곱함
        int integerPart = (int) result; // 정수 부분을 가져옴
        return integerPart;
    }
}

public class Nanugi {
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.solution(3, 2));
    }
}
