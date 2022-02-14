import java.util.Scanner;

public class InsertingAnElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int []arr = new int [10];
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 12;
        arr[5] = 7;

        int element = scan.nextInt();
        int index = scan.nextInt();

        for(int i = 6; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = element;

        for(int x : arr){
            System.out.print(x + " ");
        }

        scan.close();
    }
}
