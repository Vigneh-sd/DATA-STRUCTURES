
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


public class RemoveAllOccurDLL{

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

    public static Node removealloccur(Node head, int key)
    {
        if(head==null) return null;
        Node temp=head;
         while(temp!=null && temp.data==key){
                    head=temp.next;
                    if(head!=null){
                    head.prev=null;
                    }
                    temp=head;
                }
        while(temp!=null){
            if(temp.data==key){
               if(temp.next==null){
                temp.prev.next=null;
               }
               else{
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
               }
           }
            temp=temp.next;
        }
         return head;
    }

    public static void main(String[] args) {
        int a[] = new int[]{10,10,10,10,0};
        Node x=convertarrnode(a);
        x=removealloccur(x, 10);
        print(x);
        
    }

}