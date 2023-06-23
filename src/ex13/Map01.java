package ex13;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("kim", "1234");
        map.put("park", "pass");
        map.put("lee", "word");

        System.out.println(map.get("kim"));
        System.out.println(map.keySet());
        System.out.println("========");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " " + value);
        }
        System.out.println("=========");
        map.remove("lee");
        System.out.println(map);
        System.out.println("=========");
        map.put("choi", "5678");
        System.out.println(map);

    }
}
