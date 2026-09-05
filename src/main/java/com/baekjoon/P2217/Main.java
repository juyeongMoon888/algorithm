package com.baekjoon.P2217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] rope = new int[N];

        for (int i = 0; i < N; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        // 정렬
        Arrays.sort(rope); // 최소값이 앞으로 온다.
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = (Math.max(max, rope[i] * (N - i))); // 가벼운 로프는 개수만큼 여러개를 사용할 수 있지만, 무거운 로프일수록 가벼운 로프들이 따라가지 못한다.
        }

        System.out.println(max);
    }
}
