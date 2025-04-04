class Node{
    int data;
    Node next;
    Node prev;
    
    Node(int data, Node next, Node prev)
    {
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}


public class ReverseDLL{

    public static Node convertarrnode(int a[])
    {
        Node head= new Node(a[0]);
        Node prev=head;
        for(int i=1;i<a.length;i++)
        {
           Node temp = new Node(a[i],null,prev);
           prev.next=temp;
           prev=temp;
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
       Node last=null ;
       while(temp!=null)
       {
        last=temp.prev;
        temp.prev=temp.next;
        temp.next=last;
        temp=temp.prev;
       }
       return last.prev;
    }
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        Node x=convertarrnode(a);
        Node rev=reverse(x);
        print(rev);
        
    }

}