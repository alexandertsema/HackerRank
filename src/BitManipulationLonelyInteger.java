import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by atsema on 3/3/2017.
 */
public class BitManipulationLonelyInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        System.out.println(Arrays.stream(a).reduce(0, (x, y) -> x ^ y));
    }
}
