package dsa.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {

            String current = String.valueOf(s.charAt(i));

            if (i < s.length() - 1) {
                String next = String.valueOf(s.charAt(i + 1));

                if (map.get(current) < map.get(next)) {
                    result += map.get(next) - map.get(current);
                    i++;
                } else {
                    result += map.get(current);
                }

            } else {
                result += map.get(current);
            }
        }
        System.out.println(result);
    }
}

