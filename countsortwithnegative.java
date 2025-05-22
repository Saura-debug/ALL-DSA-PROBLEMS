public class countsortwithnegative {
    public static void main(String args []){
        int array[]= {-3,5,8,-1,7};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<array.length; i++){
            if ( array[i] > max  ) {
                max = array[i];
            } 
        }
        System.out.print(max);
        for (int i = 0; i<array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
           
        }
        System.out.print(min);
        int virtual[] = new int[max-min +1];
        for (int i = 0; i < array.length; i++ ){
             int element = array[i] - min;
             virtual[element]++;
        } 
        int k =0;
        for (int i = 0; i < virtual.length; i++){
                int fre = virtual[i];
            for (int j = 1; j<=fre; j++){
                array[k] = i+min;
                k++;

                
            }
        } 

        for (int i = 0; i<array.length; i++){
            System.out.print(array[i] + "  ");
        }

    }

    
}
