import java.util.ArrayList;
import java.util.*;
public class mergesorting {
    
    // In this sorting technic we just place the pivot at  its original place and put 
    //  all the larger elements from the pivot to left and otherwise we put element 
    // at the left 

    public static void sort(int arr[],int low, int high){
        if(low >= high){
            return;
        }
        int mid = low + (high-low)/2;
        sort(arr,low,mid);

        sort(arr,mid+1,high);
        merge(arr,low,mid,high);

    
    }


    public static void merge(int arr[],int low, int mid, int high){
        int left = low; 
        int right = mid+1;
        ArrayList<Integer> aa = new ArrayList<>();

        while(left<=mid && right<= high) {
            if(arr[left]<=arr[right]){
                aa.add(arr[left]);
                left++;
            }
            else {
                aa.add(arr[right]);
                right++;
            }
        }

            while (left<=mid) {
                aa.add(arr[left]);
                left++;
                
            }
            while (right<=high) {
                aa.add(arr[right]);
                right++;
                
            }
            for(int i= low; i<=high; i++){
                arr[i] = aa.get(i-low);
            
            
        }
    }
    public static void main(String args[]){
        int arr[] = {4,8,3,9,1,9};
        int low = 0;
        int high = arr.length -1;
        sort(arr,low,high);

        System.out.print(Arrays.toString(arr));

    }
}