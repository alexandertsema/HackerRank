import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by atsema on 2/22/2017.
 */
public class StacksBalancedBrackets {
    public static boolean isBalanced(String expression) {
        char[] arr = expression.toCharArray();
        if (arr.length % 2 != 0)
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

//        if (!map.containsKey(arr[0]))
//            return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                stack.push(arr[i]);
            }
            else {
                if (stack.empty()) return false;
                char poped = stack.pop();
                if (map.get(poped) != arr[i])
                    return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
//        String[] arr = {
//                "{[()]}",
//                "{[(])}",
//                "{{[[(())]]}}"
//        };
//        for (int a0 = 0; a0 < arr.length; a0++) {
//            String expression = arr[a0];
//            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
//        }
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
