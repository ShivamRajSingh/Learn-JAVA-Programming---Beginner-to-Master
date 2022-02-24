abstract class My{
    abstract public void show();
}

class Outer{
    public void display(){
        // Anonymous class and anonymous object
        new My() {
            @Override
            public void show(){
                System.out.println("Hello");
            }
        }.show();
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer io = new Outer();
        io.display();
    }
}
