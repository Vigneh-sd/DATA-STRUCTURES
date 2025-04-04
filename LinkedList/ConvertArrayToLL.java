
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
public class ConvertArrayToLL{
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
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        Node x = solution(a);
        int c=0;
        while(x!=null)
        {
          System.out.println(x.data);
            x=x.next;
        }
    }
}