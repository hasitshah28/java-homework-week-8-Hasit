package javaprogrammeweek7;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */
public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        diamondPattern();

    }
    public static void diamondPattern() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = scanner.nextInt();
        scanner.close();
        int i = 1;
        int j;
        while (i <= n) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");

            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }

            System.out.println();
            i--;
        }
    }
}
