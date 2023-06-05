package ex01;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.println("입력된 이름: " + name);
        System.out.println("입력된 나이: " + age);

        scanner.close();
    }
}