public class VariableArguments {
    static void show (int ...args){
        for(int x : args){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(new int[]{1,2,3,4,5,6,7});
    }
}
