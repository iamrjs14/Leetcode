import java.util.Scanner;

public class ValidString {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isValid(str));

    }

    private static boolean isValid(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == '(' && str.charAt(i + 1) != ')') || (str.charAt(i) == '{' && str.charAt(i + 1) != '}') || (str.charAt(i) == '[' && str.charAt(i + 1) != ']')) {
                i = i + 1;
                return false;
            }
        }
        return true;
    }
}

