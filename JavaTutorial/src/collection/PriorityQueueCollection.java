package collection;

import java.util.PriorityQueue;

public class PriorityQueueCollection  {
    public static void main(String[] args) {
        PriorityQueue pQueue = new PriorityQueue<>();
        pQueue.add(80);
        pQueue.add(30);
        pQueue.add(20);
        pQueue.add(60);
        //pQueue.

        while(!pQueue.isEmpty()){
            System.out.println(pQueue.poll());
        }
    }
    
}
