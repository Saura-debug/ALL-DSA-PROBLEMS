import java.util.*;
public class insertionsort {
    public static void main(String args[]){
        //  in insertion sort we just go to every element and take it to the its right position
        //  that's all things you need to know about that 
        //   it time complexity will be  O(n) if the array will sorted otherwise the complexity will be O(n^2); 
        int arr[]  = {5,7,9,1,2};
        for(int i = 0; i<arr.length; i++){
            int j = i; 
            while( j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

   
    
}
