import java.util.*;

public class matrix{
    public static int keyfon(int matrix[][]){
        int min = Integer.MAX_VALUE;
        for ( int i =0; i<matrix.length; i++ ){
            for(int j = 0; j<matrix[0].length; j++){
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                   
                } 
            }
          
        } 
        return min;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int key = 8;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
               matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
              System.out.print( matrix[i][j]);
            }
            System.out.println();
        }

   int a =  keyfon(matrix);
   System.out.print(a);
        
    }
    
}
