import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.print("Enter a number : " );
        n = scan.nextInt();
        
        int fact = 1;
        for(int i = n; i > 0 ; i--){
            fact = fact * i;
        }
        
        System.out.println("Factorial of " + n + " : " + fact);
        
        scan.close();
    }
}
