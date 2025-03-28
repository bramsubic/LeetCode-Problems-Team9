/*
The problem requires merging two sorted linked lists into a single sorted linked list. 
The approach is similar to the merge step in the Merge Sort algorithm.

Since both lists are already sorted, we traverse both lists simultaneously, always adding the smaller of the two current nodes to our result list.
If one list is fully processed before the other, we simply attach the remaining part of the non-empty list to the merged list.
Finally, we return the merged list.

*/