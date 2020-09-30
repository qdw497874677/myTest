package com.qdw.wangyi2;

import java.util.Map;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.wangyi2
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/13 0013 10:16
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int[][] g = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int t = sc.nextInt();
            g[a-1][b-1] = t;
//            g[b-1][a-1] = t;
//            System.out.println(g[a-1][b-1]);
        }
        int sum = 0;
        boolean[] visited = new boolean[n];
        sum = dfs(g,k-1,visited);
        visited[k-1] = true;
        for (boolean b : visited) {
            if (!b){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(sum);

    }
    public static int dfs(int[][] g,int index,boolean[] visited){

        int sum = 0;
        for (int i = 0; i < g[0].length; i++) {
            if(!visited[i]&&g[index][i]!=0){
                visited[i] = true;
                sum = Math.max(g[index][i] + dfs(g,i,visited),sum) ;
            }
        }
        return sum;
    }
}
