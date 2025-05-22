public class Reverse {
    static void river(int rever[], int size){
        int start = 0; 
        int end = size - 1;
        while (start < end) {
            int temp = rever[end];
            rever[end] = rever[start];
            rever[start] =  temp;
            start++;
            end--;


            
        }
       
    }
    public static void main(String[] args) {
        int rever[] = {1,3,8,10,15,17,21};
        river(rever,7);
        for (int i = 0; i < rever.length; i++) {
            System.out.print(rever[i] + " ");
            
        }


    }
     
}
