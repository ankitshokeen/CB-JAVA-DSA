public class Recursion {
    public static void main(String[] args) {
        //System.out.println(fib(1, 5));
        //toss(3, "");
        //System.out.println(headCountToss(5));
        //System.out.println(headCountSubSequence("CAR"));
        //System.out.println(tailCountToss(3, 1));
        //System.out.println(tailCountSubSequence("CAR", 1));
        parentheses(5, 0, 0, "");
    }

    static int fib(int n, int k) {
        if (n == k) {
            return n;
        }

        return fib(n, k) + fib(n+1, k);
    }

    static void toss(int n, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }

        toss(n-1, s+'H');
        toss(n-1, s+'T');
    }

    static int headCountToss(int n) {
        if (n == 0) {
            return 1;
        }

        int h = headCountToss(n-1);
        int t = headCountToss(n-1);

        return h+t;
    }

    static int headCountSubSequence(String q) {
        if (q.length() == 0) {
            return 1;
        }

        int r = headCountSubSequence(q.substring(1));
        int l = headCountSubSequence(q.substring(1));

        return r+l;
    }

    static int tailCountToss(int n, int c) {
        if (n == 0) {
            return c;
        }

        return tailCountToss(n-1, c*2);
    }

    static int tailCountSubSequence(String q, int c) {
        if (q.length() == 0) {
            return c;
        }

        return tailCountSubSequence(q.substring(1), c*2);
    }

    static void parentheses(int n, int l, int r, String s) {
        if (l == n && r == n) {
            System.out.println(s);
            return;
        }

        if (l<n) {
            parentheses(n, l+1, r, s+'{');
        }
        if (r<l) {
            parentheses(n, l, r+1, s+'}');
        }
    }
}