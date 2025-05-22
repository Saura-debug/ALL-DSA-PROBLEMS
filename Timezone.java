import java.util.*;
public class Timezone {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int hours = sc.nextInt();
        int min = sc.nextInt();

        min += 30;
        hours += 5;
        if(min >= 60) {
            hours++;
            min = min - 60;
        


        };


        if(hours+5 >= 24) {
            day++; 
            hours = hours - 24;
        }

        System.out.println((day) + " " + (hours) + " " + (min) );

    }
    
}
