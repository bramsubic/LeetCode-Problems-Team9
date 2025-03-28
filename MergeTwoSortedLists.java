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