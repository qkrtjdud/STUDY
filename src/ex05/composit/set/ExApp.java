package ex05.composit.set;

public class ExApp {
    public static void main(String[] args) {
        // Coke c2 = new Coke(400, "콜라");

        // 버거 세트 주세요
        Burger b1 = new Burger();
        Coke c1 = new Coke();
        Potato p1 = new Potato();
        Setprice sp = new Setprice(3000);
        System.out.println("==============");
        BurgerSet bs3 = new BurgerSet(b1, c1, p1, sp, 2);
        System.out.println(bs3.getStrong());
        System.out.println("==============");

        BurgerSet bs = new BurgerSet(b1, c1, p1, sp);

        System.out.println("=============");

        BurgerSet bs2 = new BurgerSet();
        System.out.println("================");

    }
}
