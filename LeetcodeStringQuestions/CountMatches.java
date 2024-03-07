package LeetcodeStringQuestions;
import java.util.List;

public class CountMatches {
    public int countMatch(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = -1; // Initialize the index of the ruleKey
        
        // Determine the index of the ruleKey
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }
        
        // Count the matches based on the ruleKey and ruleValue
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        CountMatches cm = new CountMatches();
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "phone"),
                List.of("phone", "gold", "iphone")
        );
        String ruleKey = "type";
        String ruleValue = "phone";
        int result = cm.countMatch(items, ruleKey, ruleValue);
        System.out.println("Output: " + result);
    }
}
