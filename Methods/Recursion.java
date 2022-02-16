public class Recursion {
    
    static void fun1 (int n){
        if(n > 0){
            System.out.print(n + " ");
            fun1(n-1);
        }
        System.out.println("");
    }

    static void fun2 (int n){
        if(n > 0){
            fun2(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        fun1(5);
        fun2(5);
    }
}
