package ex02;

import java.util.Scanner;

public class Programing {

    /*
     * //1번
     * public static void main(String[] args) {
     * int total = 127;
     * int box = (total / 10);
     * int namma = (total % 10);
     * 
     * System.out.println("오렌지 개수를 입력하시오: " + total);
     * System.out.println(box + "박스가 필요하고 " + namma + "개가 남았습니다.");
     * }
     */
    /*
     * //2번
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("마일을 입력하시오: ");
     * double mile = sc.nextDouble();
     * System.out.print(mile);
     * 
     * double km = (mile*1.609344);
     * System.out.println(mile +"마일은 "+ km + "킬로미터 입니다.");
     * sc.close();
     * }
     */

    // 3번
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("x: ");
        int x = input.nextInt();

        System.out.print("y: ");
        int y = input.nextInt();

        System.out.println("두수의 합: " + (x + y));
        System.out.println("두수의 차: " + (x - y));
        System.out.println("두수의 곱: " + (x * y));
        System.out.println("두수의 평균: " + (double) (x + y) / 2);

        int max = (x > y ? x : y);
        int min = (x < y ? x : y);
        System.out.println("큰수: " + max);
        System.out.println("작은수: " + min);

        input.close();
    }

    /*
     * // 4번
     * public static void main(String[] args) {
     * boolean P = true;
     * boolean Q = true;
     * 
     * System.out.println("P\tQ\tAND\tOR\tXOR");
     * System.out.print((P == P) + "\t ");
     * System.out.print((Q == Q) + "\t ");
     * System.out.print((P == P && Q == Q) + "\t ");
     * System.out.print((P == P || Q == Q) + "\t ");
     * System.out.print((P == P != Q == Q) + "\t  ");
     * 
     * }
     */
}
