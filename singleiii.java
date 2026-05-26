import java.util.Arrays;
import java.util.HashMap;

public class singleiii {
    // first i would solve it by using the HashMap.
    // this would take the TC of O(N) + O(1)(for unsorted hashmap) and SC would be O(N  n  n )
    public static void main(String[] args) {
        int a [] = {0,0};
        int arr [] = {5,2,3,6,9,5,2,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int m = 0;
       for(Integer key : map.keySet()){
        if(map.get(key) == 1){
            a[m] = key;
            m++;
            

        }
       }
       System.out.println(Arrays.toString(a));
       // this approch would be done by bit-manipulation
       // this would take O(n) + O(n) TC and SC would be O(1)
       int t = 0; 

       for(int i = 0; i<arr.length;i++){
        t = t^arr[i];
       }
       t = (t & t-1) ^ t;
       int b1 = 0; 
       int b2 = 0; 
       for(int k = 0; k<arr.length; k++){
        if((arr[k] & t) == 0){
            b1 = b1^arr[k];

        }else{
            b2 = b2^arr[k];
        }
       }
       System.out.print(b1);
       System.out.print(b2);
         
    }
    
}
