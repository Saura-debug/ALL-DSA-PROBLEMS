public class missing {
    // this is the brute force as per the striver 
    public static int miss(int nums[]){
        for(int i =0; i<=nums.length; i++){
            int flag = 0; 
            for(int j =0; j<nums.length; j++){
                if(nums[j]== i){
                    flag=1;
                    break;
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return -1;
        
    }
    // this is the better soloution by the striver
    public static int miss2(int nums[]){
        int nums2[] = new int[nums.length+1];
         for(int i =0; i<nums.length; i++){
           int j = nums[i];
           nums2[j]++;
         }
         for(int i =0; i<nums2.length; i++){
            if(nums2[i]==0){
                return i;
            }
         }
         return -1;
    }
    // there  are two optimal solution for this question , first can be solved by sum and other can be solved by the XOR which i did'nt get 
    // Sum with SC(1) and TC O(n)
    public static int miss3(int nums[]){
        int n = nums.length;
        int ans = n*(n+1)/2;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
        }
        return ans-sum;
    }
    //  XOR has also the same complexity but it doesnt allow the number to be greater than 10^5 or minize it while in summ method when value gets above the 10^5 it get overflowed  
    public static void main(String args[]){
        int arr[] = {0,1,4,7,2,5,3};
        int ans = miss3(arr);
        System.out.println(ans);

    }
    
}
