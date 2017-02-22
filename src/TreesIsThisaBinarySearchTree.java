import java.util.Scanner;

/**
 * Created by Alex on 2/21/2017.
 */
public class TreesIsThisaBinarySearchTree {

    public static void main(String[] args) {
        Node ten = new Node(); // root
        ten.data = 10;
        //left
        Node eight = new Node();
        eight.data = 8;
        Node seven = new Node();
        seven.data = 7;
        Node nine = new Node();
        nine.data = 5;//!!
        //right
        Node twelve = new Node();
        twelve.data = 12;
        Node eleven =  new Node();
        eleven.data = 11;
        Node thirteen  = new Node();
        thirteen.data = 13;

        ten.left = eight;
        ten.right = twelve;
        eight.left = seven;
        eight.right = nine;

        twelve.left = eleven;
        twelve.right = thirteen;

        System.out.println(' ');
        System.out.println(checkBST(ten));
    }

    static class Node {
        int data;
        Node left;
        Node right;
    }

    static boolean checkBST(Node root) {
        return vlr(root);
    }

    static boolean vlr(Node node){
        boolean result = true;
        if (node.left != null){
            if (node.data < node.left.data)
                return false;
            else{
                result = vlr(node.left);
                if (!result) return false;
            }
        }
        if (node.right != null){
            if (node.data > node.right.data)
                return false;
            else{
                result = vlr(node.right);
                if (!result) return false;
            }
        }
        return result;
    }
}
