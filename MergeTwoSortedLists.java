/* You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list. */

/*
PSEUDOCODE
 * check if any of the two lists is empty
 * get the length of each of the lists
 * initialize a new list to hold the values of the sorted list
 * loop through the two lists concurrently, comparing the values at each index to each other
 * at the first loop, append the smaller of the two numbers to the new list as its first item
 * store the larger of the two numbers to a temporary variable called temp
 * at each subsequent looping iteration, the values from the two lists are compared to the temp variable
 * if the values are less than temp, 
 *      they get added to the list
 * if the values are more than temp, 
 *      temp gets added to the new list and the larger value gets assigned to temp
 * this goes on until either both lists are schemed through. 
 * if the two lists are of unequal lengths, 
 *       the comparison of the two lists will continue until the end of the shorter list, then the rest of the longer list gets appended to the new list since it is already sorted
 * 
 * 
 */