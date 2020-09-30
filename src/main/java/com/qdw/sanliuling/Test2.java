package com.qdw.sanliuling;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.sanliuling
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/26 0026 20:06
 * 3 3 1 3
 * 1 2 99
 * 2 3 99
 * 1 3 100
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int[][] g = new int[n][n];
        while(m-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            g[a-1][b-1] = c;
            g[b-1][a-1] = c;
        }

        boolean[][] visited = new boolean[n][n];
        List<Integer> list = new ArrayList<>();
        dfs(g,visited,s-1,t-1,0,list);
        int res = 0;
        for (Integer integer : list) {
            res = Math.max(res,integer);
        }
//        System.out.println(min);
//        System.out.println(list);
        System.out.println(res);
    }
    public static int min = Integer.MAX_VALUE;
    public static boolean dfs(int[][] g, boolean[][] vi, int index, int target, int sum, List<Integer> list){
        if (index==target){
//            System.out.println("!!!");
            return true;
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((int[] a,int[] b)->{
            return a[1]-b[1];
        });
        for (int i = 0; i < g.length; i++) {
            if(g[index][i]>0 && !vi[index][i]){
                heap.add(new int[]{i,g[index][i]});
//                System.out.println(i+":"+g[index][i]);
            }
        }
//        System.out.println("index:"+index);
        while (!heap.isEmpty()){
            int[] poll = heap.poll();
            vi[index][poll[0]] = true;
            vi[poll[0]][index] = true;
//            System.out.println("!:"+poll[0]);
            sum += poll[1];
            list.add(poll[1]);
            boolean dfs = dfs(g, vi, poll[0], target, sum, list);
            if (dfs){
                return dfs;
            }
            list.remove(list.size()-1);
            sum -= poll[1];
            vi[index][poll[0]] = false;
            vi[poll[0]][index] = false;
        }
        return false;
//        for (int i = 0; i < g.length; i++) {
//            if(g[index][i]>0 && !vi[index][i]){
//                vi[index][i] = true;
//                sum += g[index][i];
//                dfs(g,vi,i,target,sum);
//                sum -= g[index][i];
//                vi[index][i] = false;
//            }
//        }
    }


}
