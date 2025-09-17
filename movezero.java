import java.util.ArrayList;
import java.util.Arrays;
// this question has two edge cases where the 1st is there no zero element in the array or have only one element in all array
// class Solution {
//     public void moveZeroes(int[] nums) {
//         if(nums.length>1){
//         int i = -1;
//         int j = 0;
//         for(int k =0; k<nums.length; k++){
//             if(nums[k]==0){
//                 i = k;
//                 j= k+1;
//                 break;
//             }
//         }
//         if(i>=0){
//         for(int l = j; l<nums.length;l++){
//             if(nums[l]!=0){
//                 int temp = nums[l];
//                 nums[l] = nums[i];
//                 nums[i] = temp;
//                 i++;
//             }
//         }
//         }
//         }
        
//     }
// }

public class movezero {
    public static void main(String args[]){
        // the bruteforce approch learned by striver with tc = O(n)+O(x)+O(n-x) = O(2n) and space complexity will be O(n)
            
        int arr[] = {5,7,0,2,0,4,5,8,0,9,0};
        // ArrayList<Integer> y = new ArrayList<>();
        // for(int i =0; i<arr.length; i++){
        //     if(arr[i]!=0){
        //         y.add(arr[i]);
        //     }
        // }
        // for(int i =0; i<y.size();i++){
        //     arr[i] = y.get(i);
        // }

        // for(int i =y.size();i<arr.length; i++){
        //     arr[i] = 0;
        // }
        // System.out.println(Arrays.toString(arr));
        int j = -1;
        int k = 0;
        // this is the optimal solution for the putting the zero at the last, which have the TC = O(n) + O(n-k) and SC = O(1)
        for(int i =0; i<arr.length; i++ ){
            if(arr[i] == 0){
                j = i;
                k = i+1;
                break;
            }

        }

        for(int p = k; p<arr.length; p++){
            if(arr[p]!= 0){
                int temp = arr[p];
                arr[p] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
      System.out.println(Arrays.toString(arr));
    }
    
}
