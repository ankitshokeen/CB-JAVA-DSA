public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //prArray(arr);
        //System.out.println(linearSearch(arr, 9));
        System.out.println(binarySearch(arr, 3));
    }

    //print array using for each loop
    private static void prArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i +" ");
        }

        System.out.println();
    }

    // linear search
    private static int linearSearch(int[] arr, int target) {

        for (int i=0; i<arr.length; i++)   {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // binary search
    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start+(end - start)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }

        return -1;
    }
}