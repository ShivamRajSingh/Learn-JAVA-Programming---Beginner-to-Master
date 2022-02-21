class Super{
    public void display(){
        System.out.println("Super class");
    }
}
class Sub extends Super{
    @Override
    public void display() {
        System.out.println("Sub Class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Sub sub = new Sub();
        sub.display();

        Super su = new Sub();
        su.display();
    }
}
