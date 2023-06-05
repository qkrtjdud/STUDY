package ex01;

public class Var02 {
    public static void main(String[] args) {
        byte  b1 =65; // 1바이트
        int n1= 2100000000; /*4바이트 */
        long l1= 2100000000L;/*8바이트 */
        double d1=210000000.222;/*8바이트 */
        char c1='가';/*2바이트 */
        boolean check = true;/*1비트 */

        System.out.println(b1);
        System.out.println(n1);
        System.out.println(l1);
        System.out.println(c1);    
        System.out.println(d1);  
        System.out.println(check);  

    }
}
