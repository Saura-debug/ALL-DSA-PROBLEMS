import java.util.ArrayList;

public class paire {
    public static void merge(int arr[],int low,int mid ,int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> ss = new ArrayList<>();
        while(left<=mid && right <= high){
            if(arr[left]>arr[right]){
                ss.add(arr[right]);
                right++;
            }
            else{
                ss.add(arr[left]);
                left++;
            }
            
        }
        while (left<=mid) {
            ss.add(arr[left]);
            left++;
            
        }
        while (right<=high) {
            ss.add(arr[right]);
            right++;
            
        }
        for (int i = low; i <= high; i++) {
    arr[i] = ss.get(i - low);
}

    }
    public static int counterpairs(int arr[], int low,int mid,int high){
        int right = mid + 1;
        int cnt = 0;
        for(int i = low; i<=mid; i++){
            while (right<=high && arr[i]>2*arr[right]) {
                right++;

                
            }
            cnt+= (right - (mid+1));
        }
        return cnt;
    }
    public static int sort(int arr[],int low, int high){
       int  cnt = 0;
        if(low>=high){
            return cnt;
        }
        int mid = low + (high - low)/2;
       cnt+= sort(arr,low,mid);
       cnt+= sort(arr,mid+1,high);
       cnt+= counterpairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return cnt;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,1,3,7};
        int a = sort(arr, 0,arr.length-1);
        System.out.print(a);

    }
    
}
