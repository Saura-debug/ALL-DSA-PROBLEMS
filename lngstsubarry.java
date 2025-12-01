import java.util.HashMap;
// i will revist this question tomorrow 

public class lngstsubarry {
    public static void longest(int arr[]){
        int lng = Integer.MIN_VALUE;
        // this is the bruteforce solution  where i will find and check the sum for the every subarray
        // i have solved this with TC O(n^3)
        for(int i =0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int sum = 0;
                for(int k = i; k<j; k++){
                    sum+=arr[k];

                    }
                    if(sum == 0){
                        lng = Math.max(j-i,lng);
                    }
            }
        }
        System.out.println(lng);

    }
    // i will not  code the better solution cause it is just same as the brute force with bit less TC  O(n)

    //  this is the optimal approach to solve this problem with TC O(n) 
    public static void longest2(int arr[]){
        HashMap<Integer,Integer> st = new HashMap<>();
        st.put(0, 1);
        int sum = 0; 
        int lng = 0; 
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
            if(st.containsKey(0-sum)){
                lng = Math.max(lng,i-(st.get(0-sum)));

                
            }
            st.put(arr[i],i);
            
        }
        System.out.println(lng);
    }
    public static void main(String args[]){
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        longest2(arr);

    }
    
}
