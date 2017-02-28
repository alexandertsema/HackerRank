import java.util.*;

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
        HashMap<String, Integer> magazine = new HashMap<String, Integer>();

        for(int i=0; i <m; i++){
            String val = in.next();
            if (magazine.containsKey(val)){
                magazine.put(val, magazine.get(val) + 1);
            }
            else{
                magazine.put(val, 1);
            }
        }

        while (in.hasNext()){
            String val = in.next();
            if (!magazine.containsKey(val) || magazine.get(val) == 0){
                System.out.println("No");
                return;
            }
            else {
                magazine.put(val, magazine.get(val) - 1);
            }
        }

        System.out.println("Yes");
    }
}
