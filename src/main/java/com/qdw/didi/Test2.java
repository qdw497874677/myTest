package com.qdw.didi;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.didi
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/13 0013 19:41
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
            int sum = 0;
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int cost = sc.nextInt();
                if (cost>k){
                    continue;
                }
                union(parent,a-1,b-1);

            }
            boolean flag = false;
            int p = find(parent,0);
            for (int i = 1; i < n; i++) {
                if (find(parent,i)!=p){
                    sb.append("No\n");
                    flag = true;
                    break;
                }
            }
            if (!flag){
                sb.append("Yes\n");
            }
        }
        System.out.println(sb);

    }
    public static void union(int[] parent,int a,int b){
        parent[find(parent,a)] = find(parent,b);
    }
    public static int find(int[] parent,int index){
        while (parent[index]!=index){
            parent[index] = parent[parent[index]];
            index = parent[index];
        }
        return index;
    }
}
