//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class SubArraySum {
//
//    public static void main(String[] args) {
//
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
//        permutation(arr);
//        Array.
//    }
//
//    private static void permutation(int[] arr) {
//        permutation(arr[0],Arrays.copyOfRange(arr,0,0),arr);
//    }
//
//    private static void permutation(int[] arr) {
//
//        for(int i=0;i<arr.length;i++) {
//            ArrayList<int[]> lp = new ArrayList<int[]>();
//            int[] a1 =  permutation(arr[i], Arrays.copyOfRange(arr,i+1,arr.length));
//            permutation(a1, arr[i]);
//        }
//
//    }
////    void permutation(String str, String prefix) {
////        if (str.length() == 0) {
////            System.out.println(prefix);
////        } else {
////            for (int i = 0; i < str.length(); i++) {
////                String rem = str.substring(0, i) + str.substring(i + 1);
////                System.out.println(rem);
////                permutation(rem, prefix + str.charAt(i));
////            }
////        }
//}
