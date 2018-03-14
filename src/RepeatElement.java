import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatElement {

    private static boolean containsElement(String[] strArray) {
        int a = strArray.length;
        Set<String> newArray = new HashSet<>(Arrays.asList(strArray));
        if (a == newArray.size()) {
            System.out.println(false);
            return false;
        } else {
            System.out.println(true);
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = sc.nextLine().replaceAll("[\\[\\]\\ ]", "").split(",");
        containsElement(strArray);
    }
}




