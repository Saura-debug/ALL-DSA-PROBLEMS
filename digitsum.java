public class digitsum {
    public static int  sumdigit (int a) {
        int sum = 0;
        while(a >0) {
            int dig = a%10;
            sum = sum + dig;
              a = a/10;

        }
        return sum;
    }
    public static void main (String args[]) {
        int add = sumdigit(200671);
        System.out.println(add);

    }
    
}
