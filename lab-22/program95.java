import java.util.Arrays;

public class program95{

    public static void CountingSort(int[] array, int exp){
        
        int n= array.length;
        int[] output= new int[n];
        int[] count= new int[10];

        for(int i=0; i<n; i++){
            int digit=(array[i]/exp)%10;
            count[digit]++;
        }

        for(int i=1; i<10; i++){
            count[i]+=count[i-1];
        }

        for(int i=n-1; i>=0; i--){
            int digit=(array[i]/exp)%10;
            output[count[digit]-1]= array[i];
            count[digit]--;
        }
        for(int i=0; i<n; i++){
            array[i]= output[i];
        }
    }

    public static void radixSort(int[] array){
        int max= array[0];

        for(int num:array){
            if(num>max){
                max= num;
            }
        }
        for(int exp=1; max/exp>0; exp*=10){
             CountingSort(array, exp);
        }
    }
    public static void main(String[] args) {
        int[] array={12,21,05,15,07,24};

        radixSort(array);

    System.out.println("Sorted Array: "+Arrays.toString(array));
    }
}