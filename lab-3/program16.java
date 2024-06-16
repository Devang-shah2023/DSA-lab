import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter size of an array");
        int n= scanner.nextInt();

        int[]a= new int[n];
        int[]b= new int[n];

        for(int i=0; i<n-i; i++){
            System.out.println("Enter Element:");
            a[i]= scanner.nextInt();
        }
        int smindex=0;
        int lgindex=0;
        int sm= a[smindex];
        int lg= a[lgindex];

        for(int i=0; i<n; i++){
            if(sm>lg){
                int temp= sm;
                sm=lg;
                lg=temp;
            }

        }
        System.out.println("small number:"+sm);
        System.out.println("large number:"+lg);

        for(int i=0; i<n; i++){
            if(b[i]==sm){
                smindex=i;

            }
            else if(b[i]==lg){
                lgindex=i;

            }
            System.out.println("Small index="+smindex);
            System.out.println("Large index="+lgindex);
        }
    
}
}