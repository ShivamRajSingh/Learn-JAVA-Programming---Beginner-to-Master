import java.util.Scanner;

public class ArrayPractise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int [] arr = new int [5];
        int sum = 0;
        int max1, max2;
        max1 = max2 = Integer.MIN_VALUE;
        
        System.out.println("Enter Elements in Array : ");
        for(int i =0; i < arr.length; i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
            if(max1 < arr[i]){
                max2 = max1;
                max1 = arr[i];
            }else if (max2 < arr[i]){
                max2 = arr[i];
            }
        }
        System.out.println("Sum is : " + sum);
        System.out.println("Maximum Element1 : " + max1);
        System.out.println("Maximum Element2 : " + max2);

        System.out.print("Enter the key you want to search : ");
        int key = scan.nextInt();
        for(int x : arr){
            if(x == key){
                System.out.println("Found !!");
                System.exit(0);
            }
        }
        System.out.println("Not Found.");
        scan.close();
    }
}
