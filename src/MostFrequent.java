import java.util.HashMap;

public class MostFrequent {

    public static void main(String[] args) {
        int[] intArr = new int[]{2, 2, 2, 3, 3, 3,3,4,5};
        int k = 2;
        findMostFrequent(intArr, k);
    }

    private static void findMostFrequent(int[] intArr, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < intArr.length; i++) {
            int n = intArr[i];
            int counter = 0;
            for (int j = 0; j < intArr.length; j++) {
                if (n == intArr[j]) {
                    counter++;
                }
            }
            map.put(n, counter);
        }
        for(int i=0;i<2;i++) {
            System.out.println(map.keySet().toArray()[i]);
        }
    }
}
