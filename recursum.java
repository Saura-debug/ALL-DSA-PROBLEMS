public class recursum {

    public static void sumrecursion(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;

        }
        
        
        sumrecursion(n-1, sum+n);
        
        
       


    }
     public static int sumrecursion2(int n){
        if(n == 0){
            return 0;
        }
        
        return n + sumrecursion2(n-1);

        
        
       


    }

    
    


    public static void main(String args[]){
        sumrecursion(3, 0);
        int a =sumrecursion2(5);
        System.out.println(a);
       

    }
    
}
