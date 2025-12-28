public class numberrotate {
    // this is the bruteforce solution where we will not take the adavantage of sorted
    // array or in other words this brute will run in both sorted and unsorted array
    // it has the time complexity O(n) and SC O(1)
    public static int rota0(int arr[]){
        int index = Integer.MAX_VALUE;
        int ele = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<=ele){
                ele = arr[i];
                index = i;

            }
        }
        return index;
    }
// this is the better which might take less time than O(n)
public static int rota1(int arr[]){
    for(int i = 0; i<arr.length; i++){
        if(arr[i]>arr[i+1]){
            return i+1;
        }
    }
    return -1;
}
// this is the optimal solution since it runs in the TC O(logn)
public static int rota2(int arr[]){
    int low = 0;
    int high = arr.length-1;
    while(low<high){
        int mid = low + (high - low)/2;
       
        if(arr[mid]>arr[high]){
            low = mid+1;

        }
        else {
            high = mid;
        }
    }
    return low;


}

    
    public static void main(String args[]){
      int arr[] = {3,4,5,1,2};
      int a = rota2(arr);
      System.out.print(a);

        
    }
    
}
