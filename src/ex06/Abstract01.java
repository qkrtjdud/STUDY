package ex06;

/* 
1. 추상클래스는 new 할 수 없다.
2. 추상클래스는 일반메서드와 추상메서드를 가질 수 있다.
3. 추상클래스는 상태변수를 가질 수 있다.
*/
abstract class 동물 {

    String name; // 3번

    public void run() { // 2번
        System.out.println("달린다.");
    }

    public abstract void speak(); // 2번
}

class 사자 extends 동물 {
    public void speak() {
        System.out.println("어흥");
    }
}

public class Abstract01 {
    public static void main(String[] args) {
        동물 a = new 사자();

        // new 동물(); //1번

        a.run();
        a.speak();
        a.name = "사자";
        System.out.println(a.name);
    }
}
