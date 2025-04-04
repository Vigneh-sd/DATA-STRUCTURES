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
public class RemoveNthNodeEnd{
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
public static Node removenodeend(Node head, int n)
{
    if(head==null ) return null;
    Node fast=head;
    for(int i=0;i<n;i++)
    {
       fast=fast.next;
    }
    if(fast==null) return head.next;
    Node slow=head;
    Node prev=null;
    while(fast!=null)
    {
        prev=slow;
        slow=slow.next;
        fast=fast.next; 
    }
    prev.next=slow.next;
    return head;
}
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,3,2,1};
        Node x = convertarrtoLL(a);
        x=removenodeend(x,7);
        print(x);

    }
}