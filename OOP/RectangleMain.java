class Rectangle{
    private int length;
    private int breadth;

    public void setLength(int length){
        this.length = length;
    }
    
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }

    public int area(){
        return length * breadth;
    }

    public int perimeter() {
        return 2 * length * breadth;
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.setLength(12);
        rectangle1.setBreadth(20);

        rectangle2.setLength(5);
        rectangle2.setBreadth(4);

        System.out.println("Area of Rectangle 1 : " + rectangle1.area());
        System.out.println("Perimeter of Rectangle 1: " + rectangle1.perimeter());

        
        System.out.println("Area of Rectangle 2 : " + rectangle2.area());
        System.out.println("Perimeter of Rectangle 2 : " + rectangle2.perimeter());
    }
}
