package com.programmers.P12909;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();

        // 테스트 케이스
        System.out.println(sl.solution("()()"));   // true
        System.out.println(sl.solution("(())()")); // true
        System.out.println(sl.solution(")()("));   // false
        System.out.println(sl.solution("(()("));   // false
    }
}
class Solution {
    boolean solution(String s) {
        int balance = 0;
        int n = s.length();
        String[] stack = new String[n];
        String[] out = new String[n];

        for (int i = 0; i < n; i++) {
            stack[i] = Arrays.toString(s.split(""));
        }

        return balance == 0;
    }
}
