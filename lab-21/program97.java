public class program97{
    public static void quick_sort(int[]arr, int lb, int ub){
        if(lb<ub){
            int pivot= partition(arr, lb, ub);

            quick_sort(arr, lb, pivot-1);
            quick_sort(arr, pivot+1, ub);
        }
    }

    public static int partition(int[] arr, int lb, int ub){

        int pivot= arr[ub];
        int i=(lb-1);

        for(int j=lb; j<ub; j++){
            if(arr[j]<pivot){
                i++;

                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        int temp= arr[i+1];
        arr[i+1]= arr[ub];
        arr[ub]= temp;

        return i+1;

    } 
    public static void main(String[] args){
        int[] arr= {5,18,6,2,1,0};
        quick_sort(arr, 0, arr.length-1);

        for(int temp:arr){
            System.out.println(temp+ ",");
        }

    } 
}