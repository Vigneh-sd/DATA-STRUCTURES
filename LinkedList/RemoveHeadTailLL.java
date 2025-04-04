
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
public class RemoveHeadTailLL{
    public static Node solution(int a[])
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
public static Node deletehead(Node head)
{
    if(head==null) return head;
    return head.next;
} 

public static Node deleteTail(Node head)
{
    Node temp =head;
    if(head==null || head.next==null) return null;
    while(temp.next.next!=null)
    {
        temp=temp.next;
    }
    temp.next=null;
    
    return head;
    
} 
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        Node x = solution(a);
        print(x);
         x=deletehead(x);
         print(x);
        x=deleteTail(x);
        print(x);

    }
}