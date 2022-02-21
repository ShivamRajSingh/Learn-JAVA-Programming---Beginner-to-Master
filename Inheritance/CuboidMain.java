class Rectangle{
    public int length, breadth;
    public Rectangle(){
        length = breadth = 1;
    }

    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
}
class Cuboid extends Rectangle{
    private int height;
    
    public Cuboid(){
        height = 1;
    }
    public Cuboid(int h){
        height = h;
    }
    public Cuboid (int l, int b, int h){
        super(l,b);
        height = h;
    }
    public int volume(){
        return length*breadth*height;
    }
}
public class CuboidMain {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.volume());
    }
}
