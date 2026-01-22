import java.util.*;

public class Stackinto2 {
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
       
    // }
    //  static class Stack {
    //        static Node head = null;
    //         public static boolean isEmpty(){
              
    //                 return head == null;
                
    //         }
    //         // push 
    //         public static void push(int data){
    //             Node newnode = new Node(data);
    //             if(isEmpty()){
                   
    //                 head = newnode;
    //                 return;

    //             }
    //             newnode.next = head;
    //             head = newnode;
    //         }
    //         // pop 
    //         public static int pop(){
    //             if(isEmpty()){
    //                 return -1;
    //             }
    //             int val = head.data;
               
    //             head = head.next;
    //             return val;
    //         }*
    //         public static int peek(){
    //             if(isEmpty()){
    //                 return -1;
    //             }
    //             int val = head.data;
    //             return val;

    //         }

    //     }
    public static void main(String args[]){
        // Stack s = new Stack();
        Stack <Integer> s = new Stack<>();
        
        s.push(3);
        s.push(2);
        s.push(1);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
        
    }
    
}
