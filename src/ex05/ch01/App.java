package ex05.ch01;

public class App {
    static void attackZtoD(Zealot u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당헀습니다");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(Dragoon u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당헀습니다");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(Zealot u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당헀습니다");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(Dragoon u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당헀습니다");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(Dragoon u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당헀습니다");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(DarkTempler u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당헀습니다");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(DarkTempler u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당헀습니다");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(DarkTempler u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당헀습니다");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("질럿1", 100, 10);
        Zealot z2 = new Zealot("질럿2", 100, 10);
        Dragoon d1 = new Dragoon("드라군1", 100, 5);
        Dragoon d2 = new Dragoon("드라군2", 100, 5);
        DarkTempler dt1 = new DarkTempler("다크템플러1", 100, 50);
        DarkTempler dt2 = new DarkTempler("다크템플러2", 100, 50);

        // 질럿이 드라군을 공격
        attackZtoD(z1, d1);
        attackZtoD(z1, d1);

        // 드라군이 질럿 공격
        attack(d1, z1);

        // 질럿이 질럿 공격
        attack(z1, z2);

        // 드라군이 드라군 공격
        attack(d1, d2);

        // 드라군이 다크 공격
        attack(d1, dt1);

        // 다크가 드라군 공격
        attack(dt1, d1);

        // 다크가 질럿 공격
        attack(dt1, z1);

        // 다크가 다크 공격
        attack(dt1, dt2);

        // 오버로딩 체험하기
        System.out.println();
        System.out.println(1);
        System.out.println(1.1);
        System.out.println('가');
        System.out.println("문자열");
        System.out.println(true);
    }
}
