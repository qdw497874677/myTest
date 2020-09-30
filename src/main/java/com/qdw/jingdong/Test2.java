package com.qdw.jingdong;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.jingdong
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/17 0017 19:40
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int si = 0;
            int sj = 0;
            sc.nextLine();
            char[][] g = new char[n][m];
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                for (int j = 0; j < m; j++) {
                    g[i][j] = s.charAt(j);
                    if (g[i][j]=='S'){
                        si = i;
                        sj = j;
                    }
                }
            }
//            Queue<int[]> queue = new LinkedList<>();
//            queue.add(new int[]{si,sj});
//            while (!queue.isEmpty()){
//                int[] poll = queue.poll();
//                int i = poll[0];
//                int j = poll[1];
//                if (i<0||j<0||i>=g.length||j>=g[0].length||i)
//            }
            if (dfs(g,si,sj)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    public static boolean dfs(char[][] g,int i,int j){
        if (i<0||j<0||i>=g.length||j>=g[0].length||g[i][j]=='#'){
            return false;
        }
        if (g[i][j]=='E'){
            return true;
        }
        for (int k = 0; k < 4; k++) {
            g[i][j] = '#';
            if (dfs(g,i+dx[k],j+dy[k])){
                return true;
            }
            g[i][j] = '.';
        }
        return false;
    }
}
