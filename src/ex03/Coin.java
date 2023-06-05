package ex03;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        // 500원, 100원, 50원, 10원 (개수 최소로 주세요)
        System.out.println("얼마 낼거야 ");
        Scanner sc = new Scanner(System.in);
        final int money = sc.nextInt();
        // final int money = 1200051410; // Scanner 로 수정하기
        int restmoney = money; // 남은 금액 변수 만들기
        int count; // 동전 게수를 담을 변수

        int[] coin = { 500, 100, 50, 10 };
        for (int i = 0; i < coin.length; i++) {
            count = restmoney / coin[i];
            System.out.println(coin[i] + "원: " + count);
            restmoney = restmoney % coin[i];
        }
        ;

        // tempMoney = 500;
        // count = restmoney / tempMoney; // count=5
        // System.out.println(tempMoney + "원: " + count);
        // restmoney = restmoney % tempMoney;

        // tempMoney = 100;
        // count = restmoney / tempMoney; // count=1
        // System.out.println(tempMoney + "원: " + count);
        // restmoney = restmoney % tempMoney;

        // tempMoney = 50;
        // count = restmoney / tempMoney; // count=1
        // System.out.println(tempMoney + "원: " + count);
        // restmoney = restmoney % tempMoney;

        // tempMoney = 10;
        // count = restmoney / tempMoney; // count=1
        // System.out.println(tempMoney + "원: " + count);
        // restmoney = restmoney % tempMoney;
        sc.close();
    }

}
