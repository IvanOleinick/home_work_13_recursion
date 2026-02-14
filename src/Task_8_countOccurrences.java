public class Task_8_countOccurrences {
    static void main(String[] args) {
        int[] arr = {1,2,3,3,3,6,7,4,0};
        long start = System.nanoTime();
        System.out.println(countOccurrences(arr, 3));
        System.out.println("simple " + (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println(countOccurrencesRecursive(arr, 3));
        System.out.println("recursive " + (System.nanoTime() - start));


    }

    public static int countOccurrences(int[] arr, int value){
        int count = 0;
        for (int j : arr) {
            if (j == value) count++;
        }
        return count;
    }
    public static int countOccurrencesRecursive(int[] arr, int value) {
        if (arr == null || arr.length == 0) return 0;
        return countOccurrencesRecursive(arr, value, 0);
    }

    private static int countOccurrencesRecursive(int[] arr, int value, int index) {
        if (index == arr.length) return 0;
        return countOccurrencesRecursive(arr, value, index + 1)
                + (arr[index] == value ? 1 : 0);
    }


}
