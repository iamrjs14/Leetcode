import java.util.Scanner;

public class StringReverse {

    public static String reverseString(String s) {
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reverseString(str);
    }
}
