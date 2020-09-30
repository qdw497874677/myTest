package com.qdw.meituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.meituan
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/20 0020 10:07
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        int sx = 0;
        int sy = 0;
        char[][] g = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j)=='S'){
                    sx = i;
                    sy = j;
                    g[i][j] = '+';
                }else {
                    g[i][j] = s.charAt(j);
                }
            }
        }
        char[] chars = sc.nextLine().toCharArray();
        int res = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('O',p);
        map.put('X',-q);
        map.put('+',0);
        for (int i = 0; i < chars.length; i++) {
//            System.out.print(chars[i]+": ");
            if (chars[i]=='W'){
                if (!(sx-1<0 || g[sx-1][sy]=='#')){
                    res += map.get(g[--sx][sy]);
                }
            }else if (chars[i]=='S'){
                if (!(sx+1>=n || g[sx+1][sy]=='#')){
                    res += map.get(g[++sx][sy]);
                }
            }else if (chars[i]=='A'){
                if (!(sy-1<0 || g[sx][sy-1]=='#')){
                    res += map.get(g[sx][--sy]);
                }
            }else if (chars[i]=='D'){
                if (!(sy+1>=m || g[sx][sy+1]=='#')){
                    res += map.get(g[sx][++sy]);
                }
            }
            chage(sx,sy,g);
        }
        System.out.println(res);
    }
    public static void chage(int i,int j,char[][] g){
        if (g[i][j]=='X' || g[i][j]=='O'){
            g[i][j] = '+';
        }
    }

}
