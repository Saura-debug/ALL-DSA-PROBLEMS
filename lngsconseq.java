import java.util.Arrays;

public class lngsconseq {
    // this is totally solved by me without help of striver 
    private static int fall(int arr[]){
        int point = 0;
        int max = 0;
        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++){
            if(i == arr.length-1){
                 max = Math.max(max,i-point+1); 

                break;
            }
           
            if(arr[i+1] !=arr[i]+1|| i==arr.length-1){
                point = i+1;

                
            }
            max = Math.max(max,i-point+1);
             

        }
        return max;
       
    }
    // this is the bruteforce solution given by the striver
    private static int fall2(int arr[]){
        int max = 1;
        for(int i =0; i<arr.length; i++){
            int count = 1;
            int x = arr[i];
            for(int j = 0; j<arr.length; j++){
                if(arr[j] == x+1){
                    x++;
                    count++;
                    j--;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
public static void main(String args[]){
       int arr[] = {1,2,4,5,6,7,8};
      System.out.println(fall2(arr));
       

    }
}