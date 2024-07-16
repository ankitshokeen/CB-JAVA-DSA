public class PatternQuestions {
    public static void main(String[] args) {

//        Q1
//        for (int i=1; i<=5; i++) {
//            for (int j=1; j<=5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        Q2
//        for (int i=1; i<=5; i++) {
//            for (int j=1; j<=5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        Q3
//         for (int i=5; i>=1; i--) {
//             for (int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//
//         Q4
//        for (int i=1; i<=5; i++) {
//            for (int j=1; j<=5; j++) {
//                if (i==1 || j==1) {
//                    System.out.print("* ");
//                } else if (i==5 || j==5) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
//        Q5
//        for (int i=1; i<=n*2; i++) {
//            if (i <= n) {
//                for (int j=1; j<=i; j++) {
//                    System.out.print("* ");
//                }
//            } else {
//                for (int k=n-1; k>=i-n; k--) {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//
//        Q6
//         for (int i=1; i<=5; i++) {
//             for (int j=1; j<=i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//
//        Q7
//         for (int i=5; i>=1; i--) {
//             for (int j=1; j<=i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

        //Q8
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++) {
                if (i == j || i + j == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}