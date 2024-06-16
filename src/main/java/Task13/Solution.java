package Task13;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    static final HashMap<Character, Integer> romanNumber = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static int romanToInt(String s) {
        int result = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int current = romanNumber.get(s.charAt(i));
            int next = (i + 1 < length) ? romanNumber.get(s.charAt(i + 1)) : 0;

            if (current < next) {
                result += next - current;
                i++;
            } else {
                result += current;
            }
        }

        return result;
    }
}
