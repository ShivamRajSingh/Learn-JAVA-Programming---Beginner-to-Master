public class MaximumOfTwoElements {
    static int maximumOfTwoElements(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static void main(String[] args) {
        int num1 =10, num2 = 5, result;

        result = maximumOfTwoElements(num1, num2);

        System.out.println(result);

    }
}
