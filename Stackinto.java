import java.util.ArrayList;

public class Stackinto {
    static class stack{
       static ArrayList<Integer> list = new ArrayList<>();
        public static boolean Isempty(){
            return list.size() == 0;
        }
        public static void Push(int data){
                  list.add(data);
        }
        public static int pop(){
            if(list.size() == 0){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }
        public static int peek(){
            if(list.size() == 0){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    
}
