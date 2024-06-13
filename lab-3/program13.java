import java.util.*;
public class program13 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
    System.out.println("Enter number");
    int n= scanner.nextInt();
    int[] a = new int[n];

    for(int i=0; i<n; i++){
        System.out.println("Enter element of an array: ");
        a[i]= scanner.nextInt();
    }
    System.out.println("Display array");

    for(int j=0; j<=n; j++){
        System.out.println(a[j]);
    }

        
    }
    

    
}
