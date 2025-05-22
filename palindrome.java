public class palindrome {
    public static int rever(int a) {
        int rev = 0;
     while(a>0) {
        int dig = a%10;
        rev = rev*10 +dig;
        a = a/10;
        
    


     }
     return rev;
    }
    public static boolean check(int a){
        int reverse = rever(a);
        if (reverse == a) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main (String args[]) {
        int a = 121;
         boolean ans = check(a);
         System.out.println(ans);

    }
    
}
