package ex13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set01 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 7, 9));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));

        s2.retainAll(s1);
        System.out.println(s2);
        s2.addAll(s1);
        System.out.println(s2);

    }
}
