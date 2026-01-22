package com.P1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        String[] strArr = new String[N];
        for (int i = 0; i < N; i++) {
            strArr[i] = br.readLine();
        }

        Arrays.sort(strArr, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
        });

        StringBuilder sb = new StringBuilder();
        String prev = "";
        for (int i = 0; i < N; i++) {
            if (strArr[i].equals(prev)) continue; // 중복이면 아래 건너뜀

            prev = strArr[i]; // prev 갱신
            sb.append(strArr[i]).append('\n'); // 맨 마지막에도 \n 하나 더 붙지만 백준은 보통 문제없음
        }

        System.out.print(sb);
    }
}
