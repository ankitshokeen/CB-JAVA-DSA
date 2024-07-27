public class UpperBoundBS {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 6, 7, 8, 9, 9, 9};

        System.out.println(upperBound(arr, 5));
    }

    static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length -1;
        int uB = -1;

        while (low <= high) {
            int mid = low+(high-low)/2;

            if (arr[mid] == target) {
                uB = mid +1;
                low = mid +1;
            }

            if (arr[mid] < target) {
                low = mid +1;
            } else {
                high = mid -1;
            }
        }

        return uB;
    }
}
