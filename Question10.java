//  Plus one in the last array of element
public class Question10 {

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Add one to the last digit
        digits[n - 1] += 1;

        // Check for carry and propagate it if necessary
        for (int i = n - 1; i > 0 && digits[i] >= 10; i--) {
            digits[i] = digits[i] % 10;
            digits[i - 1] += 1;
        }

        // Check if the most significant digit has a carry
        if (digits[0] >= 10) {
            // Create a new array with one additional element to accommodate the carry
            int[] newArr = new int[n + 1];
            newArr[0] = 1; // Set the most significant digit to 1
            newArr[1] = digits[0] % 10; // Set the remainder as the first digit
            for (int i = 2; i < n + 1; i++) {
                newArr[i] = digits[i - 1]; // Copy the remaining digits
            }
            return newArr;
        }

        return digits;
    }

    public static void main(String args[]) {
        int[] digits = {1, 3, 5};
        Question10 obj = new Question10();
        int[] result = obj.plusOne(digits);
        
        // Print the result
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
