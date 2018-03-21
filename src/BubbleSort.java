public class BubbleSort {

    void bubbleSort(int[] arr) {
        int temp;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - i - 1; i++) {
                if (arr[i] > arr[i + 1]) ;
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}