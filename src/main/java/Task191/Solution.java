package Task191;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(2147483645));
    }
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
