public class LongestCommonSubsequence {

    int longestSubsequence(char[] ch1, char[] ch2, int m,int n) {
        if (m == 0 || n == 0)
            return 0;
        if (ch1[m - 1] == ch2[n - 1])
            return 1 + longestSubsequence(ch1, ch2, m - 1, n - 1);
        else
            return max(longestSubsequence(ch1, ch2, m - 1, n), longestSubsequence(ch1, ch2, m, n - 1));
    }

    int max(int a,int b) {
        return (a>b)?a:b;
    }
        public static void main(String[] args) {
            LongestCommonSubsequence lcs = new LongestCommonSubsequence();
            String s1 = "abacndb";
            String s2 = "bascndb";
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            int m = ch1.length;
            int n = ch2.length;
                System.out.println(lcs.longestSubsequence(ch1,ch2,m,n));
    }

}
