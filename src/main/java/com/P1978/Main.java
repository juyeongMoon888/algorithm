package com.P1978;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄: 수의 개수 N개 앞/뒤 공백제거 -> String -> int 변환
        int n = Integer.parseInt(br.readLine().trim());

        // 두번째 줄: 값이 기본 구분자로 나뉘어 st에 토큰으로 저장됨 (예-"010-1234-5678" 구분자 "-" ->"
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
