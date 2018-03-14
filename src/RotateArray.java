

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class RotateArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String[] strArray = sc.next().replaceAll("[\\[\\]\\ \"]", "").split(",");
        String[] lastSplit = Arrays.copyOfRange(strArray, k, strArray.length);
        String[] firstSplit = Arrays.copyOfRange(strArray, 0, k - 1);
        String[] both = Stream.concat(Arrays.stream(lastSplit), Arrays.stream(firstSplit))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(both));
        String x = "Hi";

    }
}
