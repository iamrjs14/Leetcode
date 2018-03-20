import java.util.Scanner;

public class LongestSubstring {

    public static int findSubstring(char[] ch) {
        int counter = 1;
        for (int i = 0; i < ch.length-1; i++) {
            if (ch[i] != ch[i + 1])
                counter++;
        }
        System.out.println(counter);
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        findSubstring(ch);
    }

}
