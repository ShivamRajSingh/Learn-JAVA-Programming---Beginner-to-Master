public class Sum{
    public static void main(String[] args) {
        int arr[] = {3,9,7,8,12,6,15,5,4,10};

        int sum = 0;
        for(int i =0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum : " + sum);
    }
}