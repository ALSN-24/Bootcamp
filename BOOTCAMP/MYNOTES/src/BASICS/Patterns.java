package BASICS;
/*
 *   How to approach:
 *
 *   1. Number of rows = number lines = number of outer loops will run.
 *   2. Identify for every row number
 *       - How many columns are there?
 *       - or Types of elements in column?
 *   3. What do you need to print?
 *
 *   Note:
 *
 */

public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern28(5);
        pattern30(5);


    }


    static void pattern1(int n) {
/*
       This is pattern 1
       * * * * *
       * * * * *
       * * * * *
       * * * * *
       * * * * *
 */
        System.out.println("This is pattern 1");
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }


    static void pattern2(int n) {
/*
    This is pattern 2
    *
    * *
    * * *
    * * * *
    * * * * *

 */
        System.out.println("\nThis is pattern 2");
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern3(int n) {
/*
    This is pattern 3
    * * * * *
    * * * *
    * * *
    * *
    *

 */
        System.out.println("\nThis is pattern 3");
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
/*
    This is pattern 4
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
 */
        System.out.println("\nThis is pattern 4");
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
/*
    This is pattern 5

    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
 */
        System.out.println("\nThis is pattern 5");
        for (int row = 0; row < n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern6(int n) {
        System.out.println("This is pattern 6");
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    static void pattern28(int n) {
/*
    This is pattern 28

        *
       * *
      * * *
     * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
 */
        System.out.println("\nThis is pattern 28");
        for (int row = 0; row < n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = totalColsInRow;
            for (int s = 5; s > noOfSpaces ; s--) {
                System.out.print(" ");

            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        System.out.println("\nThis is pattern 30");

        for (int row = 1; row <= n; row++) {

            // spaces is base on n - current row then increment as follows
            // 1. for space is 0 < n (n = 5) thus true
            // 2. n - minus row (row = 1)
            // 3. then n is now 4
            // 4. iterate the print "  " (spaces)
            // 5. iterate until the condition is false
            // 6. iteration is 4 times because n is set to 5
            // 7. thus the condition 4 < 5 -1
            // 8. 4 < 4 is false
            // 9. note that space is incrementing space value
            //10. however consequently the output decrements
            //11. because space is always start with 0
            //12. and the n remains 5
            //13. the output space decrements because the row increments outside this 'space' loop
            //14. thus the space outputs decrement to row
            // (0 < 5 - 1), 0 < 4 (true), iterate 4 times
            // (0 < 5 - 2), 0 < 3 (true), iterate 3 times
            // (0 < 5 - 3), 0 < 2 (true), iterate 2 times
            // (0 < 5 - 4), 0 < 1 (true), iterate 1 time
            // (0 < 5 - 5), 0 < 0 (false), no iteration
            for (int space = 0; space < n - row ; space++) {
                System.out.print("  ");

            }

            // The pattern is base on column value
            // 1. for column >= 1
            // 2. integer is set to 1 to be iterated until the condition is true
            // 3. decrement to finish the condition
            //
            // Example:
            // 1. for column is 1 >= 1 (true)
            // 2. decrement 1 or column - 1
            // 3. column value now is 0
            // 4. print col (column)
            // 5. output:         1
            // 6. output: first it prints spaces "  " this iterates 4 times
            // 7. second: this for loop prints the current value of column
            // 8. back to #3 now that column is 0
            // 9. next
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " " );
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " " );
            }
            System.out.println();
        }
    }



}