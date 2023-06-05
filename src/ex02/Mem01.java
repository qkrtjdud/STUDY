package ex02;

class Coffe{
    int price = 300;
    String name = "믹스커피";
}
class Upcoffe{
    int price = 2500;
    String name = "블렌딩커피";
}

public class Mem01 { 

    static int price = 1500;

    public static void main(String[] args) {
        String name = "아메리카노";

        System.out.print(name +" 값은 얼마?");
        System.out.println();
        System.out.println(price);

        System.out.print("다른 커피종류와 가격은?");

        Coffe a = new Coffe();
        Upcoffe b = new Upcoffe();

        System.out.println();
        System.out.println(a.name + a.price);
        System.out.println(b.name + b.price);

    }
    
}
