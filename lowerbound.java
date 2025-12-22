public class lowerbound {
    // lower bound means any index which have value either greater or equal to the 
    // given x 
    // in uper bound we just have to find the index greater than the x,and that's it
    public static int low(int arr[],int low, int high,int x,int ans){
    
        if(low>high){
            if(ans>0){
                return ans;
            }
            else{
                return arr.length;
            }
        }
        int mid = low + (high - low)/2;
        if(arr[mid] >=x){
            ans = Math.max(ans, mid);
            high = mid-1;



        }
        else{
            low = mid+1;
        }
        return low(arr,low,high,x,ans);
        
        

    }
    public static void main(String args[]){
        int arr[] = {1,2,5,7,9};
        int low = 0;
        int high = arr.length-1;
        int x = 5;
        int ans = 0;
        int a = low(arr, low, high, x, ans);
        System.out.print(a);

    }
    
}
