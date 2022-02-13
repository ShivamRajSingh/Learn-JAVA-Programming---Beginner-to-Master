public class Pattern1 {
    public static void main(String[] args) {
        int count =0;
        for(int i =0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println("");
        }
    }
}
