import java.util.*;

public class LinkedHashMapMain {
    public static void main(String[] args) {
        LinkedHashMap <Integer, String> lhm = new LinkedHashMap<>(5,0.75f,true){
            @Override
            protected boolean removeEldestEntry(java.util.Map.Entry<Integer, String> eldest) {
                return size()>5;
            }
        }; // The third argument is a boolean to tell whether we want to access it on basis of insertion or LRU
        lhm.put(2,"xyz");
        lhm.put(1,"ayz");
        lhm.put(7,"vrs");
        lhm.put(5,"azf");
        lhm.put(4,"def");
        lhm.put(8,"axc");

        String s = lhm.get(2);
        s = lhm.get(7);
        lhm.put(6,s);

        lhm.forEach((key,value) -> System.out.println("Key : " + key + " Value :" + value));
    }
}
