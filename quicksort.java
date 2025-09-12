import java.util.Arrays;
import java.util.ArrayList;


public class quicksort {

    public static int parti(int arr[],int low,int high){

        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while (arr[i]<=pivot && i<=high-1 ) {
                i++;
                
            }
            while (arr[j]>pivot && j>=low+1) {
                j--;

                
            }
            if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]  = temp;
            }
           


        }
         
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;





    }

    public static void quick(int arr[], int low, int high){
       if(low<high){
        int part = parti(arr,low,high);
        quick(arr, low, part-1);
        quick(arr,part+1, high);
       }
    }
    public static void main(String args[]){
        int arr[] = {5,7,3,1};
        int high = arr.length-1;
        int low = 0;
        System.out.println(Arrays.toString(arr));
        quick(arr, low, high);
        System.out.print(Arrays.toString(arr));
        
    }
    
}
