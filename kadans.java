public class kadans {
    public static int kadan(int array[]){
        int cs = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<array.length; i++){ 
            cs += array[i];

            if(cs < 0 ) {
                cs = 0;
            }
            max = Math.max(cs,max);
        }
        return max;
    }
    public static void main(String args[]){
        int  array[] = {5,0,7,-4,6,-7};
        int maxx = kadan(array);
        System.out.println(maxx);

    }
}
