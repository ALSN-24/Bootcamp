package Experimental;

public class RowsColumns {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row < n; row++) {
            System.out.print("Row" + row + " ");
            for (int col = 1; col < n; col++) {
                System.out.print("col" + col + " ");

            }
            System.out.println();
        }
    }
}
