import java.util.ArrayList;
import java.util.Arrays;

public class rotatearray {
// rotate the array by one place , this question is quite simple  it has tc = o(n) and extra space is O(1) but while running it have O(n) space comlexity
   // brute force
    public static void rotate(int arr[]){
         int temp = arr[0];
         for(int i =1; i<arr.length; i++){
            arr[i-1] = arr[i];
         }
         arr[arr.length-1] = temp;
         System.out.print(Arrays.toString(arr));

       

    }
    // brute force for the rotate in k steps , In this question you just need to understand that if the array rotates number of steps equal to the length of arrayy then it will become the same array as before. So' always take remainder before rotating an array cause it will make problem easy 

    public static void rotate2(int arr[], int k){
        k = k%arr.length;
         if(k== 0){
            System.out.println(Arrays.toString(arr));
             

         }
         else{
        ArrayList<Integer> y = new ArrayList<>();
        for(int i =0; i<k; i++){
            y.add(arr[i]);
        }
        System.out.println(y);
        
        for(int i = k; i<arr.length; i++){
          arr[i-k] = arr[i];
          

        }
        System.out.println(Arrays.toString(arr));

        
        for(int i=k;i<arr.length;i++){
            arr[i] = y.get(i-k);
           
        }
        System.out.print(Arrays.toString(arr));
    }  } // brute force
 
    public static void main(String args[]){
        int arr[] = {2,4,5,9,1,0};
        rotate2(arr,10);
    }
    
}
