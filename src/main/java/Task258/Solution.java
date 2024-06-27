package Task258;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().addDigits(38));
        System.out.println(new Solution().addDigits(0));
        System.out.println(new Solution().addDigits(9));
    }
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }
}
