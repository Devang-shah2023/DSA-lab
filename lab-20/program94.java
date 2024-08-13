

public class program94 {
    public static void selection_sort(int[] arr){
        for( int i=0; i<arr.length-1; i++){
            int index= i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[index]){
                    index=j;

                }
                int temp= arr[index];
                arr[index]= arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {12,21,15,17,31,24};

        selection_sort(arr);
        for(int temp: arr){
            System.out.println(temp+",");
        }
    }
    
}
