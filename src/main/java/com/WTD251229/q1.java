package com.WTD251229;

import java.util.Arrays;

/**
 * k개를 선택하는 최소 비용(가장 작은 k개의 합)이 예산을 초과하면,
 * k개 이상을 선택하는 모든 조합은 예산을 초과한다.
 */
class Solution {
    public int solution(int[] d, int budget) {

        // 배열을 오름차순 정렬
        Arrays.sort(d);

        int answer = 0;
        int sum = 0;

        // 작은 것 부터 하나씩 더하기
        for (int cost : d) {
            if (sum + cost > budget) break;
            sum += cost;
            answer++;
        }

        return answer;
    }
}