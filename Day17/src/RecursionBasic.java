public class RecursionBasic {
    public static void main(String[] args) {
        
        //printName(5);
        //printNno(0, 5);
        //printNnoRev(5);
        //System.out.println(sumNno(5));
        //System.out.println(factorialN(5));
        
        //int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        //System.out.println(Arrays.toString(revArray(nums, 0, nums.length-1)));
        
        //String s = "abcba";
        //System.out.println(isPalindrome(s, 0, s.length()-1));
        
        //System.out.println(fibo(6));
    }
    
    
    //print n times name
    static void printName(int n) {
        if (n == 0) {
            return;
        }
        
        System.out.println("Ankit");
        
        printName(n-1);
    }
    
    //print 1 to n
    static void printNno(int i ,int n) {
        if (i > n) {
            return;
        }
        
        System.out.println(i);
        
        printNno(i+1, n);
    }
    
    //print n to 1
    static void printNnoRev(int i) {
        if (i < 0) {
            return;
        }
        
        System.out.println(i);
        
        printNnoRev(i-1);
    }
    
    //sum of n no
    static int sumNno(int n) {
        if (n == 0) {
            return 0;
        }
        
        return n + sumNno(n-1);
    }
    
    //factorial of n no
    static int factorialN(int n) {
        if (n == 1) {
            return 1;
        }
        
        return n * factorialN(n-1);
    }
    
    //reverse array
    static int[] revArray(int[] nums, int i, int j) {
        if (i == j || i > j) {
            return nums;
        }
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
        revArray(nums, i+1, j-1);
        
        return nums;
    }
    
    //is string palindrome
    static Boolean isPalindrome(String s, int i, int j) {
        if (i > j) {
            return true;
        }
        
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        
        return isPalindrome(s, i+1, j-1);
    }
    
    //Nth fibonacci no
    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        
        return fibo(n-2) + fibo(n-1);
    }
}
