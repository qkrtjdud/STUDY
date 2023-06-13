package exgain.codingTest;

public class Pizza_01 {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    static int solution(int n) {
        int answer = n / 7;
        if (n % 7 != 0)
            answer++;

        return answer;
    }

}