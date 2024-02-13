/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */


public class Question4 {
    public static void isValid(String s) {
       char[] arr = new char[s.length()];
       for(int i = 0;i<s.length();i++){
        arr[i] = s.charAt(i);
       }
       int count = 0;

       for(int j =0;j< arr.length;j++){
        if(arr[j]=='('){
            count++;
        }else if(arr[j]==')'){
          
                count--;
            
        }
       }
       if(count==0){
        System.out.println("Valid parenthesis sequence");
        }else{
            System.out.println("In Valid parenthesis sequence");
        }
    }

    public static void main(String args[]) {
        isValid("({}");
    }
}
