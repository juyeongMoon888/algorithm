package com.P7785;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        Set<String> set = new HashSet<>();
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            if(status.equals("enter")) {
                set.add(name);
            } else if(status.equals("leave")) {
                set.remove(name);
            }
        }
        List<String> li = new ArrayList<String>(set);
        Collections.sort(li, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < li.size(); i++) {
            sb.append(li.get(i)).append('\n');
        }

        System.out.println(sb);
    }
}
