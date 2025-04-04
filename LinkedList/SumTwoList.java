


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
public class SumTwoList{
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

 public static Node sumnodes(Node head1, Node head2)
 {
   head1=reverserecursive(head1);
   head2=reverserecursive(head2);
   int sum=0, carry=0;
   Node dummy=new Node(-1);
   Node ans=dummy;
   while(head1!=null || head2!=null){
         if(head1!=null && head2!=null){
           sum=head1.data+head2.data+carry;
           head1=head1.next;
           head2=head2.next;
         }
         else if(head1!=null && head2==null){
            sum=head1.data+carry;
            head1=head1.next;
         }
          else if(head1==null && head2!=null){
            sum=head2.data+carry;
            head2=head2.next;
         }
         ans.next=new Node(sum%10);
         carry=sum/10;
         ans=ans.next;
   }
   if(carry==1){
   ans.next=new Node(carry);
   }
   return reverserecursive(dummy.next);
 }

    public static void main(String[] args) {
        int a[]=new int[]{1};
        int b[]=new int[]{9,9};
        Node x = convertarrtoLL(a);
        Node y = convertarrtoLL(b);
        Node ans=sumnodes(x, y);
        print(ans);
    }
}