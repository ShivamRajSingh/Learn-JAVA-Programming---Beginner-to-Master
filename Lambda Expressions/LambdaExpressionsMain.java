@FunctionalInterface
interface MyLambda{
    public void show();
}

public class LambdaExpressionsMain {
    public static void main(String[] args) {
        MyLambda ml = () -> { 
            System.out.println("Hello World");
        };

        ml.show();
    }
}
