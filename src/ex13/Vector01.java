package ex13;

import java.util.*;

public class Vector01 {
    public static void main(String[] args) {
        Vector<String> vc = new Vector<>();

        vc.add("A");
        vc.add("B");
        vc.add("C");

        System.out.println(vc.get(1));
        for (int i = 0; i < vc.size(); i++) {
            System.out.println(vc.get(i));
        }
        System.out.println("============");
        vc.add(1, "D");
        System.out.println(vc.get(0));
        System.out.println(vc.get(1));
        System.out.println(vc.get(2));
        System.out.println(vc.get(3));

        System.out.println("============");
        vc.set(2, "AA");

        for (int i = 0; i < vc.size(); i++) {
            System.out.println(vc.get(i));
        }
    }
}
