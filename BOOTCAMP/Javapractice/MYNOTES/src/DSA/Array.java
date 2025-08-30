package DSA;

import java.util.Collections;

import static java.util.Collections.reverse;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        reverse(Collections.singletonList(arr));

        for (int arrRev : arr) {
            System.out.print(arrRev);
        }
    }
}
