import java.util.Scanner;

public class UsernameAndDomainname {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Email-ID : ");
        String str = scan.nextLine();
        
        int index = str.indexOf('@');
        String domain = str.substring(index);
        
        String username = str.substring(0,index);
        System.out.println("User Name : " + username);
        
        int index1 = domain.indexOf('.');
        String domainName = domain.substring(1, index1);
        
        System.out.println("Domain Name : " + domainName);
        scan.close();
    }
}
