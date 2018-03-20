import java.util.Scanner;

public class LongestSubPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        findLongPalindrome(str);
    }

    private static String findLongPalindrome(String str) {
        char[] ch1 = str.toCharArray();
        StringBuffer sb = new StringBuffer(str);
        StringBuffer sb2 = new StringBuffer();
        String revstr = sb.reverse().toString();
        char[] ch2 = revstr.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == ch2[i])
                sb2.append(ch1[i]);
        }
        System.out.println(sb2.toString());
        return sb2.toString();
    }
}
