package exgain.book.lab;

interface OperateCar {
    void start();

    void stop();

    void setSpeed(int speed);

    void turn(int degree);
}

class AutoCar implements OperateCar {
    public void start() {
        System.out.println("자동차가 출발 합니다.");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("자동차 속도를 " + speed + "km/h로 바꿉니다.");

    }

    @Override
    public void stop() {
        System.out.println("자동차가 정지합니다.");
    }

    @Override
    public void turn(int degree) {
        System.out.println("자동차가 방향을 " + degree + "만큼 바꿉니다.");
    }

}

public class AutoCarTest {
    public static void main(String[] args) {
        AutoCar car = new AutoCar();
        car.start();
        car.setSpeed(30);
        car.turn(15);
        car.stop();

    }
}
