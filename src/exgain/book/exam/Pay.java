package exgain.book.exam;

class Employee {
    int basepay = 3000000;

    int getSalary() {
        return basepay;
    }
}

class Manager extends Employee {
    int getSalary() {
        return basepay + 2000000;
    }
}

class Programmer extends Employee {
    int getSalary() {
        return basepay + 3000000;
    }
}

public class Pay {
    public static void main(String[] args) {
        Employee pay1 = new Manager();
        System.out.println("관리자의 월급: " + pay1.getSalary());

        Employee pay2 = new Programmer();
        System.out.println("프로그래머 월급: " + pay2.getSalary());
    }
}
