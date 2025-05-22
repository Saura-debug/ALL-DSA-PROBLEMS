import java.util.*;
public class nature {
    public static boolean isven (int a) {
        if ( a%2 == 0) {
            return true;
            

        }
        else {
            return false;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean con = isven(a);
        if (con == true) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
         


    }
}

