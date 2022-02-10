import java.util.Scanner;

public class MenuDrivenProgram{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter two numbers : ");
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        scan.nextLine(); // to avoid enter key being read as an input from keyboard
        System.out.println("Use the keyword for operation you want to perform : \n1.Add \n2.Sub \n3.Mul \n4.Div");
        
        String option = scan.nextLine();
        option.toLowerCase();        

        int result;

        switch (option){
            case "add":
                result = num1 + num2;        
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "sub":
                result = num1 - num2;        
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case "mul":
                result = num1 * num2;        
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case "div":
                result = num1 / num2;        
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid Operation!");
        }
        scan.close();
    }
}