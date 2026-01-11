public class singlesort {
    // the brute force solution of this question very naive and in addition it can be solved by xor with TC of O(n)
    public static int sort(int arr[]){
        int low = 1;
        int high = arr.length-2;
        if(arr.length ==1){
            return arr[0];
        }
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[arr.length-1] != arr[arr.length-2]){
            return arr[arr.length-1];

        }
        while (low<=high) {
            int mid = low + (high - low)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                return arr[mid];

            }
            if(mid%2 == 0 && arr[mid] == arr[mid+1] || mid%2 != 0 && arr[mid] == arr[mid-1]){
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
            
            


            
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {3,3,7,7,10,11,11};
        int a  = sort(arr);
        System.out.print(a);

    }
}
