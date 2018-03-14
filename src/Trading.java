import java.util.Scanner;

public class Trading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().replaceAll("[\\[\\]\\ \"]", "").split(",");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        int max = 0;
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > intArr[i - 1])
                max += intArr[i] - intArr[i - 1];
        }
        System.out.println(max);
    }
}
