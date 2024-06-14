package Task202;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.isHappy(19));
        System.out.println(Solution.isHappy(2));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }

    private static int getNext(int number) {
        int totalSum = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            totalSum += digit * digit;
        }
        return totalSum;
    }


}
