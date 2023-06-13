package ex05.exam;

abstract class 육식동물 {
    abstract void printMyName();
}

class Tiger extends 육식동물 {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public void printMyName() {
        System.out.println(name);
    }
}

class Lion extends 육식동물 {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    public void printMyName() {
        System.out.println(name);
    }
}

public class ExtenExam {
    static void start(육식동물 a) {
        a.printMyName();
    }

    public static void main(String[] args) {
        육식동물 lion = new Lion("사자1");
        육식동물 tiger = new Tiger("호랑이1");
        start(lion);
        start(tiger);

    }
}