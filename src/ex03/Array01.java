package ex03;

public class Array01 {

    public static void main(String[] args) {

        String[] toppings = { "pepperoni", "Mushrooms", "Onions", "Sauage", "Bacon" };
        for (int s = 0; s < toppings.length; s++) {
            String chuga = toppings[s];
            System.out.println(chuga);
        }
        System.out.println();
        System.out.println(toppings[0]);

        // for (String a : toppings) {
        // System.out.println(a);
        // }

        // int[] list = { 2, 4, 5, 6 };
        // for (int a : list) {
        // System.out.println(a);
        // }

        // double[] add = new double[4];
        // System.out.println(add[3]);

        // int[] s = new int[10];
        // for (int i = 0; i < s.length; i++) {
        // s[i] = i;
        // System.out.println(s[i] + "");
        // }

    }
}
