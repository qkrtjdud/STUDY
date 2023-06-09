package ex05.ch02;

public class App {
    static void attack(ProtossUnit u1, ProtossUnit u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당헀습니다");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
        System.out.println();
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("지럿1", 100, 10);
        ProtossUnit z2 = new Zealot("지럿2", 100, 10);

        ProtossUnit d1 = new Dragoon("드라군1", 100, 5);

        attack(z1, z2);
        attack(z1, d1);
        attack(z1, d1);
    }
}
