public class recurssion {
    // public static void reverse(int n , int i){
    //     if(n<i){
    //         return;
    //     }

    //     System.out.print(n);
    //     reverse(n-1, i);



    // }



    // // we can do it in another way also in which we can solve that in easy way which contains the both parameters to be same 
    // public static void reverse2(int i , int n){
    //     if(i<1) {
    //         return; 
    //     }
    //     System.out.print(i);
    //     reverse2( i-1, n);
    // }

    // public static void count(int n , int i ){
    //     if(n<1){
    //         return;
    //     }
    //     count(n-1, i);
    //     System.out.print(n);
    // }
    public static void reversecount(int n , int i ){ 
        if(i>n){
            return; 
        }
        reversecount(n, i+1);
        System.out.print(i);
    }

    public static void main(String args[]){
     reversecount(5,1);
     
    }
    
}
