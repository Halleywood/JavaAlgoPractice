import java.util.*;

class LinkedList{
    Node head = null; 
    Node tail = null;

    public LinkedList(Node n){
        this.head = n; 
        this.tail = n; 
    }

    public void appendToTail(Node n){
        Node currentNode = this.head;
        while(currentNode.next !=null){
            currentNode = currentNode.next;
        }

        currentNode.next = n; 
        this.tail = n; 
    }

    public void prependToHead(Node n){
        n.next = this.head; 
        this.head = n; 
    }

    public void printList(){
        Node currentNode = this.head; 
        StringBuilder sb = new StringBuilder(); 
        while(currentNode != null){
           sb.append(currentNode.data + " --> "); 
            currentNode=currentNode.next; 
        }
        System.out.println(sb.toString());
    }
}