package Programs;
import java.util.*;
public class LinkedListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList(); 
		  
        // Adding elements to the linked list 
        ll.add("A"); 
        ll.add("B"); 
        ll.add(1, "E"); 
        System.out.println(ll);
        ll.addFirst("M");
        ll.addLast("N");
        System.out.println(ll);
        ll.add(5);
        ll.add(6);
        System.out.println(ll);
        
         
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll); 
        
        

        
	}

	

	

}

