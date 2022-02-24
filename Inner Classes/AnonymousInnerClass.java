abstract class My{
    abstract public void show();
}

class Outer{
    public void display(){
        My my = new My() {
            @Override
            public void show(){
                System.out.println("Hello");
            }
        };
        my.show();
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer io = new Outer();
        io.display();
    }
}
