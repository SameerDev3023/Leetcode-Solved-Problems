/*Question:

Write a Java program to generate the Fibonacci series up to a given limit. 
The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones,
 usually starting with 0 and 1. Implement a method generateFibonacci that takes an integer limit as input and prints the 
Fibonacci series up to that limit. */

public class Question6 {
    
    public static int Fibonacci(){

        int prev = 0;
        int prev2 = 1;
        for(int i = 0; i < 20; i++){ // Change condition to i < 20
            int fib = prev + prev2;
            System.out.println(fib);
            prev = prev2;
            prev2 = fib;
        }
        return prev2; // Return the 20th term
    }
    
    public static void main(String args[]){
        int result = Fibonacci();
        System.out.println("20th term of Fibonacci sequence: " + result);
    }
}
