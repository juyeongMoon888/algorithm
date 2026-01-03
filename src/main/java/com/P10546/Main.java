package com.P10546;

import java.io.*;
import java.util.*;

public class Main {
    /*public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        Map<String, Integer> countMap = new HashMap<>();

        String[] inputs = new String[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = br.readLine().trim();
        }

        for (String name : inputs) {
            // 해당 key로 value가 이미 있으면 값 가져와서 +1, 없으면 0에서 +1
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }

        String[] completion  = new String[N-1];
        for (int i = 0; i < N-1; i++) {
            completion[i] = br.readLine().trim();
        }

        for (String runner : completion) {
            // 해당 key가 가진 value를 꺼내서 1을 빼고, 그 결과를 다시 같은 key에 넣는다.
            countMap.put(runner, countMap.get(runner) -1);
        }

        StringBuilder sb = new StringBuilder();
        //countMap에 들어있는 모든 key를 하나씩 꺼내서 key에 넣어라
        for (String key : countMap.keySet()) {
            if (countMap.get(key) > 0) {
                sb.append(key);
            }
        }
        System.out.println(sb);
    }*/
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        Map<String, Integer> countMap = new HashMap<>();


        for (int i = 0; i < N; i++) {
            String input = br.readLine().trim();
            // 해당 key로 value가 이미 있으면 값 가져와서 +1, 없으면 0에서 +1
            countMap.put(input, countMap.getOrDefault(input, 0) + 1);
        }

        for (int i = 0; i < N-1; i++) {
            String runner = br.readLine().trim();
            // 해당 key가 가진 value를 꺼내서 1을 빼고, 그 결과를 다시 같은 key에 넣는다.
            countMap.put(runner, countMap.get(runner) -1);
        }

        StringBuilder sb = new StringBuilder();
        //countMap에 들어있는 모든 key를 하나씩 꺼내서 key에 넣어라
        for (String key : countMap.keySet()) {
            if (countMap.get(key) > 0) {
                sb.append(key);
            }
        }
        System.out.println(sb);
    }
}
