// optimal
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
public class PalindromeLL{
    public static Node convertarrtoLL(int a[])
{
    Node head=new Node(a[0]);
    Node mover=head;
    for(int i=1;i<a.length;i++)
    {
        Node temp=new Node(a[i]);
        mover.next=temp;
        mover=temp;
    }
    return head;
}
public static void print(Node head)
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}
 public static Node reverse(Node head)
 {
    if(head==null || head.next==null)
    return head;
    Node newnode=reverse(head.next);
    Node after=head.next;
    after.next=head;
    head.next=null;
    return newnode;

 }

 public static boolean plaindrome(Node head)
 {
     if (head == null || head.next == null) {
            return true;
        }
    Node slow=head;
    Node fast=head;
    while(fast.next.next!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    Node newNode = reverse(slow.next);
    Node temp=head;
    while(temp!=null && newNode!=null)
    {
        if(temp.data!=newNode.data)
        return false;
        temp=temp.next;
        newNode=newNode.next;
    }
    Node ans = reverse(slow.next);
    return true;
 }
 
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,3,2,1};
        Node x = convertarrtoLL(a);
        boolean ans=plaindrome(x);
        System.err.println(ans);

    }
}