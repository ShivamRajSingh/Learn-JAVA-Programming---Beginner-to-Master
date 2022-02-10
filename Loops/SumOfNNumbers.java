import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.print("Enter a number : " );
        n = scan.nextInt();

        System.out.print("Sum of first " + n + " numbers : ");
        int sum =0;
        for(int i=1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
        scan.close();
    }
}
