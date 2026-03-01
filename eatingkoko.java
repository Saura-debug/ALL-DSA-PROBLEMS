import java.util.Arrays;
// so the Tc of this question is O(mxn) and SC is O(1) but we can get better time compexity by using the binar search

public class eatingkoko {
    public static int kokoh(int arr[],int h){
        int th = 0;
        for(int i = 0; i<arr.length; i++){
            double a =(double)arr[i]/h;
            
            
                th += (int) Math.ceil(a);
              

        }
      
        return th;

    }

       public static int eat(int arr[],int k ) {
               int maxVal = Arrays.stream(arr).max().getAsInt();
               int i = 1; 
               int mink = Integer.MAX_VALUE;
               while (i<=maxVal) {
                int h = kokoh(arr, i);
                if(h<=k){
                    mink = Math.min(mink,i);

                }
                i++;

                
               }
               return mink;

        
       }
       public static void main(String[] args) {
        int arr[] = {3,6,7,11};
        int h = 8;
        int minkoko = eatbin(arr,h);
        System.out.println(minkoko);
        
       }
       public static int eatbin (int arr[],int h ){
        int low = 0;
        int high = Arrays.stream(arr).max().getAsInt();
        while (low<=high) {
            int mid = low + (high -low)/2;
            int th = kokoh(arr, mid);
            if(th<=h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        return low;

       }
}
