import java.util.*;
public class pushatbottomofstack {
    public static void addbottom(Stack<Integer> s,int a){
        if(s.isEmpty()){
            s.push(a);
            return;
        }
        int top = s.pop();
        addbottom(s, a);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        addbottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
    }
}
