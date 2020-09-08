package com.qdw.pinduoduo;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.pinduoduo
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/1 0001 19:34
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            s = sc.nextLine().split(" ");;
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
//            if(arr[i][0]<0 && arr[i][1]>=0){
            if(arr[i][0]<0){
                m -= arr[i][0];
                arr[i][0] = 0;
            }
        }
        int[] dp = new int[m+1];
        for (int i = 0; i < n; i++) {
            int w = arr[i][0];
            int v = arr[i][1];
            if (w<0){
                continue;
            }
            for (int j = m; j >= w; j--) {
                dp[j] = Math.max(dp[j],dp[j-w]+v);
            }
        }
        System.out.println(dp[m]);
    }
}
