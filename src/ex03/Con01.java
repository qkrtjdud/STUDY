package ex03;

import java.time.LocalDate;
import java.util.Scanner;

public class Con01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("날짜 입력: ");
        String date = sc.nextLine();

        System.out.println("변경할 year/month/day 중 선택");
        String type = sc.nextLine();

        System.out.println("더 할 날");
        int interval = sc.nextInt();

        LocalDate adddate = LocalDate.parse(date);

        if (type.equals("day")) {

            adddate = adddate.plusDays(interval);
        } else if (type.equals("month")) {
            adddate = adddate.plusMonths(interval);
        } else if (type.equals("year")) {
            adddate = adddate.plusYears(interval);
        }
        System.out.println("결과" + adddate);
        sc.close();
        ;
    }
}
