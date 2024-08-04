import java.util.Arrays;

import static java.util.Collections.swap;

public class RotateArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int k) {
        k%=arr.length;

        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }

    private static void reverse(int[] arr, int idx1, int idx2) {
        while (idx1<=idx2) {
            swap(arr ,idx1, idx2);

            idx1++;
            idx2--;
        }
    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}