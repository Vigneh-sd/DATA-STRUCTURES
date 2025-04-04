/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class FindIntersectionLL {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode t1=a;
        ListNode t2=b;
        while(t1!=t2)
        {
           if(t1==null && t2==null) return null;
           t1= t1==null ? b : t1.next;
           t2= t2==null ? a : t2.next;

        }
        return t1;

    }
}