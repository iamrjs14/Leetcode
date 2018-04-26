import java.util.Arrays;
import java.util.Collections;

public class RotateList {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {2,1,3,4};
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i : arr){
            System.out.println(i);
        }

     }
}