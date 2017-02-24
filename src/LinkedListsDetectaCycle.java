import java.util.HashSet;

/**
 * Created by atsema on 2/22/2017.
 */
public class LinkedListsDetectaCycle {
    public static void main(String[] args) {
        Node first = new Node();
        first.data = 1;
        Node second = new Node();
        second.data = 2;
        Node third = new Node();
        third.data = 3;

        first.next = second;
        second.next = third;
        third.next = first;

        System.out.println(hasCycle(first));
    }
    static boolean hasCycle(Node head) {
        Node current = head;
        if (current == null || current.next == null)
            return false;
        HashSet<Node> visited = new HashSet<Node>();
        while(current.next != null){
            current = current.next;
            if(visited.contains(current))
                return true;
            visited.add(current);
        }
        return false;
    }
    static class Node {
        int data;
        Node next;
    }
}
