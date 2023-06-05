package ex03;

public class While01 {
    public static void main(String[] args) {
        // for ->끝이 있는 반복문
        // while ->끝이 있는 반복문
        int i = 1;

        while (true) {
            if (i == 100) {
                break;
            }
            System.out.println("Hello : " + i);
            i = i + 1;
        }
    }
}
