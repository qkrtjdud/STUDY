package ex02;
import java.util.Scanner;

class Ctemp{
    double ctemp(int temp){
        return(temp * 9 / 5) + 32 ;
    } 
 }

 class Ftemp{
    double ftemp(int temp){
        return(temp - 32) * 5 / 9;
    }
 }

public class Mp02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, temp ;
        System.out.println("=======================");
        System.out.println("1. 화씨 -> 섭씨 ");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("========================\n\n");

        System.out.println("번호를 입력하시오 : ");
        num = sc.nextInt();
    
        temp = sc.nextInt();

        Ctemp ct = new Ctemp();
        double result1 = ct.ctemp(temp);

        Ftemp ft = new Ftemp();
        double result2 = ft.ftemp(temp);

        if(num==1){
            System.out.println("화씨온도: " + result1);
            System.out.println("섭씨온도: " + result2);
        }
        else{
            System.out.println("섭씨온도: " + result2);
            System.out.println("화씨온도: " + result1);
        }
sc.close();
    }
}
