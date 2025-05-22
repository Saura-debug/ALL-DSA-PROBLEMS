import java.util.Arrays;

import java.util.ArrayList;
public class lonelynumber {
    
    public static void main (String[] args) {
        int arr[] = {7,3,6,9,8,2,12,45,0}; 
        Arrays.sort(arr);
        
       System.out.println(lonely(arr));
      

    }

    public static ArrayList<Integer> lonely(int arr[]) {
     ArrayList<Integer> list = new ArrayList<>();
       

        for(int i =0; i<arr.length; i++){
            if(i == 0){
                if(arr[i] != arr[i+1] && arr[i+1] != arr[i] + 1){
                    list.add(arr[i]);

                }
            }
             else  if(i ==arr.length-1){
                if(arr[i] != arr[i-1] && arr[i-1] != arr[i]-1) {
                    list.add(arr[i]);
                }
            }

            else   {
                if(arr[i] != arr[i-1] && arr[i-1] != arr[i] -1 && arr[i] != arr[i+1] && arr[i+1] != arr[i]+1) {
                    list.add(arr[i]);
                }
            }
          
         
               

        }
          return list;
     
        

    }
}
