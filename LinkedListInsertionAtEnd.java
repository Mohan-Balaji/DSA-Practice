public class LinkedListInsertionAtEnd {
     public static class Node{ 
            int data;
            Node next ; 
            Node(int data){
                this.data=data;
                this.next=next;
            }
        }
    
    class Solution {

       
        // Function to insert a node at the end of the linked list.
        Node insertAtEnd(Node head, int x) {
            Node newNode = new Node(x);
        if(head==null){
           return newNode;
        } 
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }    
        temp.next=newNode;
      return head;  
    } 
    }
    public static void main(String[] args) {
        LinkedListInsertionAtEnd ll = new LinkedListInsertionAtEnd();
        // ll.insertAtEnd(5);
    }
}
