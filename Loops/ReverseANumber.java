import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.print("Enter a number : " );
        n = scan.nextInt();

        int rev,temp;
        rev = temp = 0;
        while(n > 0){
            temp = n % 10;
            rev = rev * 10 + temp;
            n = n/10;
        }
        System.out.println("Reversed Number : " + rev);
        scan.close();
    }
}
