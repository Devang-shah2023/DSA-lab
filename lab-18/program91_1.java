import java.util.Scanner;

public class program91_1 {

    public static int binary_search(int[] arr, int left, int right, int key){
        while(left<=right){
            int mid=(left+right)/2;

            if (arr[mid]==key) {
                return mid;
                
            }
            else if(key<arr[mid]){
                return mid-1;
            }
            else{
                left= mid+1;
            }
            
        }
        return -1;

    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int[] arr={11,12,21,17,15,7};
        System.out.println("Enter an element to search");
        int key=scanner.nextInt();
        int index= binary_search(arr, 0, arr.length-1, key);


        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at"+index);
        }
        scanner.close();
    }
    
}
