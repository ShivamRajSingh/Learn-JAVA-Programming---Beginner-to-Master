@FunctionalInterface
interface MyLambda1{
    public int product(int x, int y);
}

@FunctionalInterface
interface MyLambda2{
    public void display(String str);
}

public class LambdaExpressionsMain {
    public static void displayReverse(String str){
        StringBuffer stb = new StringBuffer(str);
        stb.reverse();
        System.out.println(stb);
    }
    public static void main(String[] args) {
        MyLambda1 m = (a,b) -> a*b;
        System.out.println(m.product(25, 65));

        // Method Reference

        MyLambda2 ml1 = System.out::println;

        MyLambda2 ml2 = LambdaExpressionsMain :: displayReverse; // Method reference using class name for static methods.

        // LambdaExpressionsMain ld = new LambdaExpressionsMain();

        // MyLambda2 ml3 = ld :: displayReverse;
        
        ml3.display("Hello");
    }
}
