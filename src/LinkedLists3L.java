import java.util.LinkedList;

public class LinkedLists3L {

    public static void main(String[] args) {
        
        LinkedList<String> List = new LinkedList<>();

        /*List.offer(3.0);//Used as an queue
        List.offer(2.6);
        List.offer(1.5);
        List.offer(4.0);
        List.offer(4.8);

        System.out.println(List);*/

        List.push("1"); // used as stack
        List.push("2");
        List.push("3");
        List.push("4");
        List.push("5");
        List.push("6");
        
        List.add(4, "9");// addd element on a particular position
        List.remove("1");// remove an element
        System.out.println(List.peekFirst());//peek first element
        System.out.println(List.peekLast());//peek lastt element
        System.out.println(List.indexOf("2"));
        System.out.println(List);
    }

}

/*
 *  LINKEDLIST= stores in two parts (data + address)
 *              Nodes are in no-consecutive memory location
 *              Elements are linked using pointers
 *                 
 * 
 *                      Singly LinkedList
 * 
 *        Node                Node                  Node
 *    [data|address] ->   [data|address]  ->   [data|address]
 * 
 * 
 *                      Doubly LinkedList
 * 
 *          Node                Node                  Node
 *    [Null|data|address] ->   [address|data|address]  ->   [address|data|Null]
 * 
 * 
 *    ADVANTAGES:--
 *    1. Dynamic Data Structure(allocation of memory is done while programme is running)
 *    2. Insertion/Deletion of Nodes is easy. O(1)
 *    3. No/Low memory waste.
 * 
 *    DISADVANTAGES:--
 *    1. Greater memory usage(additional pointers)
 *    2. No random acces of an elements (no index is available[i])
 *    3. Accessing /searching elements is more time consuming. O(n)
 * 
 * 
 *    USAGE:---
 *    1. Implementation of stacks and Queues
 *    2. GPS navigation
 *    3. Music playlist
 */
/*
 *  import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(40);
        list.addFirst(5);
        list.remove(2);
        System.out.println(list.contains(40));
        System.out.println(list.indexOf(40));
        System.out.println(list.size());
        var array =list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
 * 
 */