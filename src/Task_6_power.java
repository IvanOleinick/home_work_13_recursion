public class Task_6_power {
    static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(power(2, 10));
        System.out.println("simple " + (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println(powerRecursive(2, 10));
        System.out.println("recursive " + (System.nanoTime() - start));


    }

    public static long power(long x, int n) {
        if (x == 0 && n == 0) return 0;
        if (n < 0) return 0;
        if (n == 0) return 1;
        long res = 1;
        for (int i = 0; i < n; i++) {
            res *= x;
        }
        return res;
    }

    private static long powerRecursive(long x, int n) {
        return n == 0 ? 1 : x * powerRecursive(x, n - 1);
    }


}
