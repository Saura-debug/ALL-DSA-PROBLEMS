import java.util.Arrays;
import java.util.HashSet;
public class lngsconseq {
// this code i learned from the striver it was bit difficult
  
private static int lng(int arr[]){
int lg = 0;
for(int i =0; i<arr.length; i++){
  int x = arr[i];
  int count = 1;
for(int j =0; j<arr.length; j++){
  if(x+1 == arr[j]){
    count++;
    x = x+1;
    j = -1;
  }
  lg = Math.max(count, lg);
}
}
return lg;
}

// better solution by striver

// this has time complexity O(n) + O(nlogn)
private static int lng2(int arr[]){
  Arrays.sort(arr);
   int lg = 1;
   int curr = 0;
   int lsm = Integer.MIN_VALUE;
   for(int i =0; i<arr.length; i++){
    if(arr[i]-1 == lsm){
      curr++;
      lsm = arr[i];
    }
    else if(arr[i]!=lsm){
      curr = 1;
      lsm = arr[i];

    }
    lg = Math.max(curr,lg);
   }
   return lg;
}
private static int lng3(int arr[]){
  // this is the optimal solution given by the striver with TC O(1)  in unsorted HashSet, in collision the Tc can go up to O(n) and SC is O(N)
  HashSet<Integer> group = new HashSet<>();
  int lg = 0;
  int count = 1; 
  for(int i =0; i<arr.length; i++){
    group.add(arr[i]);
  }
  for(Integer a : group){
    if(!group.contains(a-1)){
      count = 1;
      while (group.contains(a+1)) {
        count++;
        a++;
        
      }
    }
    lg = Math.max(lg, count);
  }
  return lg;
}

  
public static void main(String args[]){
       int arr[] = {1,0,1,2,3,4};
      System.out.println(lng3(arr));
       

    }
}