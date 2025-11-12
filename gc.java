import java.math.BigInteger;

public class gc {
    // this manual method (Eucluid method to find the gcd)
public static int grcd(int a, int b ){
    if(b==0){
    return a;
    }
    return grcd(b,a%b);
}
    public static void main(String args[]){
        int a  = 55;
        int b = 165;
        // while(b!=0){
        //     int temp = b;
        //     b = a%b;
        //     a = temp; 
        // }
        // System.out.println(a);
        // recursion method
    //    System.out.println( grcd(a, b));


       //BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();

        
    }
    
}
