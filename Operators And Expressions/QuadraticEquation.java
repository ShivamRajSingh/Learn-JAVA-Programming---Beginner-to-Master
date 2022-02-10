import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("General form of Quadratic Equation : ax^2 + bx + c");
        
        int a, b ,c;
        double D;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the value of a : ");
        a = scan.nextInt();

        System.out.print("Enter the value of b : ");
        b = scan.nextInt();

        System.out.print("Enter the value of c : ");
        c = scan.nextInt();

        D = b*b - 4*a*c;

        double x1 = (double) (-b + Math.sqrt(D))/2*a;
        double x2 = (double) (-b - Math.sqrt(D))/2*a;

        System.out.println("Roots of the given quadratic equation are : " + x1 + " and " + x2);
        scan.close();

    }    
}
