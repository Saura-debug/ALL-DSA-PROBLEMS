import java.util.*;
import java.util.stream.IntStream;
public class allocation {
    public static int allocatedstudent(int thres,int arr[]){
        int student = 1; 
        int pages = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]+pages>thres){
                student++;
                pages = arr[i];
            } else {
                pages+=arr[i];
            }
        }
        return student;
    }
    // this solution has the tc = O(n^2);
    public static int find(int m , int n,int arr[]){
        if(m>n){
            return -1;
        }
        int large = Integer.MIN_VALUE;
       for(int i = 0; i<arr.length; i++){
        if(arr[i]>large){
            large = arr[i];
        }}
        int sumofArray = IntStream.of(arr).sum();

        for(int j = large; j<sumofArray; j++){
            if(allocatedstudent(j,arr) == m){
                return j;
            }
        }
        return -1;
    }
    public static boolean allocatedstudent2(int mid,int m,int arr[]){
      int pages = 0; 
      int student = 1;
      for(int i = 0; i<arr.length; i++){
        if(arr[i]+pages>mid){
            student++; 
            pages = arr[i];
        }
        pages+=arr[i];
      }
      if(student>m){
        return false;
      }
      return true;

    }

    public static int find1(int m , int n , int arr[]){
        if(m>n){
            return -1;
        }
         int large = Integer.MIN_VALUE;
       for(int i = 0; i<arr.length; i++){
        if(arr[i]>large){
            large = arr[i];
        }}
        int low = large;
        int high = IntStream.of(arr).sum();
        int min = Integer.MAX_VALUE;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if((allocatedstudent2(mid,m, arr))){
                 min = Math.min(mid,min);
                 high = mid-1;
                  
            } else {
                low = mid+1;
            }

            
        }
        return min;
    }
    public static void main(String[] args) {
        int m = 4; 
        int arr[] = {25, 46, 28, 49, 24}; 
        int n = arr.length;
        int ans = find1(m,n,arr);
        System.out.println(ans);

    }
}