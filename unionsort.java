import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class unionsort {

    public static void sort(int arr[], int arr2[]){
   TreeSet<Integer> aa = new TreeSet<>();
    // brute force by the Striver sheet which should be presented in the front the interviewver , after  
    // after analysizing the c++ and java set, it has shown me that for storing element in order i have to  use the Treeset which i have learned yet so i will be dropping this quesion for a while;
    
    
     for(int i =0; i<arr.length; i++){
        aa.add(arr[i]);
        // TC will be O(nlogn) due tree set for inserting the element in the order 
     }
     for(int i =0; i<arr2.length; i++){
        aa.add(arr2[i]);
        // TC will be O(nlogn) due tree set for inserting the element in the order 
     }
     int arr3[] = new int[aa.size()];
     int l =0;
     for (int a : aa){
        arr3[l] = a;
        l++;
        // its TC can be O(n1+n2) if the both arrays have distinct elements 
     }
     System.out.print(Arrays.toString(arr3));
    
        
        
    }
    // the optimal solution for this will be 
    public static void sort2(int arr[], int arr2[]){
        ArrayList <Integer> b = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i<arr.length && j<arr2.length) {
            if(arr[i]<=arr2[j]) {
               if(b.isEmpty() || b.size()-1 != arr[i]){
                b.add(arr[i]);
               }
               i++;
               
            }  
         
            if(arr2[j]<arr[i]){
                 if(b.isEmpty() || b.size()-1 != arr2[j]){
                b.add(arr2[j]);
               }
              
            j++;
        }
    }
            
            
        
        while (i<arr.length){
            if(b.size()-1 !=(arr[i])){
                b.add(arr[i]);
            }
            i++;
        }
         while (j<arr2.length){
            if (b.size()-1!=(arr2[i])){
                b.add(arr2[i]);
            }
            j++;
        }
        System.out.println(b);



    }
    public static void main(String args[]){
        int arr[] = {3,4,7,8,9};
        int arr2[] = {7,8,9};
        sort2(arr, arr2);

        
    }
    
}
