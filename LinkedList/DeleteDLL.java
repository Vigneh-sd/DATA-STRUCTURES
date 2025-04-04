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


public class DeleteDLL{

    public static Node convertarrayddl(int a[])
    {
        Node head=new Node(a[0]);
        Node prev=head;
        for(int i=1;i<a.length;i++)
        {
            Node temp= new Node(a[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    public static void printddl(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static Node deletehead(Node head)
    {
        if(head==null || head.next==null) return null;

        head=head.next;
        head.prev=null;
        return head;
    }

    public static Node deletetail(Node head)
    {
        if(head==null || head.next==null) return null;

        Node tail=head;
    
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        Node prev=tail.prev;
        tail.prev=null;
        prev.next=null;

        return head;
    }

    public static Node deletekthNode(Node head, int k)
    {
       Node ele=head;
       if(head==null || head.next==null) return null;
       if(k==1){
       head=head.next;
       head.prev=null;
       return head;
       }
       int c=0;
       while(ele!=null)
       {
        c++;
         if(c==k)
         {
            break;
         }
         ele=ele.next;
       }
       if(ele==null) return head;
       if(ele.next==null){
       ele.prev.next=null;
       ele.prev=null;
        return head;
       }
      ele.prev.next=ele.next;
      ele.next.prev=ele.prev;
      ele.next=null;
      ele.prev=null;
       return head;
    }

    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        Node x=convertarrayddl(a);
        Node del=deletekthNode(x,6);
        printddl(del);
        
    }
}