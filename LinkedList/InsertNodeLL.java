
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
public class InsertNodeLL{
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

public static Node insertnode(Node head, int data)
{
    Node temp=new Node(data, head) ;
    return temp;
}
    
public static Node insertnodelast(Node head, int value)
{
    Node temp=head;
    while(temp.next!=null)
    {
       temp=temp.next;
    }
    Node newnode=new Node(value);
    temp.next=newnode;
    return head;
}

public static Node insertnodek(Node head, int value, int k)
{
    if(head==null) return head;
    if(k==1)
    {
        Node temp=new Node(value, head) ;
        return temp;
    }
    Node temp=head, prev=null;
    int c=0,d=0;
    while(temp!=null)
    {
        c++;
        if(c==k)
        {
            d++;
            Node newnode= new Node(value);
            prev.next=newnode;
            prev.next.next=temp;
            return head;
        }
        prev=temp;
        temp=temp.next;

    }
    if(c+1==k && d==0)
    {
        Node newnode= new Node(value);
        prev.next=newnode;

    }
    return head;
}
    

    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        Node x = solution(a);
        x=insertnodek(x,10,7);
        print(x);

    }
}