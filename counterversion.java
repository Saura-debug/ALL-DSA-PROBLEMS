import java.util.ArrayList;

public class counterversion {
    // this is the bruteforce solution which has been done by me with the TC of O(n^2) ,
    //  nnh SC O(1)
    public static int countverse(int arr[]){
      int count  = 0; 
      for(int i  = 0; i<arr.length; i++){
        for(int j = i+1; j<arr.length; j++){
            if(arr[i]>arr[j] && i<j){
                count++;
            }
        }
      }
      return count;
    }
    public static int sort(int arr[],int low,int mid,int high){
        int left = low;
        int right = mid+1;
        int cnt = 0;
        ArrayList<Integer> ss = new ArrayList<>();
        while (left<=mid && right<=high) {
            if(arr[left]<=arr[right]){
                ss.add(arr[left]);
                left++;

            }
            else{
                ss.add(arr[right]);
                cnt+=(mid-left +1);
                right++;
            }

            
        }
        while (left<=mid) {
            ss.add(arr[left]);
            left++;

            
        }
        while (right <=high) {
            ss.add(arr[right]);
            right++;

            
        }
          for(int i= low; i<=high; i++){
                arr[i] = ss.get(i-low);
            
            
        }
        return cnt;

    }
    public static int merge(int arr[],int low, int high){
        int cnt = 0;

       if(low >= high){
            return cnt;
        }
        int mid = low + (high - low)/2;
        cnt+= merge(arr,low,mid);
        cnt+=merge(arr, mid+1, high);
        cnt+=sort(arr, low, mid, high);
      return cnt;
    }


    public static void main(String args[]){
        int arr[] = {3,1,3,5,6,0};
       int a = merge(arr, 0, arr.length-1);
        System.out.println(a);


    }
}