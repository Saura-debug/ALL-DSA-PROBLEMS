import java.util.ArrayList;
import java.util.HashMap;

public class majorelement {
    public static int major(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int count = 1;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }

            }
            if(count>arr.length/2){
                return arr[i];
            }
        }
        return 0;
    }
    public static int major2(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>(); // it will have the complexity of the O(n) + O(1) = O(1) but if the hashmap is found to be orderd then the complexity will be O(Nlogn)
        // it is the better approch by th striver
        for(int i =0; i<arr.length; i++){
           
                map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
           
        };
        for(int a : map.keySet()){
            if(map.get(a)>arr.length/2){
                return a;
            }
        }
        return 0;

    }
    public static void main(String args[]){
        int arr[] = {1,2,5,1,4,6,3,2,1,4,7,8,9,5,4,1,1,1,1,1,1,1,1,1,1,1,1,};
        System.out.println(arr.length);
        System.out.println(major2(arr));
    }
    
}
