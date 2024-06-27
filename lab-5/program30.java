import java.util.Scanner;

public class program30 {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);

            int a[][]= new int[2][2];
            int b[][]= new int[2][2];
            int c[][]= new int[2][2];

            System.out.println("Enter data into first matrix");

            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    a[i][j]= scanner.nextInt();
                }
            }
            
            System.out.println("Enter data into second matrix");

            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    b[i][j]= scanner.nextInt();
                }
            }

            System.out.println("First matrix:");

            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    System.out.print (a[i][j]+ " ");

                }
                System.out.println("\n");
            }

            System.out.println("Second matrix:");

            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    System.out.print(b[i][j]+ " ");

                }
                System.out.println("\n");
            }

            System.out.println("Result Matrix Sum \n");

            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    c[i][j]= a[i][j]+ b[i][j];

                    System.out.print(c[i][j]+" ");

                }
                System.out.println("\n");
                
            }


            

        }
    
    
    
}
