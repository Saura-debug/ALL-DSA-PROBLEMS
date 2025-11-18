public class moveonetoend {
    
    public static int opera(String str){
        char arr[] = str.toCharArray();
        int n = arr.length;
        int operations = 0; 
        boolean changed = true;
        // this is the brute force solution which will lead  TC O(N^2)
        while (changed) {
            changed = false;
            for(int i = 0; i<n-1; i++){
                if(arr[i] == '1' && arr[i+1] == '0'){
                    // perform the operation 
                    int j = i;
                    while(j+1 < n && arr[j+1] =='0'){
                        char temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp; 
                        j++;
                    }
                    operations++;
                    changed = true;
                }
            }
            
        }
        return operations;
 
    }
    public static void main(String args[]){
        String str = "01001";
        int ans = opera(str);
        System.out.println(ans);

    }
    
}
