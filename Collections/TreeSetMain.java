import java.util.*;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet <Integer> ts = new TreeSet<>(List.of(10,30,50,60,10,40));
        ts.add(25);
        System.out.println(ts);
        System.out.println(ts.ceiling(52));
    }
}
