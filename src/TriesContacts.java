import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Alex on 2/26/2017.
 */

class Node{
    HashMap<Character, Node> children = new HashMap<>();
    boolean isWord;

    public Node() {
    }

    public Node(HashMap<Character, Node> children, boolean isWord) {
        this.children = children;
        this.isWord = isWord;
    }
}

public class TriesContacts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node trie = new Node();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();

            if (op.equals("add"))
                add(trie, contact);
            else if (op.equals("find"))
                System.out.println(find(trie, contact));
        }
    }

    private static int find(Node trie, String contact){
        int count = 0;
        HashMap<Character, Node> children = trie.children;
        Node next;
        for(int i = 0; i < contact.length(); i++){
            char c = contact.charAt(i);
            if(children.containsKey(c)){
                next = children.get(c);
                children = next.children;
                count++;
            }else{
                return 0;
            }
//            if (next.isWord)
//                count++;
        }
        return count;
    }

    private static void add(Node trie, String contact){
        HashMap<Character, Node> children = trie.children;
        for (int i = 0; i < contact.length(); i++) {
            char c = contact.charAt(i);
            Node next;
            if (children.containsKey(c))
                next = children.get(c);
            else{
                next = new Node();
                children.put(c, next);
            }

            children = next.children;
            if(i == contact.length()-1)
                next.isWord = true;
        }
    }
}
