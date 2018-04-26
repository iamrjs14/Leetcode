import java.util.Scanner;

public class SpiralMatrix {



    public static void main(String args[]) {
            Scanner sc  = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            int num = 1, rowbegin = 0, rowend = n - 1, colbegin = 0, colend = n - 1;

                for (int i = colbegin; i <= colend; i++) matrix[rowbegin][i] = num++;
                rowbegin++;

                for (int i = rowbegin; i <= rowend; i++) matrix[i][colend] = num++;
                colend--;

                for (int i = colend; i >= colbegin; i--) matrix[rowend][i] = num++;
                rowend--;

                for (int i = rowend; i >= rowbegin; i--) matrix[i][colbegin] = num++;
                colbegin++;
            }

        }


