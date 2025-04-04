

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
public class ReverseLLIteative{
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
    Node temp=head;
    Node before=null;
    Node after=null;
    while(temp!=null)
    {
        after=temp.next;
        temp.next=before;
        before=temp;
        temp=after;
    }
    return before;
 }
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        Node x = convertarrtoLL(a);
        Node ans=reverse(x);
        print(ans);

    }
}