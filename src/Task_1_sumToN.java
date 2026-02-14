public class Task_1_sumToN {
    static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(sumToN(10));
        System.out.println("simple " + (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println(sumToNRecursive(10));
        System.out.println("recursive " + (System.nanoTime() - start));
    }

    public static long sumToN(int n) {
        int first = 0;
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = first + i;
            first = res;
        }
        return res;
    }

    public static long sumToNRecursive(int n) {
        return n <= 1 ? n : n + sumToNRecursive(n - 1);
    }
}
