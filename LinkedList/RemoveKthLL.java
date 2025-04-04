
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
public class RemoveKthLL{
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
public static void print(Node head)
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}

public static Node deleteKthlist(Node head, int k)
{
    if(head==null ) return head;
    if(k==1) return head.next;
    Node temp=head, prev=null;
    int c=0;
    while(temp!=null)
    {
        c++;
        if(c==k)
        {
            prev.next=temp.next;
            break;
        }
       prev=temp;
       temp= temp.next;
    }  
    return head;
    
} 
public static Node deleteValue(Node head, int value)
{
    if(head==null) return head;
    if(value==head.data) return head.next;
    Node temp=head;
    while(temp!=null && temp.next!=null)
    {
        if(temp.next.data==value)
        {
            temp.next=temp.next.next;
            break;
        }
       temp= temp.next;
    }  
    return head;
    
} 
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        Node x = solution(a);
        x=deleteValue(x,3);
        print(x);

    }
}