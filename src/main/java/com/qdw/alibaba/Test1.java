package com.qdw.alibaba;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.alibaba
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/15 0015 19:02
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        StringBuilder s1 = new StringBuilder();
        s1.append(0);
        StringBuilder s2 = new StringBuilder();
        s2.append(1);
        System.out.println(Math.min(dfs(s1,a,b),dfs(s2,a,b)));
    }
    public static int dfs(StringBuilder sb,String a,String b){
        if (!a.contains(sb)&&!b.contains(sb)){
            return sb.length();
        }
        sb.append(0);
        int dfs0 = dfs(sb, a, b);
        sb.deleteCharAt(sb.length()-1);
        sb.append(1);
        int dfs1 = dfs(sb, a, b);
        sb.deleteCharAt(sb.length()-1);
        return Math.min(dfs0,dfs1);
    }
}
