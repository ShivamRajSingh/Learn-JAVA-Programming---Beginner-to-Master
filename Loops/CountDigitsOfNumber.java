import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.print("Enter a number : " );
        n = scan.nextInt();

        int count =0;
        while(n > 0){
            System.out.println(n % 10);
            n = n/10;
            count++;
        }
        System.out.println("Number of digits : " + count);
        scan.close();
    }
}
