package com.qdw.qunaer;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.qunaer
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/23 0023 20:09
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s1 = sc.nextLine().split(" ");
        String[] s2 = sc.nextLine().split(" ");
        int[][] dp = new int[n+1][n+1];
        for (int i = 1; i < n + 1; i++) {

            for (int j = 1; j < n + 1; j++) {

                if(s1[i-1].equals(s2[j-1])){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[n][n]);
    }
}
