


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
public class Sort012{
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
public static Node sort(Node head)
{
  Node dummy1 = new Node(-1);
  Node dummy2 = new Node(-1);
  Node dummy3 = new Node(-1);
  Node zero = dummy1;
  Node one = dummy2;
  Node two = dummy3;
  Node temp = head;
  while(temp!=null)
  {
    if(temp.data==0)
    {
        zero.next=temp;
        zero=zero.next;
    }
    else if(temp.data==1)
    {
        one.next=temp;
        one=one.next;
    }
    else
    {
        two.next=temp;
        two=two.next;
    }
    temp=temp.next;
  } 
  zero.next=dummy2.next!=null ? dummy2.next : dummy3.next;
  one.next=dummy3.next;
  two.next=null;
  
  return dummy1.next;

}

    public static void main(String[] args) {
        int a[]=new int[]{0,2,0,1,1,2,0};
        Node x = convertarrtoLL(a);
        x=sort(x);
        print(x);
    }
}