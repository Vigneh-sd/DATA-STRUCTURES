
import java.util.PriorityQueue;

class MergeKLists {
    public ListNode solution(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        for(int i = 0; i < lists.length; i++) {
            if (lists[i] != null) pq.add(lists[i]);
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            tail.next = node;
            tail = tail.next;
            
            if (node.next != null) {
                pq.add(node.next);
            }
        }
        
        return dummy.next;
    }
}

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }