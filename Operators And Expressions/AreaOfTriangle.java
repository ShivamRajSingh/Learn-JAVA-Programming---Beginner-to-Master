import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String [] args){
        double a, b, c, s, res;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the value of a : ");
        a = scan.nextDouble();
        
        System.out.print("Enter the value of b : ");
        b = scan.nextDouble();
        
        System.out.print("Enter the value of c : ");
        c = scan.nextDouble();

        s = (a + b + c)/2;

        res = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.print("Area of triangle : " + res + " square units");
        scan.close();

    }
}