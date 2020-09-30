package com.qdw.guanglianda2;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.guanglianda2
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/9 0009 18:27
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int C = sc.nextInt();
//        sc.nextLine();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = (int)Math.ceil(sc.nextDouble());
            arr[i][1] = sc.nextInt();
        }
        int[] dp = new int[C+1];
        for (int i = 0; i < n; i++) {
            int w = arr[i][1];
            int c = arr[i][0];
            for (int j = C; j>=c; j--) {
                dp[j] = Math.max(dp[j],dp[j-c]+w);
            }
        }
        System.out.println(dp[C]);
    }
}
