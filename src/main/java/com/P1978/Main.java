package com.P1978;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int order = Integer.parseInt(st.nextToken());
            if (order < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j*j <= order; j++) {
                if (order % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
