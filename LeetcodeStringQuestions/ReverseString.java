package LeetcodeStringQuestions;

public class ReverseString {
    public char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap elements at left and right positions
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move left pointer to the right and right pointer to the left
            left++;
            right--;
        }
        return s;
    }

    public static void main(String args[]) {
        ReverseString obj = new ReverseString();
        char[] charArray = {'H','a','n','n','a','h'};
        char[] result = obj.reverseString(charArray);
        for (char c : result) {
            System.out.println(c);
        }
    }
}
