import java.util.Arrays;
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

  
public static void main(String args[]){
       int arr[] = {1,0,1,2};
      System.out.println(lng(arr));
       

    }
}