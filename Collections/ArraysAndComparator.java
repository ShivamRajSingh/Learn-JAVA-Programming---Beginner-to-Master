import java.util.*;

public class ArraysAndComparator {
    public static void main(String[] args) {
        int [] arr1 = {2,4,6,8,1,3,5};
        int [] arr2 = {2,4,6,8,1,3,5,7};

        System.out.println(Arrays.compare(arr1,arr2));

        int [] arr3 = Arrays.copyOf(arr1, arr1.length);

        // Arrays.fill(arr3, 2);

        Arrays.sort(arr3);

        for(int x : arr3){
            System.out.println(x);
        }

        System.out.println(Arrays.binarySearch(arr1, 4));

    }
}
