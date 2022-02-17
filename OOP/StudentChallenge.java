class Product{
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    // constructors
    public Product(String itemNo, String name) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = 100;
        this.qty = 1;
    }
    public Product(String itemNo, String name, double price) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.qty = 1;
    }
    public Product(String itemNo, String name, double price, int qty) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    // setters
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    // getters
    public String getItemNo() {
        return itemNo;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
}


public class StudentChallenge {
    public static void main(String[] args) {
        Product product = new Product("A12F45", "Pepsi Can");
    }
}
