class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        // Sort the array using Insertion Sort
        // It works well for small arrays
        // It sorts in place dont use extra memory
        for (int i = 1; i < n; i++) {
            int key = nums[i]; 
            int j = i - 1;
            
            // Shift elements greater than key 1 position to the right
            while (j >= 0 && nums[j] > key) {
            // Move larger element to the right
                nums[j + 1] = nums[j]; 
                j--; 
            }
            
            // Insert key in correct position
            nums[j + 1] = key;
        }

        // Find the missing number
        // Since array is sorted missing num will be 1st num
        // that does not match index
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) { 
                return i; 
            }
        }

        // If all num in place missing num is n last
        return n;
    }
}

/*
Pseudocode 
- get the length of the input array n
- sort the Array using Insertion Sort
- start from the second element in the array
- set the current element as the key
- compare the key with the element before it
- if the element before key is larger, shift larger element right
- keep shifting elements right until you find right spot for key
- insert the key into correct position

- Find the Missing Number
- if element at index i doesn't match i, return i 

- If No Missing Number is Found
- if all elements match indices missing number is n
*/
