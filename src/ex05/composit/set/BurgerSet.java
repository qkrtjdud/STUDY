package ex05.composit.set;

public class BurgerSet {
    private Burger burger;
    private Coke coke;
    private Potato potato;
    private Setprice price;
    private int strong;

    public BurgerSet(Burger burger, Coke coke, Potato potato, Setprice price, int strong) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
        this.price = price;
        this.strong = strong;

    }

    public BurgerSet() {
        this(new Burger(), new Coke(), new Potato(), new Setprice());
        this.strong = 1;
        System.out.println("빨대는 기본 " + strong + "개 입니다");
    }

    public BurgerSet(Burger burger, Coke coke, Potato potato, Setprice price) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
        this.price = price;
        System.out.println("주문한 세트 나왔습니다.");

    }

    public Burger getBurger() {

        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

    public Setprice getPrice() {
        return price;
    }

    public int getStrong() {
        return strong;
    }

}
