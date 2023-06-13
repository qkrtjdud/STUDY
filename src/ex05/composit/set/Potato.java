package ex05.composit.set;

public class Potato {
    private int price;
    private String desc;

    public Potato() {
        this(800, "감자튀김");

    }

    public Potato(int price, String desc) {
        this.price = price;
        this.desc = desc;
        System.out.println("감자튀김");
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

}
