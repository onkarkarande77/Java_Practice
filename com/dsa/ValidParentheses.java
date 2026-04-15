package com.dsa;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // if stack empty → invalid
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // check matching
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // stack should be empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s)); // true
    }
}