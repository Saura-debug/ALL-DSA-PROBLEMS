public class subarray {
    public static void subarry(int subarr[]) {
       for(int i = 0; i < subarr.length; i++){
        int start = i;
        for(int j = i; j<subarr.length; j++){
            int end = j;
            for(int k = start; k<=end; k++){
                System.out.print(subarr[k] + " ");
            }
            System.out.println();
        }
        System.out.println();
       }
    }      
    public static void main(String[] args) {
        int subarr[] ={2,3,4,6};
        subarry(subarr);



    }
    
}
