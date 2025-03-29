/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        // initialize resultHead --> start of the result list
        // set currentNode to resultHead to build the result list
        // set overflow to 0 to track carryover
        ListNode resultHead = new ListNode(0); 
        ListNode currentNode = resultHead; 
        int overflow = 0; 
        
        // go through both lists as long as either list has nodes left
        while (list1 != null || list2 != null) {
            // get the current values and default to 0 if the list is exhausted
            int x = (list1 != null) ? list1.val : 0; 
            int y = (list2 != null) ? list2.val : 0;
            
            // calculate the sum 
            int sum = x + y + overflow;
            
            // update overflow for the next place value
            overflow = sum / 10;
            
            // create a new node with the value of sum % 10 --> current digit
            currentNode.next = new ListNode(sum % 10);
            
            // move the currentNode to the new node
            currentNode = currentNode.next;
            
            // move to the next nodes in lists
            if (list1 != null) list1 = list1.next;
            if (list2 != null) list2 = list2.next;
        }
        
        // if any remaining overflow create a new node with value
        if (overflow != 0) {
            currentNode.next = new ListNode(overflow);
        }
        
        // return result list starting from the node after resultHead
        return resultHead.next;
    }
}


/*
Pseudocode:
- create a dummy node to act as the head of the result list
- init a pointer to build the result list starting from dummy node
- set carry to 0 holds overflow value

traverse Lists
- while both lists are not traversed
  - get the values of the current nodes
  - ff a list is traversed use 0 for that lists value

calc sum and carry amount
- sum = x + y + carry
- calc new carry --> carry = sum // 10
- calc current digit --> digit = sum % 10
- the carry is the quotient when dividing by 10
- the current digit is the remainder when dividing by 10

create + link node
- create node with the calculated digit
- link node to current nodes next pointer
- move current pointer to new node

Handle remaining carry over
- After loop ends if remaining carry create new node with
value and link to result list

Return Result
- return next dummy node as head of result list

*/

