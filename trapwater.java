public class trapwater {
    public static void main (String args[]){
        int hight[] = {4,2,0,6,3,2,3};
        int max = trapedwater(hight);
        System.out.print(max);
    }
      public static int trapedwater(int hight[]){
        // left max 
        int leftmax[] = new int [hight.length];
        leftmax[0] = hight[0];
        for ( int i = 1; i<hight.length; i++){
            leftmax[i] = Math.max(hight[i], leftmax[i-1]);
        }

        //Right max 
        int rightmax[] = new int[hight.length];
         rightmax[hight.length-1] = hight[hight.length -1];
         for( int i = hight.length -2; i>=0; i--){
            rightmax[i] = Math.max(hight[i],rightmax[i+1]);
         }
         int trapwater = 0;
         for (int i = 0; i<hight.length; i++){
            int waterlevel = Math.min(rightmax[i],leftmax[i]);
            trapwater += waterlevel - hight[i];
        }

        return trapwater;
        

      }
    
}
