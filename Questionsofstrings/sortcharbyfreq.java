package Questionsofstrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class sortcharbyfreq {
    public static String back(String a){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : a.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1 );
        }
        List<Character> list = new ArrayList<>(map.keySet());
    
         Collections.sort(list,(c,b)-> map.get(b) - map.get(c));
         
        StringBuilder result = new StringBuilder();
        for(char c : list){
            int freq = map.get(c);
            for(int i = 0; i<freq; i++){
                result.append(c);
            }
        }
        return result.toString();
        


    }
    public static void main(String[] args) {
        System.out.println(back("robstarkttk"));

        
    }
    
}
