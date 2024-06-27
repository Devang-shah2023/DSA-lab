import java.util.Scanner;

public class program33 {
    public static void swap(int a, int b){
        System.out.println("Before Swap: a="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
    
        System.out.println("After Swap: a="+a+" b="+b);
        
    }
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter first number");
        int num1= scanner.nextInt();

        System.out.println("Enter second number");
        int num2= scanner.nextInt();

        swap(num1, num2);
    }
    
}
