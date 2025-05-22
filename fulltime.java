import java.util.*;
public class fulltime {
    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
         int Year = sc.nextInt();
         int Month = sc.nextInt();
         int Day = sc.nextInt();
         int hours = sc.nextInt();
         int min = sc.nextInt();

         hours+=5;
         min+=30;

         if(min >= 60) {
            hours++;
            min-=60;
         }
         if(hours >= 24) {
            Day++;
            hours-=24;

         }
         if(Day >=30) {

            Month++;
            Day = 1;
         }

         if(Month > 12){
            Year++;
            Month = 1;
         }




    }

}
