public class largelement {

    // the brute force solution will be sorting the array and after that just print the last index element,we can use any of algorithim from the merge sort, quick sort both have the time complexity of O(nlogn) 

    // this is the most optimal solution with complexity of O(N) which is better then the O(nlogn)
    public static int larger(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){

            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {3,5,7,3,1};
        int l = larger(arr);
        System.out.println(l);

    }
    
}
