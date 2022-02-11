public class Fibonacci {
    public static void main(String[] args) {
        int a,b,c;
        a = 0;
        b = 1;
        
        System.out.print(a + " " + b + " ");       

        int i = 0;
        while( i < 10){
            c = a+b;
            System.out.print(c + " ");       
            a = b;
            b = c;     
            i++;
        }
        
    }
}
