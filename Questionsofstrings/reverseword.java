package Questionsofstrings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class reverseword {
    public static String reverseword(String all){
         List<String> words = new ArrayList<>();
         StringBuilder word = new StringBuilder();
         for(int i = 0; i<all.length(); i++){
            if(all.charAt(i) == ' '){
                word.append(all.charAt(i));
            }
            else if(word.length()>0){
                words.add(word.toString());
                word.setLength(0);
            }
            if(word.length()>0){
            words.add(word.toString());
         }
         Collections.reverse(words);
         return String.join(" ", words);
         } 
         return "";

    }
    public static void main(String[] args) {
        String all = "A man without cock is called the unsullied";
        System.out.println(reverseword(all));    }
    
}
