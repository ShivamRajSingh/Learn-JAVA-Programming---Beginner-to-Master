import java.util.Scanner;

public class SearchForElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int arr[] = {3,9,7,8,12,6,15,5,4,10};

        System.out.print("Enter the number : ");
        int n;
        n = scan.nextInt();

        for(int x : arr){
            if(x == n){
                System.out.println("Found");
                System.exit(0);
            }
        }
        System.out.println("Not Found");

        scan.close();
    }
}
