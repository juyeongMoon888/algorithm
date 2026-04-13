/*
package com.P1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        // 전위 순회: 뿌리 -> 왼쪽 하위 - > 오른쪾 하위
        // 중위 순회: 왼쪽 하위 -> 뿌리 -> 오른쪽 하위
        // 후위 순회: 왼쪽 하위 -> 오른쪽 하위 -> 뿌리
        // 노드 개수 입력
        // 부모 왼쪽하위 오른쪽하위 순서로 들어온다.
        // 자식 노드가 없는 경우에는 .으로 표현: 뿌리가 될 수 없다.
        int N = Integer.parseInt(st.nextToken());
        char tree [][] = new Character();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            tree[i][0] = st.nextToken().charAt(0);
            tree[i][1] = st.nextToken().charAt(0);
            tree[i][2] = st.nextToken().charAt(0);
        }

    }
}
*/
