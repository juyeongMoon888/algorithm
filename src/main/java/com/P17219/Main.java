package com.P17219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        
        int N = Integer.parseInt(st.nextToken()); //16
        int M = Integer.parseInt(st.nextToken()); //4

        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine().trim()); //이게 어려움이었다.
            String site = st.nextToken();
            String password = st.nextToken();
            map.put(site, password);
        }

        for (int i = 0; i < M; i++) {
            String x = br.readLine(); // 대상이 되는 사이트 문자열
            if (map.containsKey(x)) {
                System.out.println(map.get(x));
            }
        }

    }
}
