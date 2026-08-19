/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        Node next = null;
        
       while(curr!=null)
       {
          next = curr.next;  // 1. Save the next node (so you don't lose it)
          curr.next = prev;  // 2. Reverse the link (point backward)

          prev = curr;       // 3. Move prev one step forward
          curr = next; 
       }
     
     return prev;   
    }
}
