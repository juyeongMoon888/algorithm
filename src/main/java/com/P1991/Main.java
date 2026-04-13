package com.P1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] tree = new int[26][2];
    static StringBuilder sb = new StringBuilder();

    // 트리 구조 저장
    // 행: 노드 (26개) 알파벳 갯수
    // 열: 자식 정보 [0]왼쪽 [1]오른쪽

    static void pre(int node) { //0//1
        if (node == -1) return;
        sb.append((char) ('A' + node)); // 'A'(65) + 0 = 65 다시 캐스팅 (char)65 -> 'A'
        pre(tree[node][0]); //0,0//
        pre(tree[node][1]); //
    }

    static void in(int node) {
        if (node == -1) return;
        in(tree[node][0]);
        sb.append((char)('A' + node));
        in(tree[node][1]);
    }

    static void post(int node) {
        if (node == -1) return;
        post(tree[node][0]);
        post(tree[node][1]);
        sb.append((char)('A' + node));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        // 자식 없음을 -1로 초기화
        for (int i = 0; i < 26; i++) {
            tree[i][0] = -1;
            tree[i][1] = -1;
        }

        // 입력: 부모, 왼쪽, 오른쪽
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // ABC //BD. //E.. //F.G
            // .charAt(0) : 문자열의 첫 글자를 문자로 꺼냄
            // - 'A' : 문자끼리 빼면, 문자 코드(아스키 코드)로 계산돼서 'A'를 0으로 만드는 기준점 역할
            // 'A' - 'A' = 0
            // 'B' - 'A' = 1
            // 둘째 줄부터 N개의 줄에 걸쳐 각 노드와 그의 왼쪽 자식 노드, 오른쪽 자식 노드가 주어진다.
            int parent = st.nextToken().charAt(0) - 'A'; //0 //1 //2 //4 //5 //3 //6
            char l = st.nextToken().charAt(0); //왼쪽 자식 보장 BC로 들어왔을때 B만 뽑기 위해?
            char r = st.nextToken().charAt(0); //오른쪽 자식 보장 C //. //F //. //G //. //.

            // 자식 노드가 없는 경우 .으로 표현한다.
            tree[parent][0] = (l == '.') ? -1 : (l - 'A'); // B-A = 1 //3 //4 //-1 //-1 //-1 //-1
            tree[parent][1] = (r == '.') ? -1 : (r - 'A'); // C-A = 2 // -1 //5 //-1 //6 //-1 //-1
        }

        pre(0);
        sb.append('\n');

        in(0);
        sb.append('\n');

        post(0);
        sb.append('\n');

        System.out.println(sb);
    }
}
