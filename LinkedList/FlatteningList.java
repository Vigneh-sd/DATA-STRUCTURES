
class Node{
 int data;
 Node next;
 Node child;

 Node(int data, Node next,Node child)
 {
    this.data=data;
    this.next=next;
    this.child=child;
 }

 Node(int data)
 {
    this.data=data;
    this.next=null;
    this.child=null;
 }
}
public class FlatteningList{
public static void print(Node head)
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}
public static Node merge(Node head1, Node head2)
{
  Node left=head1;
  Node right=head2;
  Node dummy=new Node(-1);
  Node ans=dummy;
  while(left!=null && right!=null)
  {
    if(left.data<=right.data)
    {
        ans.child=left;
        left=left.child;
    }
    else{
        ans.child=right;
        right=right.child;
    }
    ans=ans.child;
  }
  if(left!=null)
  {
    ans.child=left;
  }
  if(right!=null)
  {
    ans.child=right;
  }
  return dummy.child;
}

public static Node flat(Node head)
{
   if(head==null || head.next==null) return head;
    Node prev=flat(head.next);
    Node res=merge(head,prev);
    return res;
}
    public static void main(String[] args) {
          Node head = new Node(5);
        head.child = new Node(14);

        head.next = new Node(10);
        head.next.child = new Node(4);

        head.next.next = new Node(12);
        head.next.next.child = new Node(20);
        head.next.next.child.child = new Node(13);

        head.next.next.next = new Node(7);
        head.next.next.next.child = new Node(17);
        Node ans=flat(head);
        print(ans);

    }
}