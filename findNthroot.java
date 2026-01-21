public class findNthroot {
    public static int nthroot(int m,int n){
        int low = 0; 
        int high = m; 
        while (low<=high) {
            int mid = low + high-low/2;
            int pro = 1;
            
            for(int i = 1; i<=n; i++){
                pro*=mid;
            }
            if(pro == m){
                return mid;
            }
            else if(pro>m){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        return -1;
    }

    // this is the bruteforce solution for findingNthroot 
    // it has taken O(n^m) TC and O(1) SC
    public static void main(String[] args) {
        int n = 5; 
        int m = 32; 
        // int i = 1; 
        // while (i<m) {
        //     int sum = 1;
        //     for(int j = 1; j<=n; j++){
        //     sum *=i;
        // System.out.print(sum);
        // }
        // if(sum == m){
        //     System.out.println("foundone +" +  i);
        //     return;
        // }
        // i++;
            
        // }
        // System.out.println("not found");
        System.out.println(nthroot(m, n));

        
       
  
        
    }
}
