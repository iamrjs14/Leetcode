public class Permutation {
    void permutation(String str) {
        permutation(str, "");
    }

    void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                System.out.println(rem);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    void reverseArray(int[] arr) {
        if (arr.length == 1)
            System.out.println(1);
        for (int i = 0; i < arr.length / 2; i++) {
            int other = arr.length - i - 1;
            int temp = arr[i];
            arr[i] = arr[other];
            arr[other] = arr[temp];
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Permutation p = new Permutation();
//        p.permutation("abcd");
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
//        p.reverseArray(arr);
        p.isPrime(11);
        System.out.println(p.fib(22));
    }

    private void isPrime(int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) {
                System.out.println("false");
                System.exit(0);
            }

        }
        System.out.println("true");
    }

    private int fib(int n) {
        if (n <= 0)
            return 0;
        else
            return fib(n - 1) + fib(n - 2);
    }
}