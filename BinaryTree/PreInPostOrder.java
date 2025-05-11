import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class PreInPostOrder {

    static class Pair {
        Node node;
        int state;
        Pair(Node n, int s) {
            node = n;
            state = s;
        }
    }

    public static void allTraversals(Node root, List<Integer> pre, List<Integer> in, List<Integer> post) {
        if (root == null) return;

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));

        while (!stack.isEmpty()) {
            Pair top = stack.peek();

            if (top.state == 1) {
                // Preorder
                pre.add(top.node.data);
                top.state++;
                if (top.node.left != null) {
                    stack.push(new Pair(top.node.left, 1));
                }
            } else if (top.state == 2) {
                // Inorder
                in.add(top.node.data);
                top.state++;
                if (top.node.right != null) {
                    stack.push(new Pair(top.node.right, 1));
                }
            } else {
                // Postorder
                post.add(top.node.data);
                stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        allTraversals(root, pre, in, post);

        System.out.println("Preorder: " + pre);
        System.out.println("Inorder: " + in);
        System.out.println("Postorder: " + post);
    }
}
