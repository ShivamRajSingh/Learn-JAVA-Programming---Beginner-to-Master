@FunctionalInterface
interface MyLambda{
    public int product(int x, int y);
}

public class LambdaExpressionsMain {
    public static void main(String[] args) {
        MyLambda ml = (a,b) -> a*b;
        System.out.println(ml.product(25, 65));
    }
}
