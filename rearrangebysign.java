import java.util.ArrayList;
import java.util.Arrays;

public class rearrangebysign {
    // this is the bruteforce solution by striver with the TC (2n) and SC O(N) 
public static void arrange(int arr[]){
    int n = arr.length;
    int arr1[] = new int[n/2];
    int arr2[] = new int[n/2];
    int nt = 0;
    int pt = 0;
    for(int i =0; i<n; i++){
        if(arr[i]<0){
            arr1[nt] = arr[i]; 
            nt++;
        }
        else{
            arr2[pt] = arr[i];
            pt++;
        }
    }
  
    
    for(int i =0; i<arr1.length; i++){
        arr[i*2+1]=arr1[i];
    }
    for(int i =0; i<arr2.length; i++){
        arr[i*2]=arr2[i];
    }

    System.out.println(Arrays.toString(arr));
}

// it cant be done without using the space so i will write the code which will consuming O(N) time complexity
public static void arrange2(int arr[]){
    int ps = 0;
    int nt = 1;
    int arr1[] = new int[arr.length];
    for(int i = 0; i<arr.length; i++){
        if(arr[i]<0){
            arr1[nt] = arr[i];
            nt+=2;

        }
        else{
            arr1[ps] = arr[i];
            ps+=2;
        }
    }
    System.out.print(Arrays.toString(arr1));
}
// what if we dont have the same numbers of elements positive and negative , In that case we just have to add all the remaining positive or negative element  in order to the array
public static void arrange3(int arr[]){
    ArrayList<Integer> na = new ArrayList<>();
    ArrayList<Integer> ps = new ArrayList<>();
     int nt = 0;
    int pt = 0;
    for(int i =0; i<arr.length; i++){
        if(arr[i]<0){
            na.add(arr[i]); 
            nt++;
        }
        else{
            ps.add(arr[i]);
            pt++;
        }
    }
   int min = Math.min(na.size(),ps.size());
    int max = Math.max(na.size(),ps.size());
   for(int i = 0; i<min; i++){
    arr[i*2] = ps.get(i);
    arr[i*2+1] = na.get(i);
    
   }
   int index = min;
   if(na.size()>ps.size()){
    for(int i = min*2; i<arr.length; i++){
        arr[i] = na.get(index);
        index++;
    }
   } else{
    for(int i = min*2; i<arr.length; i++){
        arr[i] = ps.get(index);
        index++;
    }

   }
   System.out.println(Arrays.toString(arr));

}

    public static void main(String args[]){
        int arr[] = {3,1,-2,-5,2,-4,6,7};
        arrange3(arr);

    }
}