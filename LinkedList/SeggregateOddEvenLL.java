
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
public class SeggregateOddEvenLL{
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
public static Node oddeven(Node head)
{
    if(head==null || head.next==null || head.next.next==null) return head;
    Node odd=head;
    Node even=head.next;
    Node evenhead=even;
    while(even!=null && even.next!=null)
    {
        odd.next=even.next;
        odd=odd.next;
        even.next=odd.next;
        even=even.next;
    }
    odd.next=evenhead;
    return head;
}
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,3,2,1};
        Node x = convertarrtoLL(a);
        x=oddeven(x);
        print(x);

    }
}