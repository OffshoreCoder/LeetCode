package Task171;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().titleToNumber("ZY"));
    }
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            result += (int) ((columnTitle.charAt(i) - 64) * Math.pow(26, columnTitle.length() - 1 - i));
        }

        return result;
    }
}
