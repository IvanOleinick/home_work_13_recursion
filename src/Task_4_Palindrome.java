public class Task_4_Palindrome {
    static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(isPalindrome(10000001));
        System.out.println("simple " + (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println(isPalindromeRecursive(10000001));
        System.out.println("recursive " + (System.nanoTime() - start));


    }

    public static boolean isPalindrome(int n) {
        if (n < 0) return false;

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return original == reversed;
    }

    public static boolean isPalindromeRecursive(int num) {
        if (num < 0) return false;
        return num == reverseRecursive(num, 0L);
    }

    private static long reverseRecursive(int num, long reversed) {
        if (num == 0) {
            return reversed;
        }
        int digit = num % 10;
        return reverseRecursive(num / 10, reversed * 10 + digit);
    }

}
