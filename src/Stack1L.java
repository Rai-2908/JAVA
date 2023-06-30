import java.util.Stack;

public class Stack1L {
    
    /* stack == LIFO data structure {Last In Firs Out}
                stores obeject into a sort of "vertical tower"
                numbering of stack starts from 1,2,3...
                push() to add to the top
                pop() to remove from  the top
                peek() to see the top most item 
                search() to search an object within the stack */

    public static void main(String[] arg){

        Stack<String> stack = new Stack<String>(); 

        //System.out.println(stack.empty());    to check if stack is empty or not; output will be in T/F form
        stack.push("1"); 
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");
        
        //System.out.println(stack); to check all the ites in stack {show out put in form of an array}
        
        //stack.pop();
        //System.out.println(stack);
        String myfavnumber = stack.pop(); // will show the last deleted iteam as it works on LIFO

        System.out.println(myfavnumber);
        System.out.println(stack.peek()); // will show top item 
        System.out.println(stack.search("5")); // output will be in form of(1, -1)
        System.out.println(stack);
        

        for (int i=0;i<10; i++ ){

            stack.push("Shivam");
        }
        System.out.println(stack);
        

    }    
}

/*Uses of Stack??
 * undo/redo features in text editors.
 * moving back and forward through browser history.
 * backtracking algorithms (maze, file directories).
 * calling functions (call stack).
 */











