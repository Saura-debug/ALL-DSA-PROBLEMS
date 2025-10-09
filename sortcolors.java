import java.util.Arrays;
// this is the optimal approch for solving this question 
public class sortcolors {
    public static void col(int arr[]){
        int n = arr.length;
        int low = 0; 
        int mid = 0; 
        int high = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid] == 2){
                int temp = arr[mid];
                arr[high] = temp;
                arr[mid] = temp;
                high--;
            }
        }
        System.out.print(Arrays.toString(arr));

    }
    public static void main(String args[]){
        int arr[] = {1,0,0,0,1,0,2,1,0,2,1,0,2,1,0,};
        col(arr);

    }
    
}
