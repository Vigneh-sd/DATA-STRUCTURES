


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
public class SortLL{
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
public static Node merge(Node head1, Node head2)
{
    Node list1=head1;
    Node list2=head2;
    Node dummy=new Node(-1);
    Node temp=dummy;
    while(list1!=null && list2!=null)
    {
        if(list1.data<=list2.data)
        {
             temp.next=list1;
             list1=list1.next;
        }
         else
        {
             temp.next=list2;
             list2=list2.next;
        }
        temp=temp.next;
    }
    if (list1!=null){
        temp.next = list1;
    } 
    else{
        temp.next = list2;
    }
    return dummy.next;
}

public static Node middle(Node head)
{
    if(head==null || head.next==null) return null;
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}

public static Node sortll(Node head)
{
    if(head==null || head.next==null) return head;
     Node mid=middle(head);
     Node left=head;
     Node right=mid.next;
     mid.next=null;
     Node l= sortll(left);
     Node r= sortll(right);
     return merge(l,r);
}

    public static void main(String[] args) {
        int a[]=new int[]{1,3,9,7,4,6,8,9,6,5};
        int b[]=new int[]{2,3,4,5};
        Node x = convertarrtoLL(a);
        Node y = convertarrtoLL(b);
        Node ans=sortll(x);
        print(ans);
    }
}