public class countsort {
    public static void main(String args[]){
        int array[] = {1,5,8,7,7,5,6,9};
        int max = 0;
        for (int i = 0; i<array.length; i++){
            if(max < array[i]) {
                max = array[i];
            }

        }
        int count [] = new int[max +1];
        for ( int i = 0;  i <array.length; i++){
            int element = array[i];
            count[element]++;
        }
        int k = 0;
        for (int i = 0; i<=max; i++){
            int fre = count[i];
            for (int j = 1; j<=fre; j++) {
                array[k] = i;
                k++;
            }

        }
        System.out.print("accending array by sorting is ");
        
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
      
        

      }
         
        

      


    }
    
      
    

