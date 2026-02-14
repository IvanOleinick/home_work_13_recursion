public class Task_3_StringReverse {
    static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println( reverse("Hello"));
        System.out.println("simple " + (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println( reverseRecursive("Hello"));
        System.out.println("recursive " + (System.nanoTime() - start));


    }

    public static String reverse(String s){
        if (s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder stReversed= new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            stReversed.append(s.charAt(i));
        }
        return stReversed.toString();

    }

    public static String reverseRecursive(String s){

        return s.isEmpty()?s:reverseRecursive(s.substring(1))+s.charAt(0);
    }



}
