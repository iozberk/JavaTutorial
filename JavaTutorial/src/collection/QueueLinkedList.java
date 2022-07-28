package collection;

import java.util.*;

public class QueueLinkedList {
    
    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.add("John");
        q.add("Jennifer");    
        q.offer("Ted");
        q.offer("Amanda");
        q.remove(1); // false
        q.element();
        q.peek();
        q.forEach(a -> System.out.print(a +" ")); // Fifo John Jennifer Ted Amanda

    }






    
}
