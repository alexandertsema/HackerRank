import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Alex on 2/26/2017.
 */
public class BinarySearchIceCreamParlor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int pool = in.nextInt();
            int n = in.nextInt();
            int flavors[] = new int[n];

            for(int a_i=0; a_i < n; a_i++){
                flavors[a_i] = in.nextInt();
            }

            first:
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (flavors[i] + flavors[j] == pool) {
                        i++;
                        j++;
                        System.out.println(String.format(j > i? "%1$d %2$d" : "%2$d %1$d", i, j));
                        break first;
                    }
                }
            }
        }
    }
}
