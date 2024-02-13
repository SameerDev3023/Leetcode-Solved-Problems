import java.util.Stack;

public class Question4 {
    public static boolean isValid(String s) {
        // Use a stack to keep track of open brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If the current character is an open bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // If the current character is a closing bracket, check if it matches
                // the top of the stack
                if (stack.isEmpty()) {
                    return false; // No matching open bracket
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false; // Mismatched brackets
                }
            }
        }

        // If the stack is empty at the end, all brackets are matched
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        if (isValid("(]")) {
            System.out.println("Valid parenthesis sequence");
        } else {
            System.out.println("Invalid parenthesis sequence");
        }
    }
}
