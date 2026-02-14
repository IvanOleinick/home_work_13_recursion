
public class Task_7_isSorted {
    static void main(String[] args) {
        int[] arr = new int[10_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        long start = System.nanoTime();
        System.out.println(isSorted(arr));
        System.out.println("simple " + (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println(isSortedRecursive(arr));
        System.out.println("recursive " + (System.nanoTime() - start));

    }

    private static boolean isSorted(int[] arr) {
        if (arr == null || arr.length < 2) return true;
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    private static boolean isSortedRecursive(int[] arr) {
        if (arr == null || arr.length < 2) return true;
        return isSortedRecursive(arr, 0);


    }

    public static boolean isSortedRecursive(int[] arr, int index) {
        if (arr == null || arr.length < 2) return true;
        if (index >= arr.length - 1) return true;
        if (arr[index] > arr[index + 1]) return false;
        return isSortedRecursive(arr, index + 1);
    }
}
