package com.P10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] que = new int[n];
        int[] out = new int[n];
        int outIdx = 0;
        int size = 0;

        for (int i = 0; i < n; i++) {
            String order = br.readLine();

            if (order.startsWith("push")) {
                String numStr = order.substring(4).trim();
                int num = Integer.parseInt(numStr);
                que[size++] = num;
            } else if (order.equals("front")) {
                out[outIdx++] = (size == 0) ? -1 : que[0];
            } else if (order.equals("back")) {
                out[outIdx++] = (size == 0) ? -1 : que[size-1];
            } else if (order.equals("empty")) {
                out[outIdx++] = (size == 0) ? 1 : 0;
            } else if (order.equals("pop")) {
                if (size == 0) {
                    out[outIdx++] = -1;
                } else {
                    out[outIdx++] = que[0];
                    for (int j = 1; j < size; j++) {
                        que[j-1] = que[j];
                    }
                    size--;
                }
            } else if (order.equals("size")) {
                out[outIdx++] = size;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < outIdx; i ++) {
            sb.append(out[i]).append('\n');
        }
        System.out.println(sb);
    }
}
