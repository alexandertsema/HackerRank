/**
 * Created by Alex on 2/21/2017.
 */
public class ArraysLeftRotation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = 5;
        int k = 4;

        for (int i = 0; i < n; i++) {
            int index = (k + i) % n;
            System.out.print(a[index]);
            System.out.print(' ');
        }
    }
}
