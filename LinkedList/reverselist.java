package LinkedList;
import java.util.Stack;

public class reverselist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
       

    }
     public static Node head;
        public static Node tail;
        public static int size;

        public static void addfirst(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = tail = newnode;
                size++;
                return;
            }
            newnode.next = head;
            head = newnode;
            size++;
        }

        public static void addlast(int data){
            Node newnode = new Node(data);
            if(head == null ){
                head = tail = newnode;
                size++; 
                return; 
            }
            tail.next = newnode;
             tail = newnode;
            size++; 
        }
        public static void print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
        public static void fillstack(Stack<Integer> st){
            Node temp = head;
            while(temp!=null){
                st.push(temp.data);
                temp = temp.next;
            }
            
        }
        public static void  filllistreverse(Stack<Integer> st){
            Node temp = head; 
            while (temp!=null) {
                temp.data = st.peek();
                st.pop();
                temp = temp.next;
                
            }

        }

        public static Node recurrevers(Node head){
            if(head==null || head.next == null){
                return head;
            }
            Node newnode = recurrevers(head.next);
            Node front = head.next;
            front.next = head;
             head.next = null; 
              return newnode;
        }
       
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        reverselist ll = new reverselist();
        ll.addfirst(8);
        ll.addfirst(7);
        ll.addfirst(6);
        ll.addfirst(0);
        
       
        
         Node reversed = ll.recurrevers(head);

        // Printing reversed list
        while (reversed != null) {
            System.out.print(reversed.data + " ");
            reversed = reversed.next;
        }
        System.out.println();
        // for checking the LL is cyclic or not,we can use hashmap and store the Node with 1 as a value, for every put we will check the codition that if Node is already present in the Hashmap then we wpuld immediatly return true,otherwise false would be correct, it would have TC O(n) and SC (N)
        // the second approch would slow and fast, it would have TC O(n)
        // for finding  starting point of the cyclic linklist, we could use the hasmmap, like we did in checking of linklist, is linklist  cyclic or not
       

      

        
    }
    
}
