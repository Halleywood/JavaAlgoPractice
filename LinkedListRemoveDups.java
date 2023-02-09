import java.util.*;
class LinkedListRemoveDups{
    
    
    static void removeDups(LinkedList list){
        HashMap<Integer, Integer> possibleDups = new HashMap<>(); 
        Node placeholder = list.head; 
        Node current = placeholder.next; 
        possibleDups.put(placeholder.data, 1);
        while(current != null){
            if(possibleDups.containsKey(current.data)){
                if(current.next == null){
                    placeholder.next = null; 
                    list.tail = placeholder; 
                }
                else{
                    placeholder.next = current.next; 
                }

        }
            else{
                possibleDups.put(current.data, 1); 
                placeholder = placeholder.next;
                
                
        }
        current=current.next; 
        }     
    }

    static void removeDupsOption2(LinkedList list){
        Node current = list.head;
        while(current.next != null){
            Node runner = current; 
            while(runner.next != null){
                if(runner.next.data == current.data){
                    runner.next = runner.next.next; 
                }
                else{
                    runner = runner.next; 
                }
              
            }
            current = current.next;  
        }
    }

    public static void main(String[]args){

        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(11);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(4);
        Node node7 = new Node(11);
        LinkedList list = new LinkedList(node1);
        list.appendToTail(node2); 
        list.appendToTail(node3); 
        list.appendToTail(node4); 
        list.appendToTail(node5); 
        list.appendToTail(node6); 
        list.appendToTail(node7); 
        // list.prependToHead(node5); 
        list.printList(); 
        // System.out.println(list.tail.data);
        // removeDups(list);
        removeDupsOption2(list);
        list.printList(); 
        // System.out.println(list.tail.data);
        
    }


}