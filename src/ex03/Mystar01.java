package ex03;

public class Mystar01 {

    public static void main(String[] args) {

        /*
         * //1번
         * for (int i = 0; i < 5; i++) {
         * for (int k = 0; k < i; k++) {
         * System.out.print("*");
         * }
         * System.out.println("*");
         * }
         */

        /*
         * // 2번
         * for (int i = 1; i < 6; i++) {
         * for (int k = 5; k > i; k--) {
         * System.out.print("*");
         * }
         * System.out.println("*");
         * }
         */

        // 3번
        // for (int i = 0; i < 3; i++) {
        // for (int k = 0; k < i; k++) {
        // System.out.print("**");
        // }
        // System.out.println("*");
        // }

        // for (int i = 4; i < 6; i++) {
        // for (int k = 5; k > i; k--) {
        // System.out.print("**");
        // }
        // System.out.println("*");
        // }

        // for (int i = 0; i < 5; i++) {
        // System.out.println("*");
        // for (int k = 0; k == i / 2; k++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("**");
        // }
        // System.out.print("**");
        // }
        // }

        // 4번
        for (int i = 2; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
                System.out.print(i + "*" + k + "=" + i * k + " ");
            }
            System.out.println(" ");

        }

    }
}
