/*
 * Write a Java program to check if a given word is a palindrome or not.
 *  A palindrome is a word, phrase, number, or other sequence of characters 
 * that reads the same forward and backward, ignoring spaces, punctuation, and capitalization. 
 * Implement a method isPalindrome that takes a string word as input and returns true 
 * if the word is a palindrome, and false otherwise.
 */


import java.util.Scanner;

public class Question7 {

    public static boolean Palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word for check palindrome or not");
        String inputString = sc.nextLine();
        int Len = inputString.length();
        String Reverse = "";
        for(int i = Len-1;i>=0;i--){
            Reverse += inputString.charAt(i);
        }
        if(inputString.equalsIgnoreCase(Reverse)){
            return true;
        }else{
            return false;
        }

        
    }
    public static void main(String args[]){
       boolean Result =  Palindrome();
       System.out.println(Result);
       if(Result==true){
        System.out.println("Your Word is Palindrome");
       }else{
        System.out.println("Your Word is Not Palindrome");
       }
      

    }
    
}
