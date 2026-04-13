package com.P1343;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void appendPolyomino(StringBuilder sb, int count) {
        if (count % 2 != 0) {
            sb.setLength(0);
            sb.append("-1");
            return; // appendPolyomino만 종료
        }

        while (count >= 4) {
            sb.append("AAAA");
            count -= 4;
        }

        while (count >= 2) {
            sb.append("BB");
            count -= 2;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'X') {
                count++;
            } else {
                appendPolyomino(sb, count);

                if (sb.toString().equals("-1")) {
                    System.out.println(-1);
                    return; // main 종료
                }

                sb.append(".");
                count = 0;
            }
        }

        appendPolyomino(sb, count);

        if (sb.toString().equals("-1")) {
            System.out.println(-1);
        } else {
            System.out.println(sb);
        }
    }
}
