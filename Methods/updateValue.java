public class UpdateValue {
    static void updateValue(int arr[], int index, int newValue){
        arr[index] = newValue;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,7,4,5,6};
        
        updateValue(arr,1,3);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }    
}
