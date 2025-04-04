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
public class LengthLoopLL{
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

 public static int Lengthloop(Node head) {
      Node slow=head;
      Node fast=head;
      int c=1;
      while(fast!=null && fast.next!=null)
      {
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
           fast=fast.next;
           while(slow!=fast)
           {
            c++;
            fast=fast.next;
           }
        }
      }
      return 0;
    }
 
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        Node x = convertarrtoLL(a);
         int ans=Lengthloop(x);
        //print(x);
        System.out.print(ans);

    }
}