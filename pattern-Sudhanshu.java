public class pattern {
   public static void diamand ( int n) {
    int num = (2*n)-1;
    int space = n -1;
    int stars = 1;
    int line =1;
    while (line <= num) {
        // for space
        for ( int i=1; i <= space; i++) {
            System.out.println (" ");
        }
        // stars
        for (int j = 1; j <= stars; j++){
            System.out.println("*");
        }
        // space 
        for ( int i=1; i <= space; i++) {
            System.out.println (" ");
        }
        space--;
        stars =+ 2;
        line++;
        System.out.println();

    }

   }
    public static void main (String args[]) {
        int n = 3; 

    }
    
}
