import java.util.Scanner;

public class CheckIfBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number in binary notation : ");
        int n = scan.nextInt();
        String str = String.valueOf(n);
        boolean binary = str.matches("[01]*");

        if(binary){
            System.out.println("The given number is in binary.");
        }else{
            System.out.println("Not a binary number!");
        }

        System.out.print("Enter the date in dd/mm/yyyy notation : ");
        String date = scan.nextLine();
        boolean dateFormat = date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}");
        
        if(dateFormat){
            System.out.println(date);
        }else{
            System.out.println("Not a valid date Format!");
        }
        scan.close();
    }
}
