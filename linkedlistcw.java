import java.util.LinkedList;
public class linkedlistcw {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(5);
        System.out.println(ll);
        ll.removeLast();
         System.out.println(ll);
        
    }

    
}
