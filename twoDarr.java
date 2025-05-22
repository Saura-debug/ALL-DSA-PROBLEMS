import java.util.*;
public class twoDarr {



    public static int largestnum(int arr[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] > max){

                    max = arr[i][j];
                }

            }
        }
        return max;

    }

    public static int smallestnum(int arr[][]) {
        int min = Integer.MAX_VALUE;
       for (int i = 0; i<arr.length; i++) {
        for(int j = 0; j<arr[0].length; j++){
            if(arr[i][j] < min){
                min = arr[i][j];
            }
        }
       }
       return min;
    }
    public static void main (String args[]){
        int arr[][] = new int [3][3];
        int  m = arr.length, n = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < m; i++){
            for (int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0 ; i < m; i++){
            for (int j = 0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
       System.out.println(largestnum(arr));
       System.out.println(smallestnum(arr));
    }
    
}
