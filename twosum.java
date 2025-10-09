import java.util.Arrays;
import java.util.HashMap;

public class twosum {

    public static int[] sum(int arr[],int t){
        // brute force written by me 
        int arr2[] = new int[2];
        for(int i = 0; i<arr.length; i++ ){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==t){
                    arr2[0] = i;
                    arr2[1] = j;
                    return arr2;

                }
            }
        } // this solution  has done his work and i am very happy  with TC O(n^2)
        return arr;
       

    }
     // the better solution can be done by the Hashmap with the time complexity O(n) for undorder find case takesO(n^2)
     public static  int[] sum0(int arr[],int t){
        HashMap<Integer,Integer> make = new HashMap<>();
        int arr2[] = new int[2];
        for(int i = 0; i<arr.length; i++){
            if(make.containsKey(t-arr[i])){
                arr2[0] = i;
                arr2[1] = make.get(t-arr[i]);
                return arr2;
            }
            make.put(arr[i], i);
            
        }
        return arr;
     }
     // for getting the answer in yes and NO then we can solve the question by tow pointer theorem here the TC will be O(1) + O(nlogn) for sorting 
public static void main(String[] args){
    int arr[] = {1,9,3,9,1,2};
    System.out.print(Arrays.toString(sum0(arr,3)));

}    
}
