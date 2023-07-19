// You have a string consisting of zeros, ones and asterisks (*). Consider the following operation:

// Choose any two adjacent positions in the string;
// If one of them is 0, and the other one is 1, remove these two digits from the string.
// Find the length of the smallest string that can be obtained after applying this operation multiple times.

// Example

// For s = "01010", the output should be
// solution(s) = 1;
// For s = "111000", the output should be
// solution(s) = 0;
// For s = "111*000", the output should be
// solution(s) = 7.
// Input/Output

// [execution time limit] 3 seconds (java)

// [memory limit] 1 GB

// [input] string s

// Guaranteed constraints:
// 2 ≤ s.length ≤ 105.

// [output] integer

// [Java] Syntax Tips

// // Prints help message to the console
// // Returns a string
// // 
// // Globals declared here will cause a compilation error,
// // declare variables inside the function instead!
// String helloWorld(String name) {
//     System.out.println("This prints to the console when you Run Tests");
//     return "Hello, " + name;
// }

// 1234
// int solution(String s) {

// }

// TESTS
// CUSTOM TESTS


import java.util.*;

import java.util.Stack;


public class Main {

    static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '*' && !stack.isEmpty()) {

                    stack.push('*');
                
             } else if (!stack.isEmpty() && stack.peek()!='*' && stack.peek() != c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        return stack.size();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(solution("01010")); // Output: 1
        System.out.println(solution("111000")); // Output: 0
        System.out.println(solution("000*11")); // Output: 7
    }
}