package ex03;

import java.util.Scanner;

public class DayC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("날짜 입력:");
        String date = sc.nextLine();

        System.out.println("년,월,일 중 변경할 거 선택");
        String type = sc.nextLine();

        System.out.println("더 할 입력값");
        int interval = sc.nextInt();

        int day;

        if (type.equals("day")) {
            day = Integer.parseInt(date);
            day += interval;
            String addDate = Integer.toString(day);
            System.out.println(addDate);

        }
        sc.close();
    }
}
