package com.qdw.pinduoduo;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.pinduoduo
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/1 0001 19:50
 */
public class Test2 {
    static int[] dx = new int[]{1,-1,0,0};
    static int[] dy = new int[]{0,0,1,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[][] g = new int[n][m];
        for (int i = 0; i < n; i++) {
            s = sc.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                g[i][j] = Integer.parseInt(s[j]);
            }
        }
        int max = 0;
        boolean[][] visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j]==0){
                    boolean flag = true;
                    int cur = dfs(g,i,j,visit,flag);
                    max = Math.max(max,cur);
                    if (cur==10){
                        System.out.println(i+"  "+j);
                    }
                }
            }
        }
        System.out.println(max);

    }
    public static int dfs(int[][] g,int i,int j,boolean[][] visited,boolean flag){
        if(i<0||j<0||i>=g.length||j>=g[0].length||visited[i][j]){
            return 0;
        }else if (g[i][j]==0){
            if (flag){
                flag = false;
            }else {
                return 0;
            }
        }
        visited[i][j] = true;
        int res = 1;
        for (int k = 0; k < 4; k++) {
            res += dfs(g,i+dx[k],j+dy[k],visited,flag);
        }
        visited[i][j] = false;
        return res;
    }
}
