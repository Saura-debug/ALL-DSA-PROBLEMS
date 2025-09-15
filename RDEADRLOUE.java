import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;

public class RDEADRLOUE {
    // bruteforce
    public static int  duplicate(int arr[]){ 
        ArrayList<Integer> myset = new ArrayList<>(); // set takes time complexity of O(Nlogn) 
        for(int i =0; i<arr.length; i++){
            if(!myset.contains(arr[i])){
                myset.add(arr[i]);

            }
        }
        int b =0;
        for(int a : myset){ // in worst case it will take O(n) if all the elements becomes the unique

            arr[b] = a;
            b++;


        }

          System.out.println(Arrays.toString(arr));
        return b; // the overall TC will be O(n) + O(nlogn) and the SC will be O(n)
      


    }
    public static int duplicate2(int arr[]){
        int i = 0;
        for(int j = 1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                arr[i+1] =arr[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return i+1;

    }
    public static void main(String args[]){
        int arr[] = {-3,-1,0,0,0,3,3};
        int ans = duplicate2(arr);
        System.out.println(ans);


    }
    
}
