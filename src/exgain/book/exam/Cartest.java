package exgain.book.exam;

class Car {
    String color;
    int speed;
    int gear;

    public String toString() {
        return "Car[color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
    }

    void changeGear(int g) {
        gear = g;
    }

    void speedUp() {
        speed = speed + 10;
    }

    void speedDoun() {
        speed = speed - 10;
    }
}

public class Cartest {
    public static void main(String[] args) {
        Car c = new Car();
        c.changeGear(2);
        c.speedUp();
        System.out.println(c);
    }
}
