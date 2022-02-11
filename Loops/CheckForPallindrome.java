import java.util.Scanner;

public class CheckForPallindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n,temp1;
        System.out.print("Enter a number : " );
        n = scan.nextInt();
        temp1 = n;

        int rev,temp2;
        rev = temp2 = 0;
        while(n > 0){
            temp2 = n % 10;
            rev = rev * 10 + temp2;
            n = n/10;
        }

        n = temp1;

        if(rev == n){
            System.out.println("Yes, Number is Pallindrome!");
        }else{
            System.err.println("Argh! ,Not a Pallindrome Number.");
        }
        scan.close();
    }
}
