class Solution {
    public double average(int[] salary) {
        // Use Selection Sort to sort the salary array in ascending order
        // We use Selection Sort because it is simple and works well for small arrays
        int n = salary.length;
        
        // Selection Sort Algorithm to sort the array
        for (int i = 0; i < n - 1; i++) {
            // Initialize minIndex as the index of the current element in the array
            int minIndex = i;
            
            // Find the min element in the unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                // compare current element at index j to current min element at minIndex
                // if smaller update minIndex to new smallest elements index
                if (salary[j] < salary[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = salary[i];
            salary[i] = salary[minIndex]; 
            salary[minIndex] = temp; 
        }
        
        // set sum to 0
        // sum will store sum of salaries excluding the smallest and largest salary
        int sum = 0;
        
        // Loop through the sorted array excluding the first and last elements 
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i]; // Add the current salary to the sum
        }
        
        // Calculate and return the average of the remaining salaries
        // Return the average
        return (double) sum / (salary.length - 2); 
    }
}

/*
Pseudocode
- get length of salary array 

- Sort the Array -> Selection Sort
- start with first element and treat it as the current min
- look through rest of the array to find smaller element
- if smaller element found update min to that elements index
- when smallest element found swap with current element

Calculate the Sum no min/max Salaries
- Set sum to 0 --> total salary
- loop through sorted array skip first and last elements
- add to the sum

Calculate and Return Average
- divide sum by the num of elements added to get the average
*/