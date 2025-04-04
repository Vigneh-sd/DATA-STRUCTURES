
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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


public class FindPairDLL{

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

  public static List<List<Integer>> findpair(Node head, int sum)
  {
    List<List<Integer>> ans=new ArrayList();
      Node temp=head;
      Node start=head;
      Node end=null;
      while(temp.next!=null)
      {
        temp=temp.next;
      }
      end=temp;
      while(start!=end && start.prev!=end )
      {
        if(start.data+end.data==sum)
        {
          List<Integer> pair = Arrays.asList(start.data,end.data);
          ans.add(pair);
          start=start.next;
          end=end.prev;
        }
        else if(start.data+end.data < sum)
        {
           start=start.next;
        }
        else
        {
            end=end.prev;
        }
      }
      return ans;
  }
   
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,9};
        Node x=convertarrnode(a);
        List<List<Integer>> ans=findpair(x, 5);
        System.out.println(ans);
        
    }

}