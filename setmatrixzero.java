import java.util.Arrays;

public class setmatrixzero {
    public static void mat(int matrix[][]){
         boolean zero[][] = new boolean[matrix.length][matrix[0].length];
         for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    zero[i][j] = true;
                }
            }
         }
         for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0 && zero[i][j] == true){
                    for(int k = 0; k<matrix.length; k++){
                        matrix[k][j] = 0;
                    }
                    for(int l = 0; l<matrix[0].length; l++){
                        matrix[i][l] = 0;
                    }}}}

        System.out.println(Arrays.deepToString(matrix));
        // Arrays.deepToString is used to print the 2d arrays
           
    }
    // so for reducing the space complexity ,we can use the put the -1 instead of putting zero first
    // this solution has the complexity of O(n^3), and i have learned this question brutefore by the striver 
    public static void mat1(int matrix[][]){
        for(int i =0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    for(int m = 0; m<matrix.length; m++){
                        if(matrix[m][j]!=0){
                            matrix[m][j] = -1;
                        } 
                    }
                    for(int n = 0; n<matrix[0].length; n++){
                        if(matrix[i][n] != 0){
                            matrix[i][n] = -1; }}}}}
        for(int i =0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == -1){
                   matrix[i][j] =0;}}}
        System.out.println(Arrays.deepToString(matrix));
    }  
     // this is the better approch from the strive  // with time TC O(n^2) with SC O(m*n)
      public static void mat2(int matrix[][]){
        int arr1[] = new int[matrix.length]; // row 
        int arr2[] = new int[matrix[0].length];
        for(int i =0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    arr1[i] = 1;
                    arr2[j] = 1;}}}
          for(int i =0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(arr1[i] == 1 || arr2[j]==1){
                   matrix[i][j] = 0;}}}
        System.out.println(Arrays.deepToString(matrix));
        

      }
      public static void mat3(int matrix[][]){
        // this is the optimal solution with the time complexity of O(n^2) , i watched the striver  but solved it myself (almost);
        int col = 1;
        if(matrix[0][0] == 0){
            for(int i =0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
             for(int i =0; i<matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        else{
            for(int i = 1; i<matrix[0].length; i++){
            if(matrix[0][i] == 0){
                for(int j = 0; j<matrix[0].length; j++){
                    matrix[0][j] = 0;
                }
                col = 0;
            }
        }
        if(col == 0){
            matrix[0][0] = 0;
        }
        for(int i = 1; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j<matrix.length; j++){
                    matrix[j][0] = 0;
                }
                col = 0;
            }

        }
        if(col == 0){
            matrix[0][0] = 0;
        }
        }

        for(int i = 1; i<matrix.length; i++){
            for(int j = 1; j<matrix[0].length; j++){
                if(matrix[i-i][j]==0 || matrix[i][j-j]==0){
                  matrix[i][j] = 0;
                }

            }
        }
        System.out.println(Arrays.deepToString(matrix));

        
        


      }
    public static void main(String args[]){
        int arr[][] = {{0,1,2},{1,0,7},{1,8,0}};
        mat2(arr);

    }
    
}
