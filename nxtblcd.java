import java.util.*;
public class nxtblcd {
    // this question came up in daily which i have solved with the help of codestorywithmMIK
    private static boolean balanced(int count){
        int arr[] = new int[10];
         boolean state = true;
         while (count>0) {
            int digit = count%10;
            arr[digit]++;
            count = count/10;
            
         }
         for(int i =0; i<10; i++){
            if(arr[i]>0 && arr[i]!=i){
                return false;
            }
         }

         return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i = 0; i<=122444; i++){
            if(balanced(i)){
                System.out.println(i+"yes your next is balanced");
            } 
            
        }
        

        
    }
    
}
