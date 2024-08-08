
public class program93 {
    public static void insertion_sort(int[] arr){
        if(arr.length==1)
        return;

        int i=1;
        while (i<arr.length) {
            int key= arr[i];
            int j=i-1;

            while (j>=0 && arr[j]>key) {
                arr[j+1]= arr[j];
                j--;
                
            }
            arr[j+1]=key;
            i++;
            
        }
    }
    public static void main(String[] args) {
        int[] arr= {12,21,24,26,14};

        insertion_sort(arr);
        for(int temp:arr){
            System.out.println(temp+ ",");
        }
    }
   
    
}
