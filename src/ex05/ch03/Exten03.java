package ex05.ch03;

abstract class Animal { // 추상클래스
    void speak() {
    } // 오버라이드 하기 위한 통로
}

class Dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("야옹");
    }
}

public class Exten03 {
    static void start(Animal u) {
        u.speak();
    }

    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        start(d);
        start(c);
    }
}
