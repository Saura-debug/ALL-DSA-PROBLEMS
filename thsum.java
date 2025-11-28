import java.util.*;
public class thsum {
    public static void threesum(int arr[]){
        // this question has the time complexity of the O(n^3) and SC is O(n)
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    if( arr[i] + arr[j] + arr[k] == 0){
                        ArrayList<Integer> n = new ArrayList<>(3);
                        n.add(arr[i]);
                        n.add(arr[j]); 
                        n.add(arr[k]);
                        Collections.sort(n);
                        st.add(n);



                    }
                }
            }
        }
        System.out.println(st);
       


    }
    public static void threesum2(int arr[]){
        Set<List<Integer>> st = new HashSet<>();
        // we have solved this question by removing the one loop and in the place of that loop  we used set DS.
        // which has the TC O(n^2) and SC O(n) + O(2 no of triplets) 
        for(int i = 0; i<arr.length; i++){
            Set<Integer> a = new HashSet<>();
            for(int j = i+1; j<arr.length; j++){
                int req = -(arr[i]+arr[j]);
                if(a.contains(req)){
                      ArrayList<Integer> n = new ArrayList<>(3);
                      n.add(arr[i]);
                      n.add(arr[j]);
                      n.add(req);
                      Collections.sort(n);
                      st.add(n);
                     
                    
            
                }
                 a.add(arr[j]);


            }
        }
        System.out.println(st);
    }
    public static void threesum3(int arr[]){
        // this question has  TC O(n) and SC(1)
       Set<List<Integer>> st = new HashSet<>();
       Arrays.sort(arr);
       for(int i =0; i<arr.length; i++){
        int j = i+1;
        int k = arr.length -1;
        while (k>j) {
            int sum = arr[i] + arr[j] + arr[k];
            if( sum==0){
                st.add(Arrays.asList(arr[i],arr[j],arr[k]));
                j++;
                k--;
                while (k>j && arr[j] == arr[j-11]) {
                    j++;
                    
                }
                while (k>j && arr[k] == arr[k+1] ) {
                    k--;
                    
                }

            }
            else if(sum>0){
                k--;
            }
            else{
                j++;
            }
            
        }
       }
       System.out.println(st);
    }
    public static void main(String args[]){
        int arr[] = {-1,0,1,2,-1,-4};
        threesum3(arr);


    }


    
}
