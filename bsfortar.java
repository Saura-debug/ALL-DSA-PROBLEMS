public class bsfortar {
    public static int bs(int arr[],int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid = low + (high - low)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if (arr[mid]>target){
            high = mid - 1;
        }
        else{
            low = mid+1;
        }
       return  bs(arr, low, high, target);

    }
    public static void main(String args[]){
        int arr[] = {1,3,5,7,2,1,9};
        int a = bs(arr, 0, arr.length-1, 9);
        System.out.println(a);
 

    }}