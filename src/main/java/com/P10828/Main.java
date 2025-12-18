package com.P10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim()); // 명령 수 입력

        int[] stack = new int[n]; // 스택 배열
        int top = 0;

        int[] out = new int[n]; // 결과 배열
        int outIdx = 0; // 출력 배열 인덱스, 출력이 발생한 경우에만 증가

        for (int i = 0; i < n; i++) { // i: 명령 n개 읽기 위해 사용
            String order = br.readLine(); // 명령 입력

            if (order.startsWith("push")) {
                String numStr = order.substring(4).trim(); // 'push N' 숫자 분리
                int num = Integer.parseInt(numStr);
                stack[top++] = num;
            } else if (order.equals("top")) {
                out[outIdx++] = (top == 0) ? -1 : stack[top-1];
            } else if (order.equals("size")) {
                out[outIdx++] = top;
            } else if (order.equals("empty")) {
                out[outIdx++] = (top == 0) ? 1 : 0;
            } else if (order.equals("pop")) {
                out[outIdx++] = (top == 0) ? -1 : stack[--top]; // top 숫자 감소
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < outIdx; i++) {
            sb.append(out[i]).append('\n');
        }
        System.out.print(sb);
    }
}