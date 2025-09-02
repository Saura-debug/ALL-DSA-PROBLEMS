import java.util.Arrays;

public class selectionsort {
    public static void main(String args[]){
        // selection sort is good approch to sort any array cause in this we use replacing to  sort any array
        int arr[] = {2,5,9,2,4,5,7};
       

        for(int i = 0; i<arr.length-1; i++){
             int min = Integer.MAX_VALUE;
             int k = 0;

            for(int j = i; j<arr.length; j++){
                if( arr[j] < min) {
                    min = arr[j];
                    k = j;
                    
                    
                }
               

            }
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = min;


           

       
      

    }
      System.out.println(Arrays.toString(arr));
    
}}
