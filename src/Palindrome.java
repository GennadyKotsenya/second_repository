public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(454));
        System.out.println(isPalindrome(32235));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(1243521));

    }

    public static boolean isPalindrome(int value) {

        String[] arrayNumbers = String.valueOf(value).split("");

        for (int i = 0; i < arrayNumbers.length / 2; i++) {

            if (!arrayNumbers[i].equals(arrayNumbers[arrayNumbers.length
                    - i - 1])) {
                return false;

            }
        }
        return true;
    }
}
