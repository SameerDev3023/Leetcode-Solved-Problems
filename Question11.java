
// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal 
// substring
//  consisting of non-space characters only.

public class Question11 {
    public static int lengthOfLastWord(String s) {

        String Trimstr = s.trim();
        String[] WordsArry = Trimstr.split(" ");
        String LastWord = "";
        int len = WordsArry.length;
        for(int i = 0;i<=len;i++){
            LastWord = WordsArry[len-1];
        }
       System.out.println(LastWord);
       return LastWord.length();
    }
    public static void main(String args[]){
       int result = lengthOfLastWord("Hello World  ");
       System.out.println(result);
    }
}
