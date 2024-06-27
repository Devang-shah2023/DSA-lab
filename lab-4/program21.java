import java.util.Scanner;

public class program21 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter size of an array");
        int size= scanner.nextInt();

        int[] array= new int[size+1];

        for(int i=0; i<=size; i++){
            array[i]= scanner.nextInt();
        }
        int num= scanner.nextInt();
        int loc= scanner.nextInt();
    }
}
