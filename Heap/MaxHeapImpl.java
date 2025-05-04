import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapImpl{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        pq.add(10);
        pq.add(5);
        pq.add(20);
        
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());  
        }
    }
}
