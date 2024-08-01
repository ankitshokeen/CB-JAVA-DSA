import java.util.Arrays;

public class SelecitonSort {
    public static void main(String[] args) {

        int[] arr = {5, 4, 1, 2, 3};

        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr) {
        for (int i=0; i<=arr.length-1; i++) {
            int minIdx = findMin(arr, i);

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        return arr;
    }

    static int findMin(int[] arr, int a) {
        int min = a;

        for (int i=a+1; i<=arr.length-1; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }

        return min;
    }
}