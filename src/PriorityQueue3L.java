import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue3L {
    /*Priority Queue = A FIFO data structure that serves elements  
     *                 with the highest priority first before elements with lower
     *                 priority.
     */
    
    public static void main(String[]args){

       /*  Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());//for desending order reverseOrder.

        queue.offer(3.0);
        queue.offer(2.6);
        queue.offer(1.5);
        queue.offer(4.0);
        queue.offer(4.8);*/
        
        Queue<String> queue = new PriorityQueue<>();
        
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("E");
        queue.offer("D");

        while(!queue.isEmpty()){    
            System.out.println(queue.poll());// will poll the item and display it. It will be in assending order(Dafault).
                                            //if we want to print in desending order we can inherit from collection class(reverseOrder())
        }

    }

}
