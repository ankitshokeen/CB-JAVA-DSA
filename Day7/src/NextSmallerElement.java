import java.util.Arrays;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};

        System.out.println(Arrays.toString(NSEL(nums)));
    }

    private static int[] NSEL(int[] arr) {
        int[] arr2 = new int[arr.length];
        int nextSmaller = Integer.MAX_VALUE;

        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] < nextSmaller) {
                nextSmaller = arr[i];
            }

            arr2[i] = nextSmaller;
            arr2[0] = 0;
        }

        return arr2;
    }

    private static int[] NSER(int[] arr) {
        int[] arr2 = new int[arr.length];
        int nextSmaller = Integer.MAX_VALUE;

        for (int i=arr.length-1; i>=0; i--) {
            arr2[i] = nextSmaller;
            arr2[arr2.length-1] = 0;

            if (arr[i] < nextSmaller) {
                nextSmaller = arr[i];
            }
        }

        return arr2;
    }
}
