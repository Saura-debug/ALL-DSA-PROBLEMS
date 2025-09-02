import java.util.Arrays;

public class sortcolor{
// this is the better approch according to striver.
    public static void sort(int arr[]){
   

  
    }
    public static void main(String args[]){
        // this is the better approch of solving this question for detail analysis we can go further for optimal solution 
         int arr[] = {1,0,1,2,1};
        //      int zero = 0; 
        // int one = 0; 
        // int two= 0; 

        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] == 0){
        //         zero++;
        //     }
        //     if(arr[i]==1){
        //         one++;
        //     }
        //     if(arr[i]==2){
        //         two++;
        //     }
        // }
        // System.out.println(zero);
        // System.out.println(one);
        // System.out.println(two);
        
        //    int count = 0;
        // for( int i = 0; i<zero; i++){
        //     arr[count] = 0; 
        //     count++;

        // }
    
        // System.out.println(count);
        

        // for(int j =0; j<one; j++ ){
        //     arr[count] = 1; 
        //     count++;

        // }

       
        // System.out.println(count);
        // for(int k = 0; k<two; k++){
        //     arr[count]= 2;
        //     count++;
        // }
        // System.out.println(Arrays.toString(arr));
        int low = 0;
        int med = 0; 
        int high = arr.length - 1;
        while(med<high){
            if(arr[med] == 0){
                arr[low] = arr[med];
                low++;
                med++; 
            }
           if(arr[med] == 1){
            med++;
           }
           if(arr[med] == 2){
            arr[high] = arr[med];
            high--;
           }
        }
        System.out.println(Arrays.toString(arr));



    }
}