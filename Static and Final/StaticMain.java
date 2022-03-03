class Fortuner{
    static double price;
    String color;

    static{
        // Static Block
        price = 3000000;
    }

    static double onRoadPrice (String city){
        // Static method can only access static variables of the class
        switch(city){
            case "Delhi":
                return price += price*0.1;
            case "Ludhiana":
                return price += price*0.05;
            default:
                return price += price*0.02;
        }
    }

}

public class StaticMain {
    public static void main(String[] args) {
        System.out.println(Fortuner.price);
        System.out.println(Fortuner.onRoadPrice("Delhi"));
    }
}
