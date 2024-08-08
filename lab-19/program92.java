
public class program92 {

    public static void bubble_sort(int [] arr){
        int last= arr.length;
        int last_index= last;

        for(int i=0; i<=last_index; i++){
            int exchange=0;

            for(int j=0; j<last-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    exchange++;
                }
            }
            if(exchange==0){
                return;
            }
            else{
                last=last-1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={12,21,15,17,24};

        bubble_sort(arr);
        for(int temp:arr){
            System.out.println(temp+ ",");
        }
    }
    
}
