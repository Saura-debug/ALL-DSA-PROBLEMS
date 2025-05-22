public class pairs {
    public static void main(String[] args) {
        int joda [] = {2,6,7,0};
        pairs(joda);


    }
    public static void pairs(int joda[]) {
        int p = 0;
        for (int i = 0; i < joda.length; i++) {
            int curr = joda[i];
            for( int j = i+1; j <joda.length; j++ ){
                System.out.print("(" + curr + "," + joda[j] + ")");
                p++;
            }
            System.out.println();

       

    }
    System.out.print("number of paires" + p);
    
   

}
}