import java.util.ArrayList;
import java.util.Arrays;

public class spiral {
    public static void spiral(int matrix[][]) {
        ArrayList<Integer> you = new ArrayList<>();
        int startRow = 0;
        int endRow = matrix.length-1;
        int startcol =0;
        int endcol = matrix[0].length-1;
        while(startRow <= endRow && startcol <=endcol) {
            for(int i = startcol; i <= endcol; i++) {
                System.out.print(matrix[startRow][i]+"");
                you.add(matrix[startRow][i]);
            }
        for (int j = startRow +1; j<=endRow; j++) {
            System.out.print(matrix[j][endcol]+"");
            you.add(matrix[j][endcol]);
        }
        for (int i = endcol-1; i>=startcol; i--){
            if(i == endcol) {
                break;
            } 
            System.out.print(matrix[endRow][i]);
            you.add(matrix[endRow][i]);
        }
        for (int j = endRow-1; j >=startRow; j--) {
            if(j  == startRow) {
                break;

            }
            System.out.print(matrix[j][startcol]);
            you.add(matrix[j][startcol]);

        }
        startRow++;
        endRow--;
        startcol++;
        endcol--;
        
        }
        System.out.println(you);
    }
    public static void main (String args[]) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };
        spiral(matrix);


    }
    
}
