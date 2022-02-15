import java.util.Scanner;

public class GCD {
    static void gcd(int num1, int num2){

        while(num1 != num2){
            if(num1 > num2){
                num1 -= num2;
            }else{
                num2 -= num1;
            }
        }
        System.out.print("HCF : " + num1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        gcd(num1,num2);

        scan.close();
    }    
}
