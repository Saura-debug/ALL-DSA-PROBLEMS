public class single {
    // it is the better approch with TC O(3N) and SC O(N) , it is totally dependent on an array of length
    public static int sin(int arr[]){
        int maxel = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            maxel = Math.max(arr[i], maxel);
        }
        int arr2[] = new int[maxel+1];
        for(int i =0; i<arr.length; i++){
            int temp = arr[i];
            arr2[temp]++;
                }
                for( int i =0; i<arr2.length; i++){
                    if(arr2[i] == 1){
                        return i;
                    }

                }
                return -1;

    }
    public static void main(String args[]){
        int arr[] = {2,4,2,4,9,0,0,1,1};
        int ans = sin(arr);
        System.out.println(ans);



    }
    
}
