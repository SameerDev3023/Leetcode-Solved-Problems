// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

public class Question9 {
    
    public int searchInsert(int[] nums, int target) {
      
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] >= target) {
                return i; // Return index where target should be inserted
            }
        }
        return nums.length;
    }
    public static void main(String args[]){

      
        int[] arr = {1,3,5,6};
        Question9 obj = new Question9();
        int result = obj.searchInsert(arr, 2);
        System.out.println(result);
    }
    
}
