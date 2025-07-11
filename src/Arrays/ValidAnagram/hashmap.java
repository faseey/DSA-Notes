package Arrays.ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) return false;

            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        boolean result = isAnagram(s, t);

        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
