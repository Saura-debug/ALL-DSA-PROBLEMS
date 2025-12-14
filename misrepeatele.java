import java.util.ArrayList;
import java.util.Arrays;

public class misrepeatele {
    public static void mis(int arr[]){
        int n = arr.length;
        int ar[] = {-1,-1};
        for(int i = 1 ; i<=n; i++){
            int count  = 0; 
            for(int j = 0; j<n; j++ ){
                if(i == arr[j]){
                    count++;
                } } 
            if(count == 2){
                ar[0] = i; 
            }
            else if(count == 0){
                ar[1] = i;
            }
            if( ar[0] != -1 && ar[1] != -1){
                break;
            }
        }
        System.out.println(Arrays.toString(ar));

    }
    public static void mis1(int arr []){
        // TC  O(n) SC O(n)
        int n = arr.length;
         int ar[] = {-1,-1};
        int ar1[] = new int[n+1];
         for(int i = 0; i<arr.length; i++){
            ar1[i]++;

         }
         for(int i = 0; i<ar1.length; i++){
            if(ar1[i] == 2){
                ar[0] = i;

            }
            else if(ar1[i] == 0){
                ar[1] = i;
            }
         }
         


    }
    public static void main(String args[]){
        int arr[] = {1,2,1,3,5};
        mis(arr);


    }
}
