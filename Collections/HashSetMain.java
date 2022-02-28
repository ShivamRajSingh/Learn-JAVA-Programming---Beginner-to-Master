import java.util.*;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>(20,0.75f);
        hash.add(10);
        hash.add(20);
        hash.add(30);

        System.out.println(hash);
    }
}
