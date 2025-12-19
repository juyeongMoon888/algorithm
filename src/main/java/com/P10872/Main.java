package com.P10872;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int facts = 1;

        for (int i = 1; i <= n; i++) {
            facts *= i;
        }
        System.out.print(facts);
    }
}
