import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //swap(10, 20);
        //nNumbers(10);
        //System.out.println(prime(4));
        //System.out.println(reverseN(9451));
        //System.out.println(countNums(53735));
        //System.out.println(armStrong(371));
        printArr(arr);

        //System.out.println(arrSum(arr));

        //printRevArr(arr);
        System.out.println(Arrays.toString(revArr(arr)));
    }

    public static boolean armStrong(int n) {
        int cn = countNums(n);
        int pD = n;
        int aS = 0;

        while (pD!=0) {
            int no = pD%10;
            pD/=10;
            aS += (int) Math.pow(no, cn);
        }

        if (aS == n) return true;

        return false;
    }

    public static int countNums(int n) {
        int i = 0;

        while (n!=0) {
            n/=10;
            i++;
        }

        return i;
    }

    public static int reverseN(int n) {
        int rN = 0;

        while (n!=0) {
            rN = (rN * 10) + (n % 10);
            n/=10;
        }

        return rN;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a+" "+b);
    }

    public static void nNumbers(int n) {
        for (int i=1; i<=n; i++) {
            System.out.println(i);
        }
    }

    public static boolean prime(int n) {
        for (int i=2; i<n; i++) {
            if (n%i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int arrSum(int[] arr) {
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void printRevArr(int[] arr) {
        for (int i=arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static int[] revArr(int[] arr) {
        int[] arr2 = new int[arr.length];
        int j = arr.length-1;
        int i = 0;

        while (i<=arr.length-1 && j>=0) {
            arr2[j] = arr[i];
            i++;
            j--;
        }

        return arr2;
    }
}