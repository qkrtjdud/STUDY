package exgain.book.miniProject;

import java.util.Scanner;

abstract class Sprite {
    int x = 3, y = 3;

    abstract void move(char c);
}

class Main extends Sprite {
    void move(char c) {
        if (c == 'h' || c == 'H')
            --x;
        else if (c == 'j' || c == 'J')
            --y;
        else if (c == 'k' || c == 'K')
            ++y;
        else if (c == 'l' || c == 'L')
            ++x;
    }
}

class Monster extends Sprite {
    public Monster() {
        x = y = 7;
    }

    void move(char c) {
        x += (Math.random() - 0.5) > 0 ? 1 : -1;
        y += (Math.random() - 0.5) > 0 ? 1 : -1;
    }
}

class Goid extends Sprite {
    public Goid() {
        y = 6;
    }

    void move(char c) {

    }
}

public class TextGame {
    public static void main(String[] args) {

        Sprite A = new Main();
        Sprite M = new Monster();
        Sprite G = new Goid();

        Scanner sc = new Scanner(System.in);
        boolean foundGold = false;
        boolean gameOver = false;

        while (!foundGold && !gameOver) {
            System.out.println("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l)");

            char userMove = sc.next().charAt(0);

            A.move(userMove);
            M.move(' ');

            // A와 G의 위치가 동일한지 확인하여 골드를 찾았는지 확인합니다.
            if (A.x == G.x && A.y == G.y) {
                System.out.println("Gold G를 찾았습니다!");
                foundGold = true;
            } else if (A.x == M.x && A.y == M.y) {
                System.out.println("몬스터에게 잡혔습니다! 게임 오버!");
                gameOver = true;
            } else {
                System.out.println("주인공 A: (" + A.x + ", " + A.y + ")");
                System.out.println("몬스터 M: (" + M.x + ", " + M.y + ")");
                System.out.println("골드 G: (" + G.x + ", " + G.y + ")");
                System.out.println("Gold G를 찾지 못했습니다.");
            }
        }
        sc.close();
    }
}