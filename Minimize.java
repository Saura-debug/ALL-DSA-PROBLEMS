public class Minimize
{
    public static int min(int stations[],int k, int r){
        int ind  = 0;
        int inde = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int mi = 0;
        for(int i = 1; i<stations.length-1; i++){
           if(stations[i]<inde){
            inde = stations[i];
            ind = i;
           }
        }
        stations[ind]+= k;
      for(int i =0; i<stations.length; i++){
        if(i ==0){
            mi = 0;
            for(int j = i; j<=i+r; j++ ){
                mi+=stations[j];

            }
        }
        else if(i<stations.length-1){
            mi = 0;
            for(int j = i; j<stk)
        }

      }

    }
    public static void main(String args[]){

    }
    
}
