import java.util.Scanner;

public class program31 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int rowsA=3, colsA=2;
        int rowsB=2, colsB=3;

        int[][]A= new int[rowsA][colsA];
        int[][]B= new int[rowsB][colsB];
        int[][]R= new int[rowsA][colsB];

        System.out.println("Enter element of first matrix(3*2):");

        for(int i=0; i<rowsA; i++){
            for(int j=0; j<colsA; j++){
                A[i][j]= scanner.nextInt();
            }
        }

        System.out.println("Enter element of second matrix(2*3):");

        for(int i=0; i<rowsB; i++){
            for(int j=0; j<colsB; j++){
                B[i][j]= scanner.nextInt();
            }
        }

        for(int i=0; i<rowsA; i++){
            for(int j=0; j<colsB; j++){
                for(int k=0; k<colsA; k++){
                    R[i][j]+=A[i][k]*B[k][j];

                }
            }
        }
        System.out.println("Resultant(3*3) matrix after multiplication:");

        for(int i=0; i<rowsA; i++){
            for(int j=0; j<colsB; j++){
                System.out.print(R[i][j]+" ");
            }System.out.println("\n");
        }
    }
}
