
/*
Pseudocode

Initialize Variables:
    Get the length of the input array (n).
    Create a result array of size n to hold the squared values.

Square Each Element:
    Loop through the input array from index 0 to n - 1:
        Square each element.
        Store the result in the corresponding index of the result array.

Sort the Result:
    Use a sorting method to sort the result array in non-decreasing order.

Return the Result:
    Return the sorted result array containing squared values.
*/

import java.util.Arrays;

public class Squares {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        Squares sq = new Squares();
        int[] squaredSorted = sq.sortedSquares(nums);
        System.out.println(Arrays.toString(squaredSorted));
    }
}