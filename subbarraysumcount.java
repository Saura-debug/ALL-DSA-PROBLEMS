import java.util.HashMap;

public class subbarraysumcount {
// this question has 3 approach. first one will be a brute force and second will be the better one and finally optimal one will come\
// so i will first explain the brute force which will have TC=O(n^3) and SC=1
public static int sum(int arr[], int k ){
    int count = 0;
    for(int i =0; i<arr.length; i++){
        for(int j = i; j<arr.length; j++){
            int sum = 0; 
            for(int l = i; l<=j; l++){
                sum+=arr[l];


            }
            if(sum == k){
                count++;
            }
        }
    }
    return count;
}
public static int sum0(int arr[], int k ){
    // In this solution we just have removed a 3rd nested loop which decreased the TC to O(n^2)
    int count = 0;
    for(int i =0; i<arr.length; i++){
        int sum = 0; 
        for(int j = i; j<arr.length; j++){
            sum+=arr[j];
            
            
            if(sum == k){
                count++;
            }
        }
    }
    return count;
}
public static int sum1(int arr[],int k ){
    // optimal one using the Hashmap
    HashMap<Integer,Integer> join = new HashMap<>();
    int count = 0; 
    join.put(0, 1); 
    int jod = 0;
    for(int i =0; i<arr.length; i++){
      jod+=arr[i];
      if(join.containsKey(jod-k)){
        count+=join.get(jod-k);
        

      }
      join.put(jod,join.getOrDefault(jod, 1)+1);
        
    } 
    return count;
}
public static void main(String args[]){
    int arr[] = {1,-1,0};
    int ans = sum1(arr,0);
    System.out.println(ans);

    
}    
}
