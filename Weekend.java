import java.util.*;
public class Weekend {


    public static void main (String[] args){

    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String day;

    switch (a) { 
        case 1:
        day = "Monday";
        break;
        case 2:

        day = "Tuesday";

        break;
        case 3: 
        day = "Wednesday";
        break;

        case 4:
        day = "Thursday";
        break;
        case 5:
        day = "Friday";
        break;
        case 6:
        day = "Sataurday";
        break;
        case  7: 
        day = "Sunday";
        break;
        default :
        day = "invalid";

        

    }
    System.out.println(day);
    
    
}
}
