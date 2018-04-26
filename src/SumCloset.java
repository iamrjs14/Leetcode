import java.util.ArrayList;
import java.util.List;

public class SumCloset {

    static List<int[]> lst = new ArrayList<int[]>();
    public static void main(String[] args) {
        SumCloset sc = new SumCloset();
        int[] array = new int[] {-1,2,1,4};
        int target = 3;
        int[] sum = new int[target];
        int start = 0;
        int index = 0;
        int end = array.length-1;
        sc.combinationUtil(array,target,start,end,index,sum);;
        System.out.println(lst.toString());

    }

    private void combinationUtil(int[] array, int target, int start, int end, int index, int[] sum) {

        if (index == target)
        {
            for (int j=0; j<target; j++)
                System.out.print(sum[j]+" ");
            System.out.println("");
            return;
        }
        for(int i =0;i<=end && end-i+1 >= target-index;i++){
            sum[index] = array[i];
            combinationUtil(array,target,i+1,end,index+1,sum);
        }

    }


    public void CombinationUtil(int[] array, int[] sum, int start, int end, int index, int target) {
    }
}
