import java.util.Scanner;

public class CheckForPrime {
    static boolean isPrime (int num){
        for(int i =2; i <= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        
        if(isPrime(num))
            System.out.println("Prime Number");
        else 
            System.out.println("Not a Prime Number");
        
            scan.close();
    }    
}
