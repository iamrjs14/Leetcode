import java.util.Arrays;

public class CreateMatrix {
    public static void main(String[] args) {

        int marks[][]={{50,60,55,67,70},{62,65,70,70,81},{72,66,77,80,69}};
        String x = Arrays.deepToString(marks);
        for(int i=0; i<marks.length;i++){
            for(int j=0; j<marks[i].length;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
