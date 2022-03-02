import java.util.*;
import java.util.Map.*;

public class TreeMapMain {
    public static void main(String[] args) {
        TreeMap <Integer, String> tm = new TreeMap<>(Map.of(0,"A",1,"B"));

        tm.put(3, "C");
        tm.put(4, "D");

        System.out.println(tm.ceilingEntry(3));
        System.out.println(tm.ceilingEntry(4).getValue());
        System.out.println(tm);

        Entry <Integer, String> e = tm.firstEntry();

        System.out.println(e.getKey() + " " + e.getValue());
    }
}
