package Questionsofstrings;
public class Smallestpath {
    public static float path(String Dir){
        int x = 0; 
        int y = 0;
        for(int i =0; i<Dir.length(); i++){
           if(Dir.charAt(i)=='N'){
            y++;

           }else if(Dir.charAt(i)=='S'){
            y--;
           }
           else if(Dir.charAt(i)=='E'){
            x++;
           }
           else {
            x--;
           }
        }
        int X = x*x;
        int Y = y*y;

        return (float)Math.sqrt(X+Y);
    

    }

    public static void main(String[] args) {
        System.out.println(path("NS"));
      
    }
}