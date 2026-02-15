public class Task_2_countDigits {
    static void main() {
        long start = System.nanoTime();
        System.out.println( countDigits(123456789));
        System.out.println("simple " + (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println( countDigitsRecursive(123456789));
        System.out.println("recursive " + (System.nanoTime() - start));


    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static int countDigitsRecursive(int n) {
        return n == 0 ? 1 : 1 + countDigitsRecursive(n / 10);
    }
}
