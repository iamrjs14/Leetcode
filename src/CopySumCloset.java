import java.util.ArrayList;
import java.util.List;

public class CopySumCloset {


    public static void main(String[] args) {
        CopySumCloset sc = new CopySumCloset();
        int[] array = new int[]{-1, 2, 1, 4};
        int target = 3;
        int[] sum = new int[target];
        int start = 0;
        int index = 0;
        int end = array.length - 1;
        sc.CombinationUtil(array, sum, start, end, index, target);


    }
    List<int[]> lst = new ArrayList<int[]>();
    public void CombinationUtil(int[] array, int[] sum, int start, int end, int index, int target) {
        if (index == target)
        {
            for (int j=0; j<target; j++)
                System.out.print(sum[j]+" ");
            System.out.println("");
            return;
        }

        for (int i = 0; i <= end && end - i + 1 >= target - index; i++) {
            sum[index] = array[i];
            CombinationUtil(array, sum, i + 1, end, index + 1, target);
        }
    }

}
