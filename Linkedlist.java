import java.util.LinkedList;

public class Linkedlist {
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
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }
    public static void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;

    }
    public void print(){
        
        
        Node temp = head;
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        while(temp != null){
        System.out.print(temp.data+" ");
        temp = temp.next;
        }
        System.out.println();
    }
    public static void add(int idx,int data){
        Node newnode = new Node(data);
        Node temp = head;
        if(idx == 0){
            addfirst(data);
            return;
        }
        size++;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
          newnode.next = temp.next;
        temp.next = newnode;
      
    }
    public static int rvefirst(){
        if(size == 0){
            return Integer.MAX_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        else{
        Node oldhead = head;
        int val = head.data;
    
        head = head.next;
        oldhead.next = null;
        size--;
        
        return val;
        }

    }
    public static int rvelast(){
        if(size == 0){
            return Integer.MAX_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;

            return val;
        }
        else {
        Node temp = head;
      
        for(int i = 0; i<size-2; i++){
            temp = temp.next;


        }
        int val=temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val; 
    }
    
    }
    public static int search(int key){
        // it has the TC and SC equal to O(n) , SC is O(n) cause of the stack 
        int i =0;
        Node temp = head;
        while (temp !=null) {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
            
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recusearch(int key ){
        return helper(head,key);
    }
    public void reverse(){
        Node prev = null; 
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void nthremovefromback(int n){
        Node temp = head;
        int sz = 0;
        while (temp!=null) {
            temp = temp.next;
            sz++;
            }

            if(sz == n){
                 head = head.next;
                return;
            }
            Node temp1 = head;
            for (int j = 1; j<sz-n; j++){
                temp1 = temp1.next;
            }
            temp1.next = temp1.next.next;
            return;
    }
    // slow and fast funtion for finding the the mid 
   public Node mid(){
    Node low = head;
    Node fast = head;
    while (fast !=null && fast.next !=null) {
        low = low.next;
        fast = fast.next.next;
        
    }

    return low;
   }
   public boolean pallindrome(){
    Node mid = mid();
    Node prev = null;
    Node curr = mid;
    Node next;
    while (curr!=null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        
    }
    Node right = prev;
    Node left = head;
    while (right !=null) {
        if(right.data != left.data){
            return false;
        }
        right = right.next;
        left = left.next;
        
    }
    return true;
   }
   public static boolean iscylic(){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
        }
    }
    return false;
   }

    public static void main(String args[]){
      Linkedlist ll = new Linkedlist();
     
      
      ll.addfirst(1);
     
      ll.addfirst(2);
       
    //   ll.add(1,6);
      ll.addlast(8);
   
      ll.addlast(0);
      System.out.println(iscylic());
     
    
      System.out.println(ll.size);
    }

    
}
