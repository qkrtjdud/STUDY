package ex05.composit.set;

public class Coke {
    private int price;
    private String desc;

    public Coke() {
        this(500, "콜라");
    }

    public Coke(int price, String desc) {
        this.price = price;
        this.desc = desc;
        System.out.println("콜라");
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

}
