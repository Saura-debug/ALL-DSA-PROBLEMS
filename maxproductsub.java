public class maxproductsub {
    // this is the brute-force solution , it has TC O(n^3)
    public static int pro(int arr[]){
        int max = 0;
    for(int i = 0; i<arr.length; i++){
        for(int j = i; j<arr.length; j++){
            int product = 1;
            for(int k = i; k<=j;  k++){
                product*= arr[k];
            }
            max = Math.max(product,max);

        }
    }
    return max;
}
    public static void main(String args[]){
        int arr[] = {1,3,4};
        int a = pro(arr);
        System.out.println(a); 




    }
}
