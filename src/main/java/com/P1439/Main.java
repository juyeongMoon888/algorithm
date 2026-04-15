package com.P1439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int zeroGroup = 0;
        int oneGroup = 0;

        if (s.charAt(0) == '0') {
            zeroGroup++;
        } else {
            oneGroup++;
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i-1)) {
                if (s.charAt(i) == '0') {
                    zeroGroup++;
                } else {
                    oneGroup++;
                }
            }
        }
        System.out.println(Math.min(zeroGroup, oneGroup));

    }
}
