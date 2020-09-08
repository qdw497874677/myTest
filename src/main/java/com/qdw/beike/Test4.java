package com.qdw.beike;

import java.util.*;


public class Test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[][] g = new int[n][n];
        Queue<Data> queue = new PriorityQueue<>((a,b)->{
            return a.c-b.c;
        });
        int res = 0;
        for (int i = 0; i < m; i++) {
            s = sc.nextLine().split(" ");
            int c = getC(Integer.parseInt(s[2]),Integer.parseInt(s[3]));
            res += c;
            int l = Integer.parseInt(s[0])-1;
            int r = Integer.parseInt(s[1])-1;
            g[l][r] = c;
            queue.add(new Data(l,r,c));
        }
        while(m>=n-1){
            Data poll = queue.poll();
            g[poll.l][poll.r] = 0;
            if (check(g)){
                res -= poll.c;
                m--;
            }else {
                break;
            }
        }
        System.out.println(res);
        System.out.println(getC(2,1));
    }
    public static boolean check(int[][] g){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < g.length; i++) {
            set.add(i);
            dfs(g,i,set);
            if (set.size()==g.length){
                return true;
            }
            set.clear();
        }
        return false;
    }
    public static void dfs(int[][] g,int r,Set<Integer> set){
        if (set.contains(r)){
            return;
        }
        for (int j = 0; j < g.length; j++) {
            if (g[r][j]>0){
                dfs(g,j,set);
            }
        }
    }

    public static int getC(int a,int b){
        int i = b;
        int t1 = 1;
        while(i>0){
            t1 *= a;
            a--;
            i--;
        }
        int t2 = 1;
        while(b>0){
            t2 *= b;
            b--;
        }
        return t1/t2;
    }
    static class Data{
        int l;
        int r;
        int c;
        public Data(int l,int r,int c){
            this.l = l;
            this.r = r;
            this.c = c;
        }
    }
}
