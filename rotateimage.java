import java.util.Arrays;

public class rotateimage {
    public static void rotate(int arr[][]){
        // here tc = 0(n^2) and sc = o(n^2)
        int n = arr.length; //row length;
        int m = arr[0].length; // column length
        int arr1[][] = new int[n][m];
        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr1[j][(n-1)-i] = arr[i][j];
            }
        }
     System.out.println(Arrays.deepToString(arr1));

    }
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b=temp;

    }
    public static void rotate1(int arr[][]){
        // sc = O(1) and tc = O(n^2)
        int n = arr.length; 
        int m = arr[0].length; 
        for(int i = 0; i<n; i++){
            for(int j = i; j<m; j++){
                if(i!=j){
                    int temp = arr[i][j];
                    arr[i][j]= arr[j][i];
                    arr[j][i] = temp;
                    
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for(int i =0; i<n; i++){
            int p = 0;
            int q = n-1;
            while (q>p) {
                int temp = arr[i][p];
                arr[i][p] = arr[i][q];
                arr[i][q] = temp; 
                q--;
                p++;  
                
            }

        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static void main(String args[]){
        int arr[][] = {{5,4,6},{2,1,5},{4,3,1}};
        rotate1(arr);

    }
    
}
