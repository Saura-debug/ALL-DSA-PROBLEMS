public class doublelinkedlist {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
       

        
    }
    public static Node head;
        public static Node tail;
        public static int size;

        public void addfirst(int data){
            Node newdata = new Node(data);
            size++;
        if(head == null){
            head = tail = newdata;
            return;
           
        }
        head.prev = newdata;
        newdata.next = head;
        newdata.prev = null;
        head = newdata;

    }
    public void print(){
        if(head == null){
            System.out.println("doublell is empty");
        }
        else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.next;
                
            }
        }
    }
    public int removefirst(){
        if(head == null){
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int nav = head.data;
            head = tail = null;
            size--;
            return nav;

        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;

        
    } public void addlast(int data){
        Node newnode = new Node(data);
        Node temp = head;
        if(temp == null){
            head  = tail = newnode;
            size++;
            return;
        }
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
        newnode.next  = null;
        size++;
        


    }
    public int removealast(){
        Node temp = head;
        if(temp == null) {
           System.out.println("this is the empty linked list");
        }
        if(temp.next == null){
            int val = temp.data;
            head = tail = null;
            return val;
        }
        while (temp.next != null) {
            temp = temp.next;
            
        }
        int data = temp.data;
        tail = temp.prev;
        temp.prev.next = null;
        temp.prev = null;
        
        return data;
    }
    
    public static void main(String args[]){
        doublelinkedlist ndll = new doublelinkedlist();
        ndll.addfirst(5);
        ndll.addfirst(4);
        ndll.addfirst(3);
        ndll.addfirst(2);
        ndll.addfirst(1);
        ndll.addlast(6);
        ndll.removealast();
        ndll.print();
        
        
        

    }
}
