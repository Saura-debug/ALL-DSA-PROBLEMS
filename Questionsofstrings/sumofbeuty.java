package Questionsofstrings;

public class sumofbeuty {
    public static int beauty(String s){
        for(int i = 0; i<s.length(); i++){
            for(int j = 0; j<s.length();j++){
                int max =1;
                int min = 1;
                for(int k = i+1; k<=j; k++){
                    if(s.charAt(k) ==s.charAt(i)){
                        max++;
                    }


                }
            }
        }
    }
    public static void main(String[] args) {
        String s = "aaacca";
        System.out.println(beauty(s));

    }
    
}
