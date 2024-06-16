import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= scanner.nextInt();
        int sum=0;

        int[]a= new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter elements:");
            a[i]=scanner.nextInt();
            sum= sum+ a[i];

            System.out.println("Average of n "+sum);

        }

    }
    
}
