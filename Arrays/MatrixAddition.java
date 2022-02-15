import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[][] = new int [3][3];
        int B[][] = new int [3][3];
        int input;

        System.out.println("Enter the elements in Matrix A : ");
        for(int i = 0; i < A.length; i++){
            for(int j =0; j < A[0].length; j++){
                input = scan.nextInt();
                A[i][j] = input;
            }
        }

        System.out.println("Enter the elements in Matrix B : ");
        for(int i = 0; i < B.length; i++){
            for(int j =0; j < B[0].length; j++){
                input = scan.nextInt();
                B[i][j] = input;
            }
        }

        int C[][] = new int[3][3];

        System.out.println("Matrix A + Matrix B : ");
        for(int i = 0; i < C.length; i++){
            for(int j =0; j < C[0].length; j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.format("%02d ", C[i][j]);
            }
            System.out.println("");
        }

        scan.close();
    }
}
