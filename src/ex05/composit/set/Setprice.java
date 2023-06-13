package ex05.composit.set;

public class Setprice {
    private int price;
    private String desc;

    public Setprice() {
        this(2000, "세트 가격");
    }

    public Setprice(int price) {
        this(price, "세트 가격");
    }

    public Setprice(int price, String desc) {
        this.price = price;
        this.desc = desc;
        System.out.println("가격은" + price);
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

}
