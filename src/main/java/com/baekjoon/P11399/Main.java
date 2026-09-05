package com.baekjoon.P11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 인원 수

        StringTokenizer st = new StringTokenizer(br.readLine().trim()); // 공백 제거한 ["3", "1", "4", "3", "2"] 들어간다.
        // 시간이 가장 적게 걸리는 사람 순서대로 서게 한다.
        // 꺼낼때는 st.nextToken()

        // st는 정렬하지 못하니, ① 배열에 담아야한다.
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬 오름차순
        Arrays.sort(arr);
        // 1 2 3 3 4

        int sum = 0;
        int result = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i]; // 1 // 3
            result += sum; // 1
        }

        System.out.println(result);
    }
}
