

class Node{
 int data;
 Node next;

 Node(int data, Node next)
 {
    this.data=data;
    this.next=next;
 }

 Node(int data)
 {
    this.data=data;
    this.next=null;
 }
}
public class LL{
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        Node x= new Node(a[0]);
        System.out.print(x.data);
    }
}