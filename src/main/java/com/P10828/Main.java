package com.P10828;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        //스택 저장소
        int[] stack = new int[n];
        int top = 0;

        //결과 저장소
        int[] out = new int[n];
        int outIdx = 0;

        for (int i = 0; i < n; i++) {
            String order = br.readLine();

            if (order.startsWith("push")) {
                String numStr = order.substring(4).trim();
                int num = Integer.parseInt(numStr);
                stack[top++] = num;
            } else if (order.equals("top")) {
                out[outIdx++] = (top == 0) ? -1 : stack[top-1];
            } else if (order.equals("size")) {
                out[outIdx++] = top;
            } else if (order.equals("empty")) {
                out[outIdx++] = (top == 0) ? 1 : 0;
            } else if (order.equals("pop")) {
                out[outIdx++] = (top == 0) ? -1 : stack[--top];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < outIdx; i++) {
            sb.append(out[i]).append('\n');
        }
        System.out.print(sb);
    }
}