import java.util.HashMap;

public class subbarraysum {
    public static int sum0(int arr[],int k){
        int max = 0; 
        for(int i =0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int sum =0;
                for(int l = i; l<=j; l++){
                    sum+=arr[l];
                    
                }
                if(sum == k){
                  
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;

    }
    // this is the important question which should be revised by time by time 
    public static int sum1(int arr[],int k){
        HashMap<Integer,Integer> store = new HashMap<>();
        int sum = 0; int maxlen = 0;
        for(int i =0; i<arr.length; i++){
           sum +=arr[i];
           if(sum == k ){
            maxlen = i+1;
           } 
           if(!store.containsKey(sum - k)){
            store.put(sum,i);

           } 
           if(store.containsKey(sum-k)){
            maxlen = Math.max(maxlen,i-store.get(sum-k));
           }   


            }
            return maxlen;

        }
    
    public static void main(String[] args){
        int arr[] = {3,1,1,1,1,2,1};
        int ans = sum1(arr, 4);
        System.out.print(ans);

    }
}
    

