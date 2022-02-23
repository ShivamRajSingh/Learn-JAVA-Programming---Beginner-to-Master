interface Test1{
    void method1();
    void method2();
}
class Test2 implements Test1{
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        System.out.println("Method 2");
    }
    public void method3(){
        System.out.println("Method 3");
    }
}
public class JavaInterface {
    public static void main(String[] args) {
        Test1 t = new Test2();
        t.method1();
        t.method2();
    }
}
