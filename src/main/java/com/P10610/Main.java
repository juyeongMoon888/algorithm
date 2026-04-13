package com.P10610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int sum = 0;
        boolean hasZero = false;

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);

            if (c == '0') {
                hasZero = true;
            }

            sum += c - '0'; // ① 문자 숫자를 실제 정수로 바꾸고 ② 계산
        }

        if (!hasZero || sum % 3 != 0) {
            System.out.println(-1);
            return; // main() 종료
        }

        // 내림차순 정렬
        char[] arr = n.toCharArray(); // 문자 배열로 변환
        Arrays.sort(arr); // 오름차순

        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse();

        System.out.println(sb);
    }
}
