import java.util.Arrays;

public class SolutionX {

    public static void main(String[] args) {

        char[][] arr = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}};
        SolutionX sx = new SolutionX();
        sx.replaceSorrounding(arr);
    }

    private void replaceSorrounding(char[][] arr) {
        for(int i=1;i<arr.length-1;i++) {
            for(int j=1;j<arr[i].length-1;j++){
                if(arr[i][j] == 'O') {
                    arr[i][j] = 'X';
                }
                continue;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }



}

