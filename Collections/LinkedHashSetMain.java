import java.util.*;

public class LinkedHashSetMain {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("B");
        lhs.add("X");
        lhs.add("A");
        lhs.add("C");
        lhs.add("T");
        lhs.add("B");
        
        Iterator<String> itr = lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
