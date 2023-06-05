package ex01;
import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, sum;

               
       System.out.println("첫수");
        n1 = sc.nextInt();
        System.out.println("두번째수");
        n2 = sc.nextInt();

        sum=n1+n2;
        System.out.println(sum);
        sc.close(); 
    }
}