package javaprogrammeweek7;

import java.util.Scanner;

/**
 * 8.	Display right angle triangle of @ using nested for loops
 * 	 	  @
 *        @@
 *        @@@
 *        @@@@
 *        @@@@@
 */
public class Programme_8_DisplayTriangle {

    public static void main(String[] args) {

        rightTrianlgePattern();
    }

    public static void rightTrianlgePattern() {
        int i, number, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input No of rows : ");
        number = sc.nextInt();

        for (i = 1; i <= number; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println("");
            sc.close();
        }

    }
}
