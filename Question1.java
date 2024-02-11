import java.util.HashMap;

class Question1 {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the indices of the elements
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement (the number needed to reach the target)
            int complement = target - nums[i];
            
            // Check if the complement exists in the hashmap
            if (map.containsKey(complement)) {
                // If found, return the indices of the current element and its complement
                return new int[] { map.get(complement), i };
            }
            
            // If not found, add the current element and its index to the hashmap
            map.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        // Create an instance of Question1 class
        Question1 obj = new Question1();
        
        // Example usage:
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 18;
        int[] result1 = obj.twoSum(nums1, target1);
        System.out.println("Example 1 Output: [" + result1[0] + ", " + result1[1] + "]");
    }
}
