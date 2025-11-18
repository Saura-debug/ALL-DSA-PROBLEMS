public class oneandzeroes {
    public static int ones(String arr[],int m , int n){
        // this problem will be done by napsack of (Dynamic programming)
        int l = 0;
        for(int i =0; i<arr.length; i++){
            int one = 0;
            int   zero = 0;
            for(int j =0; j<arr[i].length(); j++){
                System.out.println(arr[i].charAt(j));
                if(arr[i].charAt(j)== '0'){
                    zero++;
                }else {
                    one++;
                }
            }
            if(one <= n && zero <= m){
                l = Math.max(arr[i].length(),l);
            }
                }
                return l;
    }
    public static void main(String args[]){
        String arr[] = {"00","11","11100","01001"};
        int m = 1;
        int n = 2;
        int ans = ones(arr,m,n);
        System.out.print(ans);
       

    }
    
}
