public class LeftRotation {
    public static void main(String[] args) {
        int arr[] = {3,9,7,8,12,6,15,5,4,10};

        int temp = arr[0];
        for(int i =0; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
