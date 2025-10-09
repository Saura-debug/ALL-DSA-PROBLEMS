public class majorelement {
    public static int major(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int count = 1;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }

            }
            if(count>arr.length/2){
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int arr[] = {1,2,5,1,4,6,3,2,1,4,7,8,9,5,4,1,1,1,1,1,1,1,1,1,1,1,1,};
        System.out.println(arr.length);
        System.out.println(major(arr));
    }
    
}
