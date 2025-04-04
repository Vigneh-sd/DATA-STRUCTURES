
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
public class SearchElementLL{
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
public static boolean search(Node head, int x)
{
    Node temp=head;
    while(temp!=null)
    {
        if(x==temp.data)
        return true;
        temp=temp.next;
    }
    return false;
}
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        Node x = solution(a);
        boolean ans1=search(x,3);
        boolean ans2=search(x,9);
        System.out.println(ans1);
        System.out.println(ans2);


    }
}