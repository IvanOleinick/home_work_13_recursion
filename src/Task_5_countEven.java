public class Task_5_countEven {
    static void main(String [] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        long start = System.nanoTime();
        System.out.println(countEven(arr));
        System.out.println("simple " + (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println(countEvenRecursive(arr));
        System.out.println("recursive " + (System.nanoTime() - start));

    }
    public static int countEven(int[] arr){
        int count = 0;
        if (arr == null || arr.length == 0) return 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int countEvenRecursive(int[] arr){
        if (arr == null || arr.length == 0) return 0;
        return countEvenRecursive(arr, 0);

    }
    public static int countEvenRecursive(int[] arr, int index){
        if (index == arr.length) return 0;
        return countEvenRecursive(arr, index + 1) + (arr[index] % 2 == 0 ? 1 : 0);
    }



}
