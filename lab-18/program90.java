import java.util.Scanner;

public class program90 {

    public static int linear_search(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
            return i;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int[] arr={10,16,12,21,35};
        System.out.println("Enter element to search in an array");
        int key= scanner.nextInt();
        int index= linear_search(arr, key);


        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Found at"+index);
        }
        scanner.close();

    }
}
    