public class rowwithmax {
    public static int maxones1(int arr[][],int i){
         int low = i; 
         int high = arr[0].length -1; 
         while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid][high] == 1 && arr[mid-1][high] == 0 ){
                int sum = high-mid;
                 return sum;

            }
            else if(arr[mid][high] == 1 && arr[mid-1][high] ==1){
                high = mid-1;

            }
            else {
                low = mid+1;
            }
            
         }
         return 0; 
        

    }
public static int maxones(int arr[][]){
    // this is bruteforce solution and  would take O(N^2) TC 
     int coll = arr.length;
     int rowl = arr[0].length;
     int maxones = Integer.MIN_VALUE; 
     int ans = Integer.MIN_VALUE;
       for(int i = 0; i<rowl; i++){
        int sum = 0; 
        for(int j = 0; j<coll; j++){
            if(arr[i][j] == 1){
                sum++;
            }
          
           

        }
        if(maxones<sum && sum>0){
            maxones = sum;
            ans = i; 
        }
        
       }
       if(ans == Integer.MIN_VALUE){
        return -1; 
       }
       return ans; 


}
     public static void main(String[] args) {
        int arr[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int ans = Integer.MIN_VALUE;
        int sum = 0;  
        for(int i = 0; i<arr.length; i++){
            int as = maxones1(arr, i);
            if(as>sum){
                sum = as;
                ans = i;
            }

        }
        if(ans ==Integer.MIN_VALUE){
            System.out.println("-1");
            return;
        }
        System.out.println(ans);

        
     }
}