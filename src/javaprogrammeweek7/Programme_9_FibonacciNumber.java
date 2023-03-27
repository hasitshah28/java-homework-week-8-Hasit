package javaprogrammeweek7;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {
    public static void fibonacciNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci Series upto number you want: ");
        int n = scanner.nextInt();
        scanner.close();
        int firstTerm = 1, secondTerm = 1;


        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
    public static void main(String[] args) {
        fibonacciNumber();

    }
}
