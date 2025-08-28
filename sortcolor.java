import java.util.Arrays;

public class sortcolor{
// this is the better approch according to striver.
    public static void sort(int arr[]){
   

  
    }
    public static void main(String args[]){
        int arr[] = {0,1,2,0,2,0,2,0,1,2,0};
             int zero = 0; 
        int one = 0; 
        int two= 0; 

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }
            if(arr[i]==1){
                one++;
            }
            if(arr[i]==2){
                two++;
            }
        }
        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        
           int count = 0;
        for( int i = 0; i<zero; i++){
            arr[count] = 0; 
            count++;

        }
    
        System.out.println(count);
        

        for(int j =0; j<one; j++ ){
            arr[count] = 1; 
            count++;

        }

       
        System.out.println(count);
        for(int k = 0; k<two; k++){
            arr[count]= 2;
            count++;
        }
        System.out.println(Arrays.toString(arr));

    }
}