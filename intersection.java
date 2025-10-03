import java.util.ArrayList;
import java.util.Arrays;

public class intersection {
    public static void union(int arr[], int arr2[]){
        int one = arr.length;
        int two = arr2.length;
        ArrayList<Integer> yy = new ArrayList<>();
        for(int i =0; i<one; i++){
            for(int j =0; j<two; j++){ 
                if(arr[i]== arr2[j]){
                    yy.add(arr[i]);

                }
            }
        }
        System.out.println(yy);

    }
    public static void main(String args[]){
        int arr[] = {1,3,5,7,8,10};
        int arr2[] = {1,7,8,10};
        union(arr, arr2);


    }
    
}
