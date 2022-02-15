public class Discount {
    static double sum (double ...prices){
        double total = 0;
        for(double x : prices){
            total += x;
        }
        return total;
    }
    
    static double discount (double ...prices){
        double total = sum(prices);
        
        System.out.println("Total : " + total);
        System.out.print("After discount : ");
        if(total < 500){
            return total - 0.1 * total;
        }else if (total >= 500 && total < 1000){
            return total - 0.2 * total;
        }else{
            return total - 0.3 * total;
        }
    }
    public static void main(String[] args) {
        System.out.println(discount(5,13,2,44,56,75));
        System.out.println(discount(32.75,15.25,50,100.5,125.65));
    }
}
