import java.util.ArrayList;
import java.util.*;

public class primefact {
    public static boolean prime(int j){
        int count = 0;
        for(int i = 1; i*i<=j; i++ ){
            if(j%i == 0){
                count++;
                if(j/i != i){
                    count++;
                }
            }
        }
        if(count>2){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // this is the naive solution i can think of 
        // this would take O(n*m*underrootm) and SC would be O(1) cause that would be variable
        List<List<Integer>> list = new ArrayList<>();
        int arr[] = {12,44,5,77,13};
        //  for(int i = 0; i<arr.length; i++){
        //    
        //     for(int j = 2; j<= arr[i]; j++){
        //         if(prime(j)){
        //             list2.add(j);

        //         }
        //     }
        //     list.add(list2);
        //  }
         
         for(int k = 0; k<arr.length; k++){
            System.out.print(k);
             List<Integer> list2 = new ArrayList<>();
            for(int i = 2; i<=arr[k]; i++){
                if(arr[k]%i==0){
                    list2.add(i);
                   
                     while (arr[k] % i == 0) {
                    arr[k] = arr[k]/i;
                    
                }
                
                }
                
               

            }
            list.add(list2);
         }
         System.out.print(list);
    }
    
}
