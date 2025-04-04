class Node {
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class RemoveDuplicatesDLL {

    public static Node convertarrnode(int a[]) {
        Node head = new Node(a[0]);
        Node prev = head;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node removedup(Node head) {
        if (head == null || head.next == null) return head;

        Node temp = head;

        while (temp != null) {
            if (temp.next != null && temp.data == temp.next.data) {
                temp.next = temp.next.next;
                if (temp.next != null) {
                    temp.next.prev = temp;
                }
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int a[] = new int[]{1, 1, 2, 3, 3, 3, 4, 7, 9, 9};
        Node x = convertarrnode(a);
        x = removedup(x);
        print(x);
    }
}
