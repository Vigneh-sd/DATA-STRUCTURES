// brute force
 class ListNode {
       int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
 public class MiddleElementLL {
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int c=0;
      while(temp!=null)
      {
        c++;
        temp=temp.next;
      }
      temp=head;
      int cnt=0;
      while(temp!=null)
      {
        cnt++;
        if(cnt==(c/2)+1)
        {
            return temp;
        }
        temp=temp.next;
      }
      return temp;
    }
}

// optimal 
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         if(head==null || head.next==null) return head;
//         ListNode slow=head;
//         ListNode fast=head;
//         while(fast!=null && fast.next!=null)
//         {
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }
// }