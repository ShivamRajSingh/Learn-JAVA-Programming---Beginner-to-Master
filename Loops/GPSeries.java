import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,r,n,temp;

        System.out.print("Enter first term : " );
        a = scan.nextInt();
        
        System.out.print("Enter common ratio : " );
        r = scan.nextInt();
        
        System.out.print("Enter no. of terms : " );
        n = scan.nextInt();

        temp = a;
        for(int i =0; i < n; i++){
            System.out.print(temp + " ");
            temp = temp*r;
        }
        scan.close();
    }
}
