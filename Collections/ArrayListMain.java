import java.util.*;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>(List.of(20,25,30,35));

        al1.add(10);
        al1.add(0,5);
        al1.addAll(al2);
        al1.add(25);

        System.out.println(al1.contains(50));
        System.out.println(al1.get(3));
        System.out.println(al1.indexOf(25));
        System.out.println(al1.lastIndexOf(25));
        System.out.println(al1);

        // To print elements any of the following method:

        for(int i =0; i < al1.size(); i++){
            System.out.print(al1.get(i) + " ");
        }
        System.out.println("");

        for(Integer x : al1){
            System.out.print(x + " ");
        }
        System.out.println("");

        for(var x : al1){
            System.out.print(x + " ");
        }
        System.out.println("");
        
        System.out.println("Using Iterators"); 

        Iterator<Integer> it = al1.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("");

        ListIterator<Integer> it2 = al1.listIterator();
        while(it2.hasNext()){
            System.out.print(it2.next() + " ");
        }
        System.out.println("");

        for(ListIterator<Integer> itr = al1.listIterator(); itr.hasNext(); ){
            System.out.print(itr.next() + " ");
        }
        System.out.println("");

        System.out.println("Using Lambda Expressions ");
        al1.forEach(n->show(n));
        System.out.println("");
        al1.forEach(System.out :: println);

    }
    static void show(int n){
        if(n > 10){
            System.out.println(n);
        }
    }
}
