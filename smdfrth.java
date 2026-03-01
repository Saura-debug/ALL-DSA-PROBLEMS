import java.util.*;

public class smdfrth {
    public static int  find(int arr[],int min){
        int sum = 0; 
        for(int i = 0; i<arr.length; i++){
            double a = (double) arr[i]/min;
            sum += Math.ceil(a);
        }
        return sum; 
    
}

    public static void main(String[] args) {
        int arr[] = {9,4,6,4,3,2};
        int threshhold = 7; 
        int ans = Integer.MAX_VALUE;
        int max = Arrays.stream(arr).max().getAsInt();
         int min =  1;
         while(min<=max){
         int divser = find(arr,min);
         if(divser <=threshhold){
            ans = Math.min(ans,min);

         } 
            min++;
           

         
        
    
    
}
System.out.println(ans);
    }
}
