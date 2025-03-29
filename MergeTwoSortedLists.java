/*
Pseudocode

Handle Edge Cases:
    if one list if null, return the other

Initialize Pointers:
    Create a dummy node to store the merged list.
    Maintain a temp pointer that helps build the merged list.

Merge Lists by Comparing Nodes:
    Traverse both lists.
    Compare the current node values of l1 and l2:
    Append the smaller node to tempList.
    Move the corresponding list pointer to the next node.
    If values are equal, 
        append both nodes and move both pointers.
    Attach Remaining Nodes:
    If one list is exhausted before the other, 
        attach the remaining nodes of the non-empty list to tempList.
    
Return the Merged List:

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeTwoSortedLists {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode resultList = new ListNode(0);
        ListNode tempList = resultList;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                while (l2 != null) {
                    ListNode newNode = new ListNode(l2.val);
                    tempList.next = newNode;
                    tempList = tempList.next;
                    l2 = (l2 != null) ? l2.next : null;
                }
            } else if (l2 == null) {
                while (l1 != null) {
                    ListNode newNode = new ListNode(l1.val);
                    tempList.next = newNode;
                    tempList = tempList.next;
                    l1 = (l1 != null) ? l1.next : null;
                }
            } else {
                if (l1.val < l2.val) {
                    ListNode newNode = new ListNode(l1.val);
                    tempList.next = newNode;
                    tempList = tempList.next;
                    l1 = (l1 != null) ? l1.next : null;
                } else if (l2.val < l1.val) {
                    ListNode newNode = new ListNode(l2.val);
                    tempList.next = newNode;
                    tempList = tempList.next;
                    l2 = (l2 != null) ? l2.next : null;
                } else {
                    ListNode newNodeL1 = new ListNode(l1.val);
                    tempList.next = newNodeL1;
                    tempList = tempList.next;
                    ListNode newNodeL2 = new ListNode(l2.val);
                    tempList.next = newNodeL2;
                    tempList = tempList.next;
                    l1 = (l1 != null) ? l1.next : null;
                    l2 = (l2 != null) ? l2.next : null;
                }

            }

        }
        tempList.next = null;
        return resultList.next;
    }
}