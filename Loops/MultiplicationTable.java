import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        n = scan.nextInt();

        System.out.println("Multiplication Table of " + n + " : ");
        
        int i,j;
        for(i = 1; i <= 10; i++){
            j = i * n;
            System.out.println(n + " X " + i + " = " + j);
        }
        
        scan.close();
    }
}
