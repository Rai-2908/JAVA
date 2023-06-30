import java.util.Queue;
import java.util.LinkedList;

public class Queue2L {
    
     /*
     Queue == FIFO Data Structure{First In First Out}
     It is a collection designed for holding elements prior to processing. 
     it is a Linear data structure.

    may return        task       No exceptions
    exceptions          |             |
        |               |             |
     add()       =    enqueue   =  offer()
     remove()    =    dequeue   =  pol()
     element()   =    examine   =  peek()
     -  -   -  --  -   -    -    -   -   -   -   -   -  -
     Following are the that queue inherit from collection class.
     isEmpty() = output will be in form of T/F.
     size()= will tell the size of queue.
     contains()= wil tell that ifthe object is present in que ue or not 
                 in the  for of T/F.
     */
    public static void main(String[]args){

        Queue<String> queue = new LinkedList<String>();//(Queue is an interface thats y we can use linkedlist and PirorityQueue to make a class)
        
        System.out.println(queue.isEmpty());
        queue.offer("Hello");
        queue.offer("my");
        queue.offer("name");
        queue.offer("is");
        queue.offer("Shivam");
        queue.offer("Rai");
        
        queue.poll();// if used to delete all element it will show empty array[] but if we have used element() method it will show exception.
        queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue);

    }

}
 /*
  * Uses of Queue:-
    Keyboad Buffer(letter houd appear on the screen in tha order they're pressed)
    Printer Queue (Print jobs should be completed in order).
    Used in Linkedlist, PriorityQueues, BFS(Breadth-First-Search) Algorithm.
    */








