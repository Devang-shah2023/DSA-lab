import java.util.*;
public class program14 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number 1");
        int m= scanner.nextInt();
        System.out.println("Eneter a number 2");
        int n=scanner.nextInt();

        if (n<m) {
            int temp= n;
            m=n;
            n=temp;  
        }
        for(int i=m; i<=n; i++){
            n=n+i;
        }
        System.out.println("Sum of m+n"+n);
    }
    
}
