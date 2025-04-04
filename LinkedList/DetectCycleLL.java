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
public class DetectCycleLL{
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

public static boolean cycle(Node head)
{
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
            return true;
        }
    }
    return false;
}
 
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        Node x = convertarrtoLL(a);
        boolean ans=cycle(x);
        //print(x);
        System.out.print(ans);

    }
}