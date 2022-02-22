abstract class Super{
    public Super(){
        System.out.println("Super Constructor");
    }
    public void method1(){
        System.out.println("Method 1");
    }
    abstract void method2();
}
class Sub extends Super{
    public void method2(){
        System.out.println("Method 2");
    }
}
public class AbstractMain {
    public static void main(String[] args) {
        Super s = new Sub();
        s.method1();
        s.method2();
    }
}
