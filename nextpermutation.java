import java.util.Arrays;

public class nextpermutation {
// this is the solution with the TC O(n) and SC O(1) it is very easy and understanble 
// and can be solved  easily there i got to learn that everything has solution you just have to look for it seriously
private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] arr,int i, int j){
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
private static void nextpermute(int arr[]){
    int n = arr.length;
    int index = n-2;
    while(arr[index] >= arr[index+1] && index >= 0){
        index--;
    }
    // if index is not last permutation
    if(index >= 0){
        int j = n-1;
        while(arr[index] >= arr[j] ){
            j--;
        }
        swap(arr, index, j);
    }
    reverse(arr,index+1,n-1);
    System.out.println(Arrays.toString(arr));
}

public static void main(String args[]){

    int arr[] = {1,2,3,4};
    nextpermute(arr);

}

    
}
