import java.util.*;

public class LinkedListMain {
    public static void main(String[] args) {
        // Linked List will work on all the methods of ArrayList

        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(20,25,30,35));

        ll1.add(10);
        ll1.add(0,5);
        ll1.addAll(ll2);
        ll1.add(25);
        ll1.addFirst(0);
        ll1.addLast(100);

        System.out.println(ll1.peek());
        System.out.println(ll1.contains(50));
        System.out.println(ll1.get(3));
        System.out.println(ll1.indexOf(25));
        System.out.println(ll1.lastIndexOf(25));
        System.out.println(ll1);

        // To print elements any of the following method:

        for(int i =0; i < ll1.size(); i++){
            System.out.print(ll1.get(i) + " ");
        }
        System.out.println("");

        for(Integer x : ll1){
            System.out.print(x + " ");
        }
        System.out.println("");

        for(var x : ll1){
            System.out.print(x + " ");
        }
        System.out.println("");
        
        System.out.println("Using Iterators"); 

        Iterator<Integer> it = ll1.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("");

        ListIterator<Integer> it2 = ll1.listIterator();
        while(it2.hasNext()){
            System.out.print(it2.next() + " ");
        }
        System.out.println("");

        for(ListIterator<Integer> itr = ll1.listIterator(); itr.hasNext(); ){
            System.out.print(itr.next() + " ");
        }
        System.out.println("");

        System.out.println("Using Lambda Expressions ");
        ll1.forEach(n->show(n));
        System.out.println("");
        ll1.forEach(System.out :: println);

    }
    static void show(int n){
        if(n > 10){
            System.out.println(n);
        }
    }
}
