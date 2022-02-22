abstract class Shape{
    abstract double perimeter();
    abstract double area();
}
class Circle extends Shape{
    private double radius;

    Circle(){
        radius = 1;
    }
    Circle(double radius){
        this.radius = radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    private double length, breadth;

    Rectangle(){
        length = breadth =1;
    }
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double perimeter(){
        return 2 * (length + breadth);
    }
    public double area(){
        return length * breadth;
    }
}
public class ShapeMain {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(10,5);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());

        Shape s2 = new Circle(7.5);
        System.out.println(s2.area());
        System.out.println(s2.perimeter());

    }
}
