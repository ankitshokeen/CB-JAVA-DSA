import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, -2, 5, 8, 20, -10, 8};

        //System.out.println(Arrays.toString(prefix(arr)));
        //System.out.println(Arrays.toString(suffix(arr)));
        System.out.println(equalSum(arr));
    }

    private static int[] prefix(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        return prefix;
    }

    private static int[] suffix(int[] arr) {
        int[] suffix = new int[arr.length];
        suffix[suffix.length-1] = arr[arr.length-1];
        for (int i= arr.length-2; i>=0; i--) {
            suffix[i] = suffix[i+1] + arr[i];
        }

        return suffix;
    }

    private static int equalSum(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;
        int j = 1;

        while (j < arr.length) {

            for (int i=0; i<=j; i++) {
                leftSum += arr[i];
            }
            for (int i=arr.length-1; i>j; i--) {
                rightSum += arr[i];
            }

            if (leftSum == rightSum) {
                return leftSum;
            } else {
                leftSum = 0;
                rightSum = 0;

                j++;
            }
        }

        return -1;
    }
}