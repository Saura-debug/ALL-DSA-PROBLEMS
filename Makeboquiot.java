import java.util.Arrays;

public class Makeboquiot {
    // this is the brute force solution of this question which have i solved 
    // it would have the TC O(max*n) and SC O(1)
    public static int bouquet(int arr[],int m,int n,int max,int min){
     while (min<=max) {
        int count = 0; 
        int boq = 0; 
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<= min){
                count++;
                if(count == n){
                    boq++;
                    count = 0; 
                }
            } else{
                count = 0; 
            }
        }
        if(boq >=m){
            return min; 

        }
        min++;
        
     }
     return -1; 
    } // the optimal solution for that question would be 
    public static int bouquet1(int arr[],int m,int n ,int high,int low){
       int boqtt = Integer.MAX_VALUE;

         while (low<=high) {
        int count = 0; 
        int boq = 0; 
        int mid = low + high-low/2;
      
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<= mid){
                count++;
                if(count == n){
                    boq++;
                    count = 0; 
                }
            } else{
                count = 0; 
            }
        }
        if(boq >= m){
        boqtt = Math.min(mid,boqtt);
        high = mid-1; 

        }
       
        else{
            low = mid+1;
        };
        
     }
     return boqtt;

    }
    public static int bouquets(int arr[], int m , int n ){
       int max =  Arrays.stream(arr).max().getAsInt();
       int min =  Arrays.stream(arr).min().getAsInt();
       int tb = bouquet1(arr,m,n,max,min);
       System.out.println(tb);
       if(tb>=-1){
        return tb; 
       }
       return -1;

    }
    public static void main(String[] args) {
        int arr[] = {1,3,8,9,12};
        int m = 2;
        int n = 2; 
        int a = bouquets(arr,m,n);
        System.out.println(a);
        
    }
    
}
