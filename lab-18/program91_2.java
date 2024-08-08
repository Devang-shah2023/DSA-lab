import java.util.Scanner;

public class program91_2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int[] arr={12,21,45,6,15,17};
        System.out.println("Enter element to search:");
        int key= scanner.nextInt();
        int index= binary_search(arr, 0, arr.length-1, key);

        if(index==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at "+index);
        }
        scanner.close();

        
    }
    public static int binary_search(int[] arr, int right, int left, int key){

            int mid=(left+right)/2;

            if(key==arr[mid]){
                return arr[mid];
            }
            else if(key<arr[mid]){
                right= mid-1;
                return binary_search(arr, right, left, key);
            }
            else if(key>arr[mid]){
                left= mid+1;
                return binary_search(arr, right, left, key);
            }
            else{
                return -1;
            }
        
        
        
    }
    


    

    
}
