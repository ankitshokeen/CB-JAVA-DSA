import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int i;

        //while loop
        //while (i <= 10) {
          //  System.out.println(i);
        //}

        //do while loop
        //do {
          //  System.out.println(i);
        //} while (i <= 10);

       // int n = sc.nextInt();
        //for loop
        //for (i=0; i<=n; i++) {
          //  System.out.print("* ");
       // }
       // System.out.println();
       // for (i=0; i<=n; i++) {
         //   System.out.print("i ");
       // }

        //nested for loop
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}