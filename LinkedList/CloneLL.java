
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class CloneLL {
    public Node copyRandomList(Node head) {
        Node temp=head;
        while(temp!=null)
        {
            Node copy=new Node(temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=copy.next;
        }
        temp=head;
        while(temp!=null)
        {
            Node copy=temp.next;
            if(temp.random!=null){
            copy.random=temp.random.next;}
            else{
            copy.random=null;}
            temp=temp.next.next;
        }
        Node dummy= new Node(-1);
        Node ans=dummy;
        temp=head;
        while(temp!=null)
        {
            ans.next=temp.next;
            temp.next=temp.next.next;
            temp=temp.next;
            ans=ans.next;
        }
        return dummy.next;
    }
}