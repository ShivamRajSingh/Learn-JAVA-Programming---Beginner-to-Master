import java.util.*;

public class KeybRead {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        String s;
        System.out.println("May I Know your name?");
        s = scan.nextLine();
        System.out.println("Hi, Mr/Ms. " + s + "!");
        
        int a,b,c;
        System.out.print("Enter two numbers : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);

        scan.close();
    }    
}
