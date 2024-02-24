// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

package LeetcodeStringQuestions;

/**
 * IsPalindromeString
 */
public class IsPalindromeString {

    public static boolean isPalindrome(String s) {
        String SimpleString = s.replaceAll("[^a-zA-Z0-9]", "");
        String LowerCase = SimpleString.toLowerCase();
        StringBuilder reversedStr = new StringBuilder(LowerCase).reverse();
        return LowerCase.equals(reversedStr.toString());
       
    }
    public static void main(String args[]){
     boolean result = isPalindrome("A man, a plan, a canal: Panama");
     System.out.println(result);

    }
}