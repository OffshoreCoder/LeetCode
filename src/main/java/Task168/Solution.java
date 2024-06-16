package Task168;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(52));
    }
    public static String convertToTitle(int columnNumber) {
        final int NUMBER_OF_LETTERS = 26;
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            result.append(Character.toChars('A' + columnNumber % NUMBER_OF_LETTERS));
            columnNumber /= NUMBER_OF_LETTERS;
        }

        return result.reverse().toString();
    }
}
