import java.util.*;

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 == o2){
            return 0;
        }else if(o1 < o2){
            return 1;
        }else{
            return -1;
        }
    }
}
public class ArraysAndComparator {
    public static void main(String[] args) {
        Integer [] arr1 = {2,4,6,8,1,3,5};
        Integer [] arr2 = {2,4,6,8,1,3,5,7};

        System.out.println(Arrays.compare(arr1,arr2));

        Integer [] arr3 = Arrays.copyOf(arr1, arr1.length);

        // Arrays.fill(arr3, 2);

        Arrays.sort(arr3, new MyComparator());

        for(int x : arr3){
            System.out.println(x);
        }

        System.out.println(Arrays.binarySearch(arr1, 4));

    }
}
