import java.util.Scanner;

public class Area {
    static double area (double radius){
        return Math.PI * radius * radius;
    }
    static double area(double length , double breadth){
        return length * breadth;
    }
    static double area(double a, double b, double height){
        return 0.5 * (a + b) * height;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        double radius = scan.nextDouble();
        System.out.println("Area of Circle : " + area(radius));

        
        System.out.print("Enter the length and breadth : ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Area of Rectangle : " + area(num1,num2));

        scan.close();
    }    
}
