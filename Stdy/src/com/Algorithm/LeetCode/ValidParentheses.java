package com.Algorithm.LeetCode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() == 0) return true;
        Stack<Integer> stack = new Stack<>();
        char[] sc = s.toCharArray();
        for (char c : sc) {
            switch (c) {
                case '(':
                    stack.push(1);
                    break;
                case '{':
                    stack.push(2);
                    break;
                case '[':
                    stack.push(3);
                    break;
                case ')': {
                    if (!stack.empty() && stack.pop() == 1) break;
                    else return false;
                }
                case '}': {
                    if (!stack.empty() && stack.pop() == 2) break;
                    else return false;
                }
                case ']': {
                    if (!stack.empty() && stack.pop() == 3) break;
                    else return false;
                }
                default:
                    return false;
            }
        }
        return stack.empty();
    }


    public static void main(String[] args) {
        ValidParentheses test = new ValidParentheses();
        System.out.print(test.isValid("({}])"));
    }
}
