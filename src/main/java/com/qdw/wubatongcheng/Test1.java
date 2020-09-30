package com.qdw.wubatongcheng;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.wubatongcheng
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/14 0014 19:44
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] g = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(dfs(g,i,j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    public static boolean dfs(int[][] g,int i,int j){
        if(i<0||j<0||i>=g.length||j>=g[0].length||g[i][j]==0){
            return false;
        }
        g[i][j] = 0;
        for (int k = 0; k < 4; k++) {
            dfs(g,i+dx[k],j+dy[k]);
        }
        return true;
    }
}
