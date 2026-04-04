package basicProgram;

import java.util.*;

public class FirstUnique {
    public static char firstNonRepeating(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : str.toCharArray())
            if (map.get(c) == 1)
                return c;

        return '-';
    }

    public static void main(String[] args) {
        String str="aaaaa";
        System.out.println(firstNonRepeating(str));
    }
}