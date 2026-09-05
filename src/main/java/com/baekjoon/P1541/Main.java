package com.baekjoon.P1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); // 55-50+40

        int result = 0;
        StringBuilder sb = new StringBuilder();
        boolean isFirstGroup = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '-') {
                String group = sb.toString();
                int groupSum = sumGroup(group);

                if (isFirstGroup) {
                    result += groupSum;
                    isFirstGroup = false;
                } else {
                    result -= groupSum;
                }

                sb.setLength(0);// 안하면 어떤일이 벌어질까? //


            } else {
                sb.append(c);
            }
        }

        String group = sb.toString();
        int groupSum = sumGroup(group);

        if (isFirstGroup) {
            result += groupSum;
        } else {
            result -= groupSum;
        }

        System.out.println(result);
    }
    static int sumGroup(String group) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < group.length(); i++) {
            char c = group.charAt(i);

            if (c == '+') {
                sum += Integer.parseInt(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }

        sum += Integer.parseInt(sb.toString());
        return sum;
    }

}
