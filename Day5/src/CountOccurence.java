public class CountOccurence {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 4, 4, 4, 5, 5, 5, 6, 7, 7};

        System.out.println(countOccurence(arr, 4));

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

    static int countOccurence(int[] arr, int target) {
        return upperBound(arr, target) - lowerBound(arr, target);
    }
}
