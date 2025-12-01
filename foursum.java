import java.util.*;

public class foursum {
    public static void frsum(int arr[],int tar){
        // this question follows the same rules as the three sum so' the bruteforce will be the same with TC O(n^4) and TC(n*2*storing space)
        // this is the completly same as the three sum.
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    for(int l = k+1; l<arr.length; l++){
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
                        if(sum == tar){
                            ArrayList<Integer> pp = new ArrayList<>();
                            pp.add(arr[i]);
                            pp.add(arr[j]);
                            pp.add(arr[k]);
                            pp.add(arr[l]);
                            Collections.sort(pp);
                            st.add(pp);

                        }
                    }
                }
            }
        }
        System.out.println(st);
    }

    // better solution for this question will  consist three loops and will find the fourth element to get  equal to the target element
    // this solution conclude the TC O(n^3) and SC will be O(n+2*for returning + arralist of length 4 which should not be taken as the space)
    public static void frsum2(int arr[], int tar){
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                Set<Integer> n = new HashSet<>();
                for(int k = j+1; k<arr.length; k++){
                    int t = tar-(arr[i]+arr[j]+arr[k]);
                    if(n.contains(t)){
                        ArrayList<Integer> p = new ArrayList<>(4);
                        p.add(arr[i]);
                        p.add(arr[j]);
                        p.add(arr[k]);
                        p.add(t);
                        Collections.sort(p);
                        st.add(p);
                        
                    }
                    n.add(arr[k]);

                }
                
            }
        }
        System.out.println(st);

    }
    // now,we have come to the optimal solution which will have the TC O(n^2) and SC O(1) where two  numbers will be static and other two will follow pointer
    // used the long type in sum. i will analyze it after my exam
    
    public static void frsum3(int arr[],int tar ){
        Set<List<Integer>> st = new HashSet<>();
        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int start = j+1;
                int end = arr.length-1;
                while(start<end){
                    int sum = arr[i]+arr[j]+arr[start]+arr[end];
                    if(sum == tar){
                        st.add(Arrays.asList(arr[i],arr[j],arr[start],arr[end]));
                        start++;
                        end--;

                        while(start<end && arr[start] == arr[start-1]){
                            start++;
                        }
                        while(start<end && arr[end] == arr[end+1]){
                            end--;
                        }

                    }
                    else if(sum>tar){
                        end--;

                    }
                    else{
                        start++;
                    }

                    
                }

            }
        }
         System.out.println(st);
    }

    public static void main(String args[]){
        int arr[] = {1,0,-1,0,-2,2};
        frsum3(arr,0);


    }
    
}
