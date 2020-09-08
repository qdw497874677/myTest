package com.qdw.lianxi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test3
 * @Description:
 * @date: 2020/8/13 0013 21:46
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int min = 0;
        int sum = 0;
        int pre = 0;
        for (int i = 0; i < n; i++) {
            sum += pre - arr[i];
            pre = arr[i];
            min = Math.min(min, sum);
        }
        System.out.println(-1*min);
    }

}
