public class program96 {
    public static void main(String[] args) {
        int[] arr = {12,21,17,15,7,24};
        merge_sort(arr,0,arr.length-1);
        for(int temp:arr){
            System.out.println(temp);
        }
    }
    public static void merge_sort(int[] arr,int low, int high){
        int mid = (low+high)/2;
        if(low<high){
            merge_sort(arr ,low ,mid);
            merge_sort(arr , mid+1 , high);
        }
        merge(arr ,low ,mid ,high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int[] b = new int[arr.length];
        int i = low;
        int h = low;
        int j = mid+1;
        while(h<=mid && j<=high){
            if(arr[h]<= arr[j]){
                b[i++] = arr[h++];
            }
            else{
                b[i++] = arr[j++];
            }
        }
        if(h>mid){
            for(int k=j; k<=high; k++){
                b[i++] = arr[k];
            }
        }
        else{
            for(int k=h; k<=mid; k++){
                b[i++] = arr[k];
            }
        }
        for(int k=low; k<=high; k++){
            arr[k] = b[k];
        }
    }
}
