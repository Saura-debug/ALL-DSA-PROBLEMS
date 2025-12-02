import java.util.HashMap;

public class xorsumk {
    // here i am ignoring the bruteforce cause  bruteforce solution of this is same as the better approach , only the diffrence is that the complexity in better approch is boiled down from the O(n^3) to O(n^2)
    private static void xo(int arr[], int tar){
        int count = 0; 
        for(int i = 0; i<arr.length; i++){
            int xor = 0;
            for(int j = i; j<arr.length; j++){
                xor = xor^arr[j];
                if(xor == tar){
                    count++;


                }



            }
        }
        System.out.println(count);
    }
    // now i am going to code the optimal solution 
    // i havent dry run this question but it really needs get dry run to get in mind
    // due lack of time , i could'nt do that now but i will do it after my exams
     private static void xo1(int arr[], int tar){
        HashMap<Integer,Integer> st = new HashMap<>(); 
        int count = 0;
        st.put(0, 1);
        int prefixor = 0;

        for(int i = 0; i<arr.length; i++){
            prefixor = prefixor^arr[i];
            int target = prefixor^tar; 
            if(st.containsKey(target)){
                count += st.get(target);
            }
            st.put(prefixor,st.getOrDefault(prefixor, 0)+1);
             
        }
        System.out.println(count);
     }
    public static void main(String args[]){
        int arr[] = {4, 2, 2, 6, 4};
        xo1(arr,6);

    } 
    
}
