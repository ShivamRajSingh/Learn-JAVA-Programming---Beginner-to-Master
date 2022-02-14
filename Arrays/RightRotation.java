public class RightRotation {
    public static void main(String[] args) {
        int arr[] = {3,9,7,8,12,6,15,5,4,10};

        int n = arr.length;

        int temp = arr[n-1];
        for(int i = n-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
