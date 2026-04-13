package com.P2875;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()); // 6 3 2 통으로 들어간다.
        int N = Integer.parseInt(st.nextToken()); // 6
        int M = Integer.parseInt(st.nextToken()); // 3
        int K = Integer.parseInt(st.nextToken()); // 2

        // 팀을 만들 수 있는 구조인가?
        // Math.min(N/2, M)
        // 가능 총 인원 수 N + M - K
        // 인원 자체가 충분한가? (N + M - K)/3

        System.out.println(Math.min(Math.min(N / 2, M), ((N + M - K)/3)));
    }
}
