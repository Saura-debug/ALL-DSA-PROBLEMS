import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        // bubblesort  means sending the maximum element at the last 
        // it follows the swapping where you swap adjacent elements  

        // remember   here we are taking the i>1 cause when index comes to 2 there only 3 are remained in where the first element automatically  get at sorted position hence thats it ; 
        // its time complexity is big O(n^2) but it can be reduced if we  get any sorted array 
        int arr[] = {1,2,3,4};
        int l = arr.length;
        boolean dicision = false; 
        for(int i = l-1; i>1; i--){
            for(int j = 0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    dicision = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if(dicision == true) {
                    break; 
                }
            }

        }

        System.out.println(Arrays.toString(arr));
         
        
    
    
       
    }
    
}
