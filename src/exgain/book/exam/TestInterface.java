package exgain.book.exam;

interface RomoteControl {
    void turnOn();

    void turnOff();

    default void printBrand() {
        System.out.println("RemoteContorl 가능 TV");
    }
}

class Television implements RomoteControl {
    boolean on;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Tv 켜졌당");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Tv 꺼졌디");
    }

    @Override
    public void printBrand() {
        System.out.println("JAVA TV");
    }

}

public class TestInterface {
    public static void main(String[] args) {
        RomoteControl tv = new Television();
        tv.turnOn();
        tv.turnOff();
        tv.printBrand();
    }

}
