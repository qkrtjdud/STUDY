package ex01;

public class Var03 {
    public static void main(String[] args) {
        // 업캐스팅, 묵시적 형변환
        int n1=10; //초기화
        double d1 = n1; //묵시적 형변환
        System.out.println(d1);


        //다운캐스팅, 명시적 형변환
        double d2 = 10.5;
        int n2 =(int)d2;
        System.out.println(n2);


        //문자 형변환(아스키코드)
        byte ch =65;
        char date = (char)ch;   
        System.out.println(date);

    }
}
