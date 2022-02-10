import java.util.Scanner;

public class RadixOfANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if(s.matches("[01]+")){
            System.out.println("Binary Number with radix 2");
        }else if (s.matches("[0-7]+")){
            System.out.println("Octal Number with radix 8");
        }else if (s.matches("[0-9]+")){
            System.out.println("Decimal Number with radix 10");
        }else if (s.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal Number with radix 16");
        }

        scan.close();
    }
}
