package ex13;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mongo");
        list.add("pear");
        list.add("Grape");

        int index = list.indexOf("pear");
        int index2 = list.indexOf("Apple");

        System.out.println("배 위치 : " + index);
        System.out.println("사과 위치 : " + index2);
        System.out.println("==============");
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
        System.out.println(list.size());
    }
}
