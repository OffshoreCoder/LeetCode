package Task205;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("egg", "add"));
        System.out.println(new Solution().isIsomorphic("foo", "bar"));
        System.out.println(new Solution().isIsomorphic("paper", "title"));
        System.out.println(new Solution().isIsomorphic("badc", "baba"));
    }
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (mapS[sc] != mapT[tc]) {
                return false;
            }

            mapS[sc] = i + 1;
            mapT[tc] = i + 1;
        }

        return true;
    }

}
