import java.util.*;
public class Buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

    


    

   
   if(a%15==0){

    System.out.println("FIZZBUZZ");

   }
   else if (a%5==0) {
    System.out.print("BUZZ");
   }
   else if (a%3==0){
    System.out.println("FIZZ");

   }
   else {
    System.out.println(a);
   }
    
   }
   
} 