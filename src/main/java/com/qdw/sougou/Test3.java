package com.qdw.sougou;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @PackageName:com.qdw.sougou
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/25 0025 19:42
 */
public class Test3 {
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        Interval[] conn = new Interval[]{new Interval(0,1),new Interval(0,2),new Interval(2,-1),new Interval(2,1)};
        System.out.println(test3.trim(1, 1, conn));
    }

    public Interval trim (int N, int M, Interval[] conn) {
        // write code here
        boolean[] used = new boolean[conn.length];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < conn.length; i++) {
            List<List<Integer>> res = new ArrayList<>();
            if (!used[i] && conn[i].start==0){
                used[i] = true;
                ArrayList<Integer> list = new ArrayList<>();
                dfs(conn,res,used,conn[i].end,list);
                used[i] = false;
            }
//            System.out.println(res);
            for (List<Integer> re : res) {
                for (Integer integer : re) {
                    set.add(integer);
                }
            }
        }
        int sum = 0;
        for (Integer integer : set) {
            sum += integer;
        }

        return new Interval(set.size(),sum);

    }
    public void dfs(Interval[] conn,List<List<Integer>> res,boolean[] used,int index, List<Integer> list){
        for (int i = 0; i < conn.length; i++) {
            if (!used[i] && index==conn[i].start){
                used[i] = true;
                list.add(conn[i].start);
                if (conn[i].end==-1){
                    res.add(new ArrayList<>(list));
                    return;
                }
                dfs(conn,res,used,conn[i].end,list);
                list.remove(list.size()-1);
                used[i] = false;
            }
        }
    }
}
