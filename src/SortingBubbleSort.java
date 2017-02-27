import java.util.Scanner;

/**
 * Created by Alex on 2/26/2017.
 */
public class SortingBubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int numberOfSwaps = 0;
        for (int i = 0; i < a.length; i++) {
            // Track number of elements swapped during a single array traversal


            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    numberOfSwaps++;
                }
            }
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        scan.close();

        System.out.println(String.format("Array is sorted in %1$d swaps.", numberOfSwaps));
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}
