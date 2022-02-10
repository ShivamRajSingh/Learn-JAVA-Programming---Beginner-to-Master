import java.util.Scanner;

class TypeOfProtocol{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter URL : ");
        String url = scan.nextLine();

        int colon = url.indexOf(":");
        String protocol = url.substring(0,colon);

        int dot = url.lastIndexOf(":");
        String domainName = url.substring(dot);

        switch(protocol){
            case "http":
                System.out.println("HTTP : Hyper Text Transfer Protocol");
                break;
            case "ftp":
                System.out.println("FTP : File transfer Protocol");
                break;
            default:
                System.out.println("HTTPS : Hyper Text Transfer Protocol Secured");

        }

        switch(domainName){
            case ".org":
                System.out.println(".org : organization");
                break;
            case ".gov":
                System.out.println(".gov : government");
                break;    
            case ".net":
                System.out.println(".net : network");
                break;
            case ".biz":
                System.out.println(".biz : business");
                break;
            default:
                System.out.println(".com : Commercial");
        }
        
        scan.close();
    }
}