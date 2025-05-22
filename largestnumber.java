import java.util.*;
public class largestnumber {
    public static int getlargestnumber(int number[]) {
        int larger = Integer.MIN_VALUE;
        int Small = Integer.MAX_VALUE;
        for(int i = 0; i < number.length; i++) {
            if (larger < number[i]) {
                larger = number[i];
            }
            if (Small > number[i]) {
                Small = number[i];
            }
        }
        System.out.println("Smallest value is  " + Small);
        return larger;
    
        
                

            
        
        

    }                      
    public static void main(String args[]) {
        int number[] = {12,5,8,15,32,44,25,59};
        int big = getlargestnumber(number);
        System.out.println("largest number  " + big);
        

    }
    
}
