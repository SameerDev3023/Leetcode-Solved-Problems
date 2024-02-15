/*
 * . Remove Duplicates from Sorted Array
 * 
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * 
 */

public class Question5 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // Count of unique elements
        int n = nums.length;

        for (int i = 1; i < n; i++) {
           
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Store the unique element at the next position
                
                k++; // Increment the count of unique elements
                
            }
        }
        return k; // Return the count of unique elements
    }

    public static void main(String args[]) {
        // Example arrays
        int[] nums1 = {1, 2, 3, 3, 4, 4, 5};

        // Create an object of the class
        Question5 obj = new Question5();
        // Call the method using the object
        int result = obj.removeDuplicates(nums1);

        // Display the result
        System.out.println("Length of array after removing duplicates: " + result);
    }
}
