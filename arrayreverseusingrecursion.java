import java.util.Arrays;

public class arrayreverseusingrecursion {
    // this was the easy question we can say that it is easy level but plays  role in making a 
    //good foundation  for one iteration you can go to other approch with single iterator 

    // public static void revers(int arr[], int start, int end){
    //      if(start > end){
    //         System.out.print(Arrays.toString(arr));
    //         return;
    //     }
    //     int temp = arr[start];
    //     arr[start] = arr[end];
    //     arr[end] = temp;
    //     revers(arr, start+1, end-1);

    // }

    // for second approch we have a simple and patternwise solution where we will replace i from 
    // n-i-1 until i gets larger than n/2

    // public static void reverse2(int arr[], int i , int l){
    //     if(i>(l/2)){
    //         System.out.print(Arrays.toString(arr));
    //         return;
    //     }
    //     int temp = arr[i];
    //     arr[i] = arr[l-i-1];
    //     arr[l-i-1] = temp;
    //     reverse2(arr, i+1, l);
    // }

    // for the checking the  string or arr is pelindrome or not 
      public static boolean palindrome(int arr[], int i , int l ) {
        if(i>(l/2)){
            return true;
             
        }
        if(arr[i] != arr[l-i-1]){
            return false;
        }
        return palindrome(arr, i+1, l);

      }
    public static void main(String args[]){
        int arr[] = {1,1,8,1,1};
        int start = 0;
        int end = arr.length-1;

        int l = arr.length;
        // revers(arr,start,end);
        // reverse2(arr,0, l)
        boolean a = palindrome(arr, 0, l);
        System.out.print(a);
    }
}
