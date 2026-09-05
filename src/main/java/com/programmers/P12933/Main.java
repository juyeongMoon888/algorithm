package com.programmers.P12933;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        long result = solution.solution(118372);
        System.out.println(result);
    }
}

class Solution {
    public long solution(long n) {
        // 여기에 실제 풀이
        String str = String.valueOf(n); // 숫자 -> 문자 변환
        char[] arr = str.toCharArray();
        Arrays.sort(arr); // 오름차순 정렬

        // 오름차순된 배열 값을 StringBuilder로 reverse 조작하기
        StringBuilder sb = new StringBuilder(new String(arr)).reverse();

        // 다시 문자열로 만들고 long으로 내보내기
        return Long.parseLong(sb.toString());
    }
}
