public class LowerBoundBS {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 6, 7, 8, 9, 9, 9};

        System.out.println(lowerBound(arr, 10));
    }

    static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length -1;
        int lB = -1;

        while (low <= high) {
            int mid = low+(high-low)/2;

            if (arr[mid] == target) {
                lB = mid;
                high = mid -1;
            }

            if (arr[mid] < target) {
                low = mid +1;
            } else {
                high = mid -1;
            }
        }

        return lB;
    }
}