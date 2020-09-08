package com.qdw.lianxi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test3
 * @Description:
 * @date: 2020/8/13 0013 21:46
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[]{1,4,16,64};
        int[] dp = new int[1024-n+1];
        Arrays.fill(dp,1024-n+1);
        dp[0] = 0;
        for (int i : arr) {
            for (int j = i; j < 1024 - n+1; j++) {
                dp[j] = Math.min(dp[j],dp[j-i]+1);
            }
        }
        System.out.println(dp[1024-n]);
    }
}
