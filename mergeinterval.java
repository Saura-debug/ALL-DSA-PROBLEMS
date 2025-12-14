import java.util.*;

public class mergeinterval {
    public static void mergeint(int arr[][]){
       
        List<List<Integer>> st = new ArrayList<>();
        int n = arr.length;
        int i = 0; 
        while (i<n) {
            int start = arr[i][0];
            int end = arr[i][1];
            int j = i+1;
            while (j<n && arr[j][0] <= end) {
                end = Math.max(end,arr[j][1]);
                j++;
                
            }
            st.add(Arrays.asList(start,end));
            i = j;
            
        }
        System.out.println(st);

    }
    // this is the optimal approach off the solution which will have the TC = O(nlogn+n) = O(n) and OC = O()  
    public static void mergeint1(int arr[][]){
        List<List<Integer>> st = new ArrayList<>();
        Arrays.sort(arr,Comparator.comparingInt(a -> a[0])); // this is also a function 
        //Arrays.sort(arr,(a,b) -> Integer.compare(a[0], b[0])); // this is also a function 
        for(int i = 0; i<arr.length; i++){
            int start = arr[i][0];
            int end = arr[i][1];
          
                  int j = i+1; 

            
           
            
           if(j<arr.length-1){
            while(arr[i][1] >= arr[j][0]){
                end = Math.max(arr[j][1],end);
                j++;


            }
        }
            st.add(Arrays.asList(start,end));
            i=j;
          
                System.out.println(st);

            
    


        }
     


        
    }
    
    public static void main(String args[]){
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        mergeint1(arr);

    }
    
}
