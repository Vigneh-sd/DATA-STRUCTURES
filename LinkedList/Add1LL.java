


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
public class Add1LL{
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
public static Node reverserecursive(Node head)
 {
    if(head==null || head.next==null)
    return head;
    Node newNode=reverserecursive(head.next);
    Node after=head.next;
    after.next=head;
    head.next=null;
    return newNode;
 }
public static Node add(Node head)
{
    Node ans=reverserecursive(head);
    Node temp=ans;
    int carry=1;
    int sum=0;
    while(temp!=null)
    {
      sum=temp.data+carry;
      if(sum==10)
      {
        carry=1;
        temp.data=0;
      }
      else{
        carry=0;
        temp.data=sum;
      }
      temp=temp.next;
      if(carry==0)
      return reverserecursive(ans);
    }
    head=reverserecursive(ans);
    Node newnode= new Node(1);
    newnode.next=head;
    return newnode;
}

    public static void main(String[] args) {
        int a[]=new int[]{9,9};
        Node x = convertarrtoLL(a);
        x=add(x);
        print(x);
    }
}