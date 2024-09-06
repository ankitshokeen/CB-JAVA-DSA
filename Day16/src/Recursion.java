public class Recursion {
    public static void main(String[] args) {
        //System.out.println(fact(4));
        //System.out.println(pow(3, 4));
        //System.out.println(tFact(1, 6));
        System.out.println(tPow(3, 1, 4));
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int x = n* fact(n-1);

        return x;
    }

    static int pow(int n, int k) {
        if (k == 0 || k == 1) {
            return 1;
        }

        int p = n*pow(n, k-1);

        return p;
    }

    static int tFact(int f, int n) {
        if (n == 0 || n == 1) {
            return f;
        }

        return tFact(f*n, n-1);
    }

    static int tPow(int n, int a, int k) {
        if (k == 1) {
            return a;
        }

        return tPow(n, n*a, k-1);
    }
}
