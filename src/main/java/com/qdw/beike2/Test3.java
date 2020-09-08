package com.qdw.beike2;

import java.util.*;

/**
 * @PackageName:com.qdw.beike2
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/7 0007 15:22
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            t--;
            String[] s = sc.nextLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);
//            System.out.println("n:"+n+" m:"+m+" k:"+k);
            Map<Integer, Set<Integer>> map = new HashMap<>();
            for(int j=0;j<m;j++){
                String[] s1 = sc.nextLine().split(" ");
                Set<Integer> set = new HashSet<>();
                for (int i = 0; i < k; i++) {
                    set.add(Integer.parseInt(s1[i]));
                }
                map.put(j+1,set);
            }
            method(map,n,m);
        }
    }
    public static void method(Map<Integer, Set<Integer>> map,int n,int m){
        for (int i = 0; i < m; i++) {
            dfs(map,n,m,i+1,0);
        }
        System.out.println(count);
    }
    static int count = 0;
    public static void dfs(Map<Integer, Set<Integer>> map,int n,int m,int cur,int index){
        if(index==n){
            count++;
            return;
        }
        Set<Integer> set = map.get(cur);
        for (int i = 0; i < m; i++) {
            if(!set.contains(i+1)){
                dfs(map,n,m,i+1,index+1);
            }
        }
    }
}
