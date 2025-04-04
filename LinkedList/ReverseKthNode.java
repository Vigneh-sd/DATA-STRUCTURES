/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseKthNode {
    public static ListNode reverse(ListNode head)
 {
    ListNode temp=head;
    ListNode before=null;
    ListNode after=null;
    while(temp!=null)
    {
        after=temp.next;
        temp.next=before;
        before=temp;
        temp=after;
    }
    return before;
 }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) return head;
        ListNode newhead=null;
        ListNode temp=head;
        ListNode ans=null;
        ListNode prevtail=null;
        int c=0,t=0;
        while(temp!=null)
        {
            c++;
            if(c==k)
            {
             t++;
             ListNode dummy=temp.next;
             temp.next=null;
             newhead=reverse(head);
               if(prevtail!=null) {
                    prevtail.next=newhead;
                }
                if(t==1) {
                    ans=newhead;
                }
             prevtail=head;
             head.next=dummy;
             head=dummy;
             temp=dummy;
             c=0;
            }
            else
            {
                temp=temp.next;
            }    
        }
     return ans!=null ? ans : head;
    }
}