import java.util.ArrayList;

public class leaderarray {
    public static void leader(int arr[]){
        // bruteforce solution  i has TC O(n^2) and SC is O(n)
        ArrayList<Integer> ss = new ArrayList<>();
        boolean ans = false; 
        for(int i =0; i<arr.length; i++){
            if(i==arr.length-1){
                ss.add(arr[i]);
                break;
            }
            ans = false;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    ans = true;
                    break;
                }
                
            }

            if(ans==false){
                ss.add(arr[i]);
            }
        } 
        System.out.println(ss);

    }
    // we can have only  optimal solution for that we will keep the track the maximum from the length -1 it has TC O(N) with same SC
    public static void leader2(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> ss = new ArrayList<>();
        for(int i = n-1; i>=0; i--){
            if(arr[i]>max){
                ss.add(arr[i]);
                max = arr[i];
            }

        }
        System.out.println(ss);
    }
    public static void main(String[] args){
        int arr[] = {10,22,12,3,0,6};
        leader2(arr);
       

    }
    
}
