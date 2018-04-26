import java.util.Arrays;


public class IsPalindrome {
    public static void main(String[] args) {
        int[] matrix = new int[]{2, 2, 3, 4, 4};
        IsPalindrome ip = new IsPalindrome();
        ip.createSet(matrix);
        int x = -121;
        String st = String.valueOf(x);
        StringBuffer sb = new StringBuffer();
        String sbe = sb.append(st).reverse().toString();
        if (sbe.equals(st)) {
            System.out.println("true");
            System.exit(0);
        }
        System.out.println("false");
    }

    private void createSet(int[] nums) {
        int j = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1] && nums[i - 1] != nums[i]) {
                j = nums[i];
                System.out.println(j);
            }
        }
    }
}



