public class subaraysum {
    public static void subarr(int array[]) {
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<array.length; i++){
            int start = i;
            for (int j = i; j<array.length; j++){
                int end = j;
                currsum =0;
                for (int k = start; k<= end; k++){
                    currsum += array[k];
                } System.out.println(currsum);
                if (max < currsum){
                    max = currsum;
                }
                 
            } System.out.println();
           
        }
        System.out.print("maximum sum is " + max);
    }

    public static void main(String args[]){
        int array[] = {1,2,3,4};
        subarr(array);


    }
}

