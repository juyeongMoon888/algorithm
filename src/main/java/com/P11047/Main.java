package com.P11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄
        StringTokenizer st = new StringTokenizer(br.readLine().trim()); //10, 4200

        int N = Integer.parseInt(st.nextToken()); // 동전 종류
        int K = Integer.parseInt(st.nextToken()); // 총 금액

        Integer[] coin = new Integer[N];

        // 두번째 줄
        for (int i = 0; i < N; i++) {
            //한줄 씩 읽고 앞 뒤 공백 제거 후 배열에 담아주기
            coin[i] = Integer.parseInt(br.readLine().trim());
        }

        int cnt = 0;
        // K(총 금액)에서 해당 동전 몇개로 쓸 수 있을지 K / coin
        for (int i = N - 1; i >= 0; i--) {
            if (coin[i] <= K) {
                cnt += K / coin[i];
                K %= coin[i];
            }
            if (K == 0){ break;
            }
        }
        System.out.println(cnt);
    }
}
