import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {9, 1, 8, 2, 7, 3, 4, 6, 5};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        for (int i=1; i< arr.length; i++) {
            for (int j=0; j< arr.length - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
