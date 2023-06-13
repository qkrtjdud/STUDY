package exgain.codingTest;

public class Ggoch {
    public static void main(String[] args) {

        System.out.println(solution(10, 3));
    }

    static int solution(int n, int k) {
        int answer = (n * 12000) + (k * 2000) - ((n / 10) * 2000);
        return answer;
    }
}
