import java.util.*;

public class HashTableMain {
    public static void main(String[] args) {
        // Legacy class
        Hashtable ht = new Hashtable();

        ht.put(1,"a");
        ht.put(2,"b");
        ht.put(3,"c");
        ht.put(4,"d");
        ht.put(5,"e");

        String s = (String) ht.get(3);
        
        Enumeration e = ht.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
