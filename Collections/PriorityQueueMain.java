import java.util.*;

class MyComparator implements Comparator<Integer>{
    public int compare(Integer obj1, Integer obj2){
        if(obj1 < obj2){
            return 1;
        }else if (obj1 > obj2){
            return -1;
        }else{
            return 0;
        }
    }
}

public class PriorityQueueMain {
    public static void main(String[] args) {
        // By default Min heap is implemented
        PriorityQueue <Integer> pq = new PriorityQueue<>();

        // To implement Max heap we need to redefine comparator
        // PriorityQueue <Integer> pq = new PriorityQueue<>(new MyComparator());

        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);

        System.out.println(pq.peek());

        pq.forEach((key)->System.out.println(key));

        pq.poll();

        pq.forEach((key)->System.out.println(key));


    }
}
