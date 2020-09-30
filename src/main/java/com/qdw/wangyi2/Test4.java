package com.qdw.wangyi2;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @PackageName:com.qdw.wangyi2
 * @ClassName: Test4
 * @Description:
 * @date: 2020/9/13 0013 10:41
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sA = sc.nextLine().split(" ");
        String[] sB = sc.nextLine().split(" ");
        int sum = sA.length+ sB.length;
//        sc.nextLine();
        int n = sc.nextInt();
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            setA.add(a);
            setB.add(b);
        }
        System.out.println(Math.min(setA.size(),setB.size()));
    }
}
