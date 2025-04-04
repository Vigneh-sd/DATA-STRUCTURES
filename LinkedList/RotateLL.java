
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
public class RotateLL{
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
 public static Node rotatektimes(Node head, int k)
 {
    if(head==null || head.next==null || k==0) return head;
    Node rev=reverse(head);
    Node temp=rev;
    Node ans1=null, first=null, ans2=null;
    int c=0;
    while(temp!=null)
    {
        c++;
        temp=temp.next;
    }
    k=k%c;
    if(k==0) return reverse(rev);
    c=0;
    temp=rev;
    while(temp!=null)
    {
        c++;
        if(c==k)
        {
             first=temp.next;
             temp.next=null;
             ans1=reverse(rev);
             ans2=reverse(first);
            rev.next = ans2;
             break;
        }
        temp=temp.next;
    }
    return ans1;
 }
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        Node x = convertarrtoLL(a);
        Node ans=rotatektimes(x, 2);
        print(ans);

    }
}