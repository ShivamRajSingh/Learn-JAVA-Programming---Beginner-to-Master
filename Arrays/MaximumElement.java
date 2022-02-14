public class MaximumElement {
    public static void main(String[] args) {
        int arr[] = {3,9,7,8,12,6,15,5,4,10};

        int maxElement = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        System.out.println("Maximum Element : " + maxElement);
    }
}
