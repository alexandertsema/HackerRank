import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Alex on 2/21/2017.
 */
public class HashTablesRansomNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        if (n > m){
            System.out.println("No");
            return;
        }

        HashMap<Integer, String> magazine = new HashMap<Integer, String>();

        for(int i=0; i < m; i++){
            magazine.put(i, in.next());
        }

        while (in.hasNext()){
            if (!magazine.containsValue(in.next())){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
