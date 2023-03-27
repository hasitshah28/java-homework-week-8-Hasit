package javaprogrammeweek7;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * *
 */
public class Programme_15_TrianglePattern {
    public static void main(String[] args) {
        leftAngleTraingle();
    }

    public static void leftAngleTraingle() {
        int n = 5; // number of rows
        // outer loop for rows
        for (int i = 1; i <= n; i++) {

            // inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
