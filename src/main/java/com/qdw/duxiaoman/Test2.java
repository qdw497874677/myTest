package com.qdw.duxiaoman;


import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @PackageName:com.qdw.duxiaoman
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/20 0020 20:28
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = 0;
            int y = 0;
            sc.nextLine();
            char[][] g = new char[n][m];
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                for (int j = 0; j < m; j++) {
                    g[i][j] = s.charAt(j);
                    if (g[i][j]=='@'){
                        x = i;
                        y = j;
                    }
                }
            }
            int dfs = dfs(g, x, y, 0);
            System.out.println(dfs==Integer.MAX_VALUE?-1:dfs);
        }

    }
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int min = Integer.MIN_VALUE;
    public static int dfs(char[][] g,int i,int j,int count){
        if (i<0 || j<0 || i>=g.length || j>=g[0].length){
            min = Math.min(min,count);
            return count;
        }
        if (g[i][j]=='#'){
            return Integer.MAX_VALUE;
        }
        if (g[i][j]=='*'){
            count++;
            if (count==min){
                return -1;
            }
        }
        int res = Integer.MAX_VALUE;
        Set<int[]> set = new HashSet<>();
        for (int k = 0; k < 4; k++) {
            set.add(new int[]{i+dx[k],j+dy[k]});
        }
        for (int k = 0; k < 4; k++) {
            int[] a = getTarget(g,set);
            if (a!=null){
                char c = g[i][j];
                g[i][j]='#';
                res = Math.min(res,dfs(g,a[0],a[1],count));
                g[i][j]=c;
            }else {
                for (int[] ints : set) {
                    char c = g[i][j];
                    g[i][j]='#';
                    res = Math.min(res,dfs(g,ints[0],ints[1],count));
                    g[i][j]=c;
                }
            }
        }

//        for (int k = 0; k < 4; k++) {
//            char c = g[i][j];
//            g[i][j]='#';
//            res = Math.min(res,dfs(g,i+dx[k],j+dy[k],count));
//            g[i][j]=c;
//        }

        return res;
    }
    public static int[] getTarget(char[][] g, Set<int[]> set){
        for (int[] ints : set) {
            int i = ints[0];
            int j = ints[1];
            for (int k = 0; k < 4; k++) {
                if (i<0||j<0||i>=g.length ||j>=g[0].length){
                    int[] res  = new int[]{i,j};
                    set.remove(res);
                    return res;
                }
            }
            for (int k = 0; k < 4; k++) {
                if (g[i][j]=='.'){
                    int[] res  = new int[]{i,j};
                    set.remove(res);
                    return res;
                }
            }
        }
        return null;

    }

}
