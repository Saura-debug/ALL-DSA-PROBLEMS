public class Binary {

    public static void main(String[] args) {
        int number[] = {10,12,15,17,20,24,28};
       int key = 14; 
       int result = binarysearch(number,7, key);
       if (result != -1) {
        System.out.println("the key is " + result); 
       }
       else {
        System.out.println("Key has not been found");
       }

    }
    public static int binarysearch(int number[],int size, int Key) {
        int start = 0,  end = size-1;
        while( start < end) {
            int mid = start +(end - start)/2;
            if ( number[mid] == Key ) {
                return mid;

            }
            if(number[mid] < Key) {
                end = mid -1;
            }
            else{
                start = mid + 1;
                
            }
            
            
        }
        return-1;
        
    }

}