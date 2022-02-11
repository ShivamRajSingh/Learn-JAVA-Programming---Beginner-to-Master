import java.lang.*;
import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,d,n;

        System.out.print("Enter first term : " );
        a = scan.nextInt();
        
        System.out.print("Enter common difference : " );
        d = scan.nextInt();
        
        System.out.print("Enter no. of terms : " );
        n = scan.nextInt();

        System.out.print(a + " ");

        for(int i =1; i < n; i++){
            a = a + d;
            System.out.print(a + " ");
        }
        scan.close();
    }
    
    
}
