import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};

        System.out.println(Arrays.toString(NGER(nums)));
    }

    private static int[] NGEL(int[] arr) {
        int[] arr2 = new int[arr.length];
        int nextGreater = 0;

        for (int i=0; i<arr.length; i++) {
            arr2[i] = nextGreater;

            if (arr[i] > nextGreater) {
                nextGreater = arr[i];
            }
        }

        return arr2;
    }

    private static int[] NGER(int[] arr) {
        int[] arr2 = new int[arr.length];
        int nextGreater = 0;

        for (int i= arr.length-1; i>=0; i--) {
            arr2[i] = nextGreater;

            if (arr[i] > nextGreater) {
                nextGreater = arr[i];
            }
        }

        return arr2;
    }
}
